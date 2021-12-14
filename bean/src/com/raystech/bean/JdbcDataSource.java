package com.raystech.bean;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class JdbcDataSource {
	public static void main(String[] args) throws Exception  {
	
	 ComboPooledDataSource ds = new ComboPooledDataSource();
	 ds.setDriverClass("com.mysql.jdbc.Driver");
	 ds.setJdbcUrl("jdbc:mysql://localhost/sunrays");
	 ds.setUser("root");
	 ds.setPassword("root");
	 ds.setInitialPoolSize(5);
	 ds.setAcquireIncrement(5);
	 ds.setMaxPoolSize(50);
	 
	}
	}

