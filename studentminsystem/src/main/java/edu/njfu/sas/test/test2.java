package edu.njfu.sas.test;

import edu.njfu.sas.dao.UserDao;
import edu.njfu.sas.dao.impl.StudentDaoImpl2;
import edu.njfu.sas.dao.impl.UserDaoImpl;
import edu.njfu.sas.model.User;
import edu.njfu.sas.util.C3p0Util;
import edu.njfu.sas.util.DbcpUtil;

import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.Properties;

public class test2 {
    public static void main(String[] args) throws IOException, SQLException {
//        Properties properties=new Properties();
//        InputStream in = new test2().getClass().getClassLoader().getResourceAsStream("dbcpconfig.properties");
//        properties.load(in);
//        System.out.println(properties.getProperty("password"));
//        System.out.println(properties.getProperty("url"));
//        System.out.println(DbcpUtil.getDataSource()==null);
//        System.out.println(C3p0Util.getConnection()==null);
        //System.out.println(new StudentDaoImpl2().getAllStudent());
       // System.out.println(new StudentDaoImpl2().totalRecords());
     //   System.out.println(new StudentDaoImpl2().getStudentByPaging(1,4));
        UserDao dao=new UserDaoImpl();
        User u=new User("zhangsan","123456");
        System.out.println(dao.checkLogin(u));
    }}