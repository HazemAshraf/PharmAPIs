package com.pharmacy.pharmacy_API.service;

import com.pharmacy.pharmacy_API.dao.MasterPriceRepo;
import com.pharmacy.pharmacy_API.dao.MasterRepo;
import com.pharmacy.pharmacy_API.dao.MasterStoreRepo;
import com.pharmacy.pharmacy_API.dao.UserRepo;
import com.pharmacy.pharmacy_API.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl {

    @Autowired
    private UserRepo userDAO;
//public void saveUser(User u){
//    userRepo.save(u);
//}


//    public List<ItemMaster> findAll() {
//        return masterDAO.findAll();
//    }

    public User findByUserName(String userName) {
        return userDAO.findUserByUsername(userName);
    }
    public User findByEmail(String email) {
        return userDAO.findUserByEmail(email);
    }
    public User findByUsernameOrEmail(String userName,String email) {
        return userDAO.findByUsernameOrEmail(userName,email);
    }

}
