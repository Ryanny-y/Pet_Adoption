package main.controller;

import main.dao.UserDao;
import main.model.User_Model;

public class UserController {

    private final UserDao userDao = new UserDao();
    
    public void loginUser(String email, String password) {
        userDao.loginUser(email, password);
    }
    
    public void registerUser(String f_name, String m_name, String l_name, String email, String password ) {
        User_Model newUser = new User_Model(f_name, m_name, l_name, email, "customer", password);
        userDao.createUser(newUser);
    }
}
