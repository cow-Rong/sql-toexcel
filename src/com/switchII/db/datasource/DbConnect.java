package com.switchII.db.datasource;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * �������ݿ�
 * @author Anton
 *
 */
public class DbConnect {
	
	private static Connection connection ; 
	private static final String USER_NAME = "root" ; 
	private static final String USER_PWD = "admi" ; 
	private static String URL  = "jdbc:mysql://localhost:3306/database?useUnicode=true&characterEncoding=UTF-8" ; 
	private static final String DRIVER_NAME = "com.mysql.jdbc.Driver" ; 
	
	public static String getURL() {
		return URL;
	}

	public static void setURL(String uRL) {
		URL = uRL;
	}

	/**
	 * �õ��������ݿ�����
	 * @return
	 */
	public static Connection getInstance(){
		if(connection == null){
			getConnection() ; 
		}
		return connection ; 
	}

	/**
	 * �õ����ݿ�����
	 * @return
	 */
	 private static Connection getConnection(){
		 
	        try{
	            Class.forName(DRIVER_NAME);
	        }catch(ClassNotFoundException e1){
	            e1.printStackTrace();
	            return null ; 
	        }
	        try {
	        	connection = DriverManager.getConnection(getURL(), USER_NAME,USER_PWD);
	        } catch (SQLException e){
	            e.printStackTrace();
	            return null ; 
	        }
	        return connection; 
	    }
	
}
