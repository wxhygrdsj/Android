package edu.njfu.sas.test;
import java.io.*;

public class CR{
    private String msg;
    private String code;
    public CR(String code) {
        this.code = code;
    }
    private static Process process ;//执行子进程
    public void setCode(String code) {
        this.code = code;
    }

    public static class RuntimeInput implements Runnable{
        @Override
        public void run() {
            BufferedReader br = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String content = null;
            try {
                while((content = br.readLine()) != null){
                    System.out.println(content);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    public void test(){
        String className = null; //类名
        String classStr = null;
        BufferedWriter bw = null;
        try{
            classStr = code.substring(code.indexOf("public class"),code.indexOf("{")).toString();//获取类名字符串
            String[] classStrArray = classStr.split("\\s{1,}");//按空格分开
            if(classStrArray.length!=3){
                msg="编译失败：格式不符合规范，请检查类名是否正确(如：public class YouClassName{})";
            }
            else{
                className = classStrArray[classStrArray.length-1];
                File sourceFile = new File(className+".java");
                if(sourceFile.exists()){
                    sourceFile.delete();
                }
                FileWriter fr = new FileWriter(sourceFile);
                bw = new BufferedWriter(fr);
                bw.write(code);
                bw.close();
                fr.close();

                Runtime runtime = Runtime.getRuntime();
                process = runtime.exec("cmd");
                Thread.sleep(1000);
                bw = new BufferedWriter(new OutputStreamWriter(process.getOutputStream()));
                bw.write("javac "+className+".java \n");
                bw.flush();
                bw.write("java "+className+" \n");
                bw.close();

                Thread runtimeInput = new Thread(new RuntimeInput());
                runtimeInput.start();

                Thread.sleep(1000);
                msg="编译成功";

            }
        }
        catch(Exception e){
            e.printStackTrace();
            msg="格式不符合规范，请检查类名是否正确(如：public class YouClassName{}).错误信息:"+e.getMessage();

        }
        System.out.println(msg);
        RuntimeInput R= new RuntimeInput();
        R.run();
    }

//    @Override
//    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
//            throws ServletException, IOException {
//        //String code = req.getParameter("code");//获取页面参数
//        String code ="package edu.njfu.sas.test;\n" +
//                "public class gelo {\n" +
//                "\tpublic static void main(String[] args) {\n" +
//                "\t\tSystem.out.print(\"hello world\");\n" +
//                "\t}\n" +
//                "\n" +
//                "}";
//
//    }
//
//
//
//    public static void main(String[] args){
//        String s="public class t { public static void main(String[] args){ System.out.println(\"helo\"); } }";
//        System.out.println(s);
//        CR h=new CR(s);
//        h.test();
//
//    }
}
