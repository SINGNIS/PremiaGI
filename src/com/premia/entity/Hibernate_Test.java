package com.premia.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Hibernate_Test  {

	public static void mainee(String[] args) {
		UserEntity user=new UserEntity();
		user.setUser_first_name("nishikant singh");
		user.setUser_password("1234");
		user.setUser_confirmpassword("1234");
		
		PolicyEntity policy=new PolicyEntity();
		policy.setPolNo("P/ENG/00001/");
		policy.setCreatedByUserName("Nishikant Singh");
		policy.setUser(user);
		
		
		SessionFactory sessionfactory = new Configuration().configure().buildSessionFactory();
		Session session=sessionfactory.openSession();
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
		session.close();
		
	}

}

