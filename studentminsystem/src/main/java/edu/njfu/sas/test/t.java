package edu.njfu.sas.test;

public class t {
    public static void main(String[] args){
        String s="public class t { public static void main(String[] args){ System.out.println(\"helo\"); } }";
        CR cr=new CR(s);
        cr.test();
    }
}
