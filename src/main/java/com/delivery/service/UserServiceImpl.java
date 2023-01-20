package com.delivery.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.delivery.dao.UserDAO;
import com.delivery.dto.Join;

@Service
public class UserServiceImpl implements UserService {
   
	/* UserDAO interface에 선언 한 메소드(join, overlapCheck) implements */
	@Autowired
    private UserDAO userDAO;
    
    @Override
    public void join(Join join) {
    	userDAO.join(join);
    }
    
    @Override
    public int overlapCheck(String value, String valueType) {
    	return userDAO.overlapCheck(value, valueType);
    }
}