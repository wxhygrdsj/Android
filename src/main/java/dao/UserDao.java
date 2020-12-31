package dao;


import model.User;
import util.DBHelper;
import util.Md5Util;

import java.util.ArrayList;
import java.util.List;

public class UserDao {
    /**
     * user对象的增删改查，都在此进行
     */

    public boolean checkLogin(User user) {
        //sql statement
        String sql = "select * from tbl_user where username=? and password=?";
        //把占位符的值放到一个list中
        List<Object> params=new ArrayList<Object>();
        params.add(user.getUsername());
        //明文转密文
        String encryptPassword= Md5Util.stringToMD5(user.getPassword());
        params.add(encryptPassword);
        //创建DBHelper对象
        DBHelper dbHelper = new DBHelper();
        List<Object> query=dbHelper.query(sql,params);
        /*
        Object 是一个map对象
         */
        //System.out.println(query);
        return query.size()>0;
    }

    /*
    saveUser(User user)
     */
    public boolean saveUser(User u){
        String sql="insert into tbl_user(userName,password) values(?,?)";
        //对占位符进行赋值，保存到list
        List<Object> params=new ArrayList<>();
        params.add(u.getUsername());
        params.add(Md5Util.stringToMD5(u.getPassword()));
        //创建DBHelper
        DBHelper db=new DBHelper();
        int result=db.update(sql,params);
        return result>0;
    }
}
