package edu.njfu.sas.test;

import com.google.gson.Gson;
import edu.njfu.sas.dao.impl.StudentDaoImpl;
//import edu.njfu.sas.dao.impl.StudentDaoImpl2;
import edu.njfu.sas.model.Student;
import edu.njfu.sas.util.C3p0Util;
import edu.njfu.sas.util.DbcpUtil;

import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.Properties;

public class Test {
    public static void main(String[] args) throws IOException {
        //System.out.println(new StudentDaoImpl().getStudentsByName("秦齐隆"));
       /* Student s=new Student("1122111","adda","180154","男","daa","151511","dda","45");
        System.out.println(new StudentDaoImpl().saveStudent(s));*/
        //System.out.println(new StudentDaoImpl().getStudentByNo("180804217"));
        //Student s=new Student("1122111","444","674","女","12a","11","246a","45");
       // System.out.println(new StudentDaoImpl().updateStudent(s));
        //System.out.println(new StudentDaoImpl().getStudentByPaging(2,4));
       // System.out.println(new StudentDaoImpl().totalRecords());
//        Gson gson = new Gson();
//        String jsonStr = gson.toJson(new StudentDaoImpl().getAllStudent());
//        System.out.println(jsonStr);
//        Properties properties=new Properties();
//        InputStream in = new Test().getClass().getClassLoader().getResourceAsStream("dbcpconfig.properties");
//        properties.load(in);
//        System.out.println(properties.getProperty("password"));
//        System.out.println(properties.getProperty("url"));
//        properties.setProperty("username2","saffa");
//        System.out.println(properties.getProperty("username2"));
//        System.out.println(new StudentDaoImpl2().getAllStudent());
        //System.out.println(DbcpUtil.getDataSource().getConnection());
//        Properties properties=new Properties();
//        InputStream in = new Test().getClass().getClassLoader().getResourceAsStream("dbcpconfig.properties");
//        properties.load(in);
//        System.out.println(properties.getProperty("password"));
//        System.out.println(properties.getProperty("url"));

    }
}
