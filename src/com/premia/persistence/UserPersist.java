package com.premia.persistence;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.hibernate.SQLQuery;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.premia.entity.UserEntity;
import com.premia.model.User;

@SuppressWarnings("deprecation")
@Repository
public class UserPersist {
	SessionFactory sessionFact = new Configuration().configure().buildSessionFactory();

	public boolean validateUserHb(User user) {
		
		String usr = user.getUser_emailid();
		String pwd = user.getUser_password();
		
		Session session = sessionFact.openSession();
		//String hql = "from User_Details where user_emailid =:usr and user_password=:pwd";
		//query.setParameter("usr", usr);
		//query.setParameter("pwd", pwd);

		String sql = "select * from User_Details where user_emailid =:usr and user_password=:pwd";
		SQLQuery  query = session.createSQLQuery(sql);
		query.addEntity(UserEntity.class);
		query.setParameter("usr", "rahul@gmail.com");
		query.setParameter("pwd", "nishi");		
		List<User> usrdetails = query.list();
		System.out.println("usrdetails.size  "+usrdetails.size());
		session.close();
		if (usrdetails.size() < 1) {
			return false;
		} else {
			return true;
		}
	}

	public void createNewUserHb(User user) {
		UserEntity usrent = new UserEntity();
		usrent.setUser_address1(user.getUser_address1());
		usrent.setUser_confirmpassword(user.getUser_confirmpassword());
		usrent.setUser_contact1(user.getUser_contact1());
		usrent.setUser_dob(user.getUser_dob());
		usrent.setUser_domain_id(user.getUser_domain_id());
		usrent.setUser_emailid(user.getUser_emailid());
		usrent.setUser_experience(user.getUser_experience());
		usrent.setUser_first_name(user.getUser_first_name());
		usrent.setUser_gender(user.getUser_gender());
		usrent.setUser_id(user.getUser_id());
		usrent.setUser_joining_on(user.getUser_joining_on());
		usrent.setUser_last_name(user.getUser_last_name());
		usrent.setUser_maritalstatus(user.getUser_maritalstatus());
		usrent.setUser_middle_name(user.getUser_middle_name());
		usrent.setUser_occupation(user.getUser_occupation());
		usrent.setUser_password(user.getUser_password());
		usrent.setUser_qualification(user.getUser_qualification());
		usrent.setUser_sub_domain_id(user.getUser_sub_domain_id());
		usrent.setUser_type(user.getUser_type());

		Session session = sessionFact.openSession();
		try {
			Transaction tran = session.beginTransaction();
			session.save(usrent);
			tran.commit();
			session.close();
		} catch (HibernateException exp) {
			exp.printStackTrace();
		} finally {
			session.close();
		}
	}
/*	
	public void showAllUsers(){
		List<User> allUser =new ArrayList<User>();
		String hql ="from PARAM_USER";
		Session session=sessionFact.openSession();
		Query query =session.createQuery(hql);
		List<User> userlisting=query.list();
		for(User l1: userlisting){
			System.out.println(l1.getUser_emailid());
			System.out.println(l1.getUser_contact1());
			System.out.println(l1.getUser_first_name());
		}
	}
	
	public User showUserDetails(String userid){
		String hql ="from PARAM_USER where user_emailid =:userid";
		Session session=sessionFact.openSession();
		Query query =session.createQuery(hql);
		query.setParameter("userid",userid);
		List<User> userlisting=query.list();
		return (User) userlisting;	
	}
	
	public void removeUser(Integer userid){
		//write code for delete user	
	}
	
	public void removeUser(User user){
		//write code for update user	
	}
*/}
