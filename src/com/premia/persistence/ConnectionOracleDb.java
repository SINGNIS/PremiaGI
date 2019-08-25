package com.premia.persistence;

import java.sql.*;

public class ConnectionOracleDb {
	Connection con=null;
	public Connection getConnection(){
		try {
			//System.out.println("at db connectivity");
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("at class set");
		    con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","nishikant","nishi");
			//System.out.println("manager set");
			//return con;
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("error at connection");
			e.printStackTrace();
		}
		return con;
	}
}
