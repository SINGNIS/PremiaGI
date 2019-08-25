package com.premia.service;

import java.sql.SQLException;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.premia.model.User;
import com.premia.persistence.LoginDao;
import com.premia.persistence.UserPersist;


@Service
public class UserService {
	
	@Autowired 
	UserPersist persist;
	
	public boolean validateUser(User user){
		LoginDao login=new LoginDao();
		try {
			if(login.validateUser(user)){
				return true;
			}
		} catch (SQLException e) {
			System.out.println("error at service");
			e.printStackTrace();
		}
		return false;
	}

	public void createNewUser(User user){
		LoginDao createUser =new LoginDao();
		createUser.createNewUser(user);
	}	
	
	public boolean validateUserHiber(User user){
		
		if(persist.validateUserHb(user)){
			return true;
		}
		return false;
	}
	
	public void createNewUserHiber(User user){
		persist.createNewUserHb(user);
	}
}