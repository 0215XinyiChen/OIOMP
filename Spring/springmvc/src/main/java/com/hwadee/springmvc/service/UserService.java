package com.hwadee.springmvc.service;

import com.hwadee.springmvc.entity.User;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.Date;

@Service
public class UserService {
    public User regUser(String username){
        User user = new User();
        Calendar calendar = Calendar.getInstance();
        user.setId(calendar.get(Calendar.YEAR) + (int) Math.random()*10000);
        user.setUsername(username);
        user.setAddress("123456");
        user.setBirthdate(new Date());
        return user;
    }

}
