package com.adam.blog.service;

import com.adam.blog.entity.User;

public interface UserService {
    User checkUser(String userName, String passWord);
}
