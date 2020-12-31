package edu.njfu.sas.test;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import edu.njfu.sas.dao.UserDao;
import edu.njfu.sas.dao.impl.StudentDaoImpl;
import edu.njfu.sas.dao.impl.UserDaoImpl;
import edu.njfu.sas.model.Student;
import edu.njfu.sas.model.User;

import java.io.IOException;
import java.lang.reflect.Type;
import java.sql.SQLException;
import java.util.List;

public class stest {
    public static void main(String[] args) throws SQLException {
//        UserDao dao=new UserDaoImpl();
//        User u=new User("zhangsan","123456");
//        System.out.println(dao.checkLogin(u));
        StudentDaoImpl sdao=new StudentDaoImpl();
        List<Student> students=sdao.getAllStudent();
        String json=new Gson().toJson(students);
        System.out.println(json);
        Gson gson=new Gson();
        Type type = new TypeToken<List<Student>>() {
        }.getType();
        List<Student> stus=(List<Student>)gson.fromJson(json,type);
        for(Student s:stus){
            System.out.println(s);
        }

    }
}
