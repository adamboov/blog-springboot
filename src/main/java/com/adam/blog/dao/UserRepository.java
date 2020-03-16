package com.adam.blog.dao;

import com.adam.blog.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsernameAndPassword(String userName, String passWord);
}
