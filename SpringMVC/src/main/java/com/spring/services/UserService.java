package com.spring.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.dao.UserDao;
import com.spring.model.UserReg;

@Service
public class UserService {

	@Autowired
	private UserDao userDao;
	public int createUser(UserReg user) {
		return this.userDao.saveUser(user);		
	}
}
