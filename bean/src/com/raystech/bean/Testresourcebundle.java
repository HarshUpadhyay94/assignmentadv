package com.raystech.bean;

import java.sql.DriverManager;
import java.util.ResourceBundle;
import com.mchange.v2.c3p0.impl.DriverManagerDataSourceBase;
import java.sql.Connection;

public class Testresourcebundle {
	public static void main(String[] args) throws Exception {
		ResourceBundle rb= ResourceBundle.getBundle("com.raystech.bean.app");
		Class.forName(rb.getString("driver"));
		Connection conn=  DriverManager.getConnection(rb.getString("url"),  rb.getString("username"),rb.getString("pwd"));
		conn.close();
		System.out.println("inserted");
	}
}
