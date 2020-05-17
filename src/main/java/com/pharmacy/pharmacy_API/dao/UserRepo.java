package com.pharmacy.pharmacy_API.dao;

import com.pharmacy.pharmacy_API.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Integer> {
    public User findUserByUsername(String username);
    public User findUserByEmail(String email);
    public User findByUsernameOrEmail(String username,String email);
}
