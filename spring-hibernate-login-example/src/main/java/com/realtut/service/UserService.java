package com.realtut.service;

import com.realtut.dao.UserDao;
import com.realtut.model.Users;

public class UserService {
    private UserDao userDao;

    public boolean isUsers(String username, String password) {
        Users user = userDao.findByUserName(username);
        if (user != null && user.getPassword().equals(password)) {
            return true;
        }
        return false;
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
