package com.raystech.studentassignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Studentmodel {

	public static void main(String[] args) throws Exception {
		
	
		
		add(null);
	}
	
	public static void add(Studentbean bean) throws Exception {
	
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sunrays", "root", "root");
		PreparedStatement ps = conn.prepareStatement("INSERT INTO studentmgt values(?,?,?,?,?)");
	//	Studentbean bean  = new Studentbean();
		ps.setInt(1, bean.getId());
		ps.setString(2, bean.getRoll_no());
		ps.setString(3, bean.getFirst_name());
		ps.setString(4, bean.getLast_name());
		ps.setString(5, bean.getSession());
		ps.execute();
		conn.close();
		ps.close();
				
	}
	
}
