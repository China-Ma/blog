package com.majiaju.service;

import com.majiaju.po.User;

public interface UserService {

    User checkUser(String username,String password);
}
