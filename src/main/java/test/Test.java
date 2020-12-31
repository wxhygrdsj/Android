package test;

import dao.UserDao;
import model.User;

public class Test {
    public static void main(String[] args){
        new UserDao().saveUser(new User("王五","123465"));
    }
}

