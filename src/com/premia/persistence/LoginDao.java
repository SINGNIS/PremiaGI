package com.premia.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.premia.model.User;


public class LoginDao {
	boolean Validuser1 =false;
	public boolean validateUser(User user) throws SQLException{
	try {
		String userid=user.getUser_emailid();
		String userpwd=user.getUser_password();
		System.out.println(userid + " --- "+ userpwd );
		ConnectionOracleDb connect =new ConnectionOracleDb();
		Connection con=connect.getConnection();
		PreparedStatement ps= con.prepareStatement("select * from PARAM_USER where user_emailid =? and user_password =?");
		ps.setString(1,userid);
		ps.setString(2,userpwd);
		ResultSet rs=ps.executeQuery();
		
		Validuser1=rs.next();
		System.out.println("Validuser-->"+Validuser1);
		//return Validuser1;
		
	} catch (Exception e) {
		System.out.println("error at logindao");
		e.printStackTrace();
	}
	return Validuser1;
	}
	
	public void createNewUser(User user){
		User newuser =(User) user;

		ConnectionOracleDb condb =new ConnectionOracleDb();
		Connection con= condb.getConnection();
		try {
			PreparedStatement ps=con.prepareStatement("Insert into PARAM_USER VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
			ps.setInt(1, newuser.getUser_id());
			ps.setString(2, newuser.getUser_type());
			ps.setDate(3, (java.sql.Date) newuser.getUser_joining_on());
			ps.setString(4, newuser.getUser_first_name());
			ps.setString(5, newuser.getUser_middle_name());
			ps.setString(6, newuser.getUser_last_name());
			ps.setDate(7, (java.sql.Date) newuser.getUser_dob());
			ps.setString(8, newuser.getUser_gender());
			ps.setString(9, newuser.getUser_address1().getAddress1());
			ps.setString(10, newuser.getUser_address1().getAddress2()); 
			ps.setString(11, newuser.getUser_address1().getStreet());
			ps.setString(12, newuser.getUser_address1().getCity());  
			ps.setString(13, newuser.getUser_address1().getState()); 
			ps.setString(14, newuser.getUser_address1().getCountry());
			ps.setInt(15, newuser.getUser_address1().getPincode());
			ps.setLong(16, newuser.getUser_contact1());
			ps.setString(17, newuser.getUser_occupation());
			ps.setString(18, newuser.getUser_qualification());
			ps.setString(19, newuser.getUser_maritalstatus());
			ps.setString(20, newuser.getUser_emailid());
			ps.setString(21, newuser.getUser_password());
			ps.setString(22, newuser.getUser_confirmpassword());
			ps.setLong(23, newuser.getUser_experience());
			ps.setString(24, newuser.getUser_domain_id());
			ps.setString(25, newuser.getUser_sub_domain_id());
			int j=ps.executeUpdate();
			if (j!=0) {
				System.out.println("insertion completed");
			}else 
				System.out.println("incomplete insertion, issue found");
			}catch (SQLException e) {
			e.printStackTrace();
			}
		}
}
