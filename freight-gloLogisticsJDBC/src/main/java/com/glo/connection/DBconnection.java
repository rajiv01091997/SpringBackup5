package com.glo.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DBconnection {
	public static Connection connect() throws Exception
	{
		
		Class.forName(DBvalues.DRIVER_ADDRESS);
		//----------------------------------------------------------------------------------------------------
		Properties props = new Properties();
		props.setProperty("user", DBvalues.USERNAME);
		props.setProperty("password", DBvalues.PASSWORD);
		props.setProperty("escapeSyntaxCallMode","callIfNoReturn");//for procedure call only in postgres ,function call and other
		                                                           //...calls can be done without this without escapeSyntaxCallMode
		                                                           //...and hence Properties object is not required operation where
		                                                           //....procedure is not involved in postgres.
		                                                           //simply,Connection con=DriverManager.getConnection(DBvalues.URL,DBvalues.USERNAME,DBvalues.PASSWORD);
		                                                           //...would have worked otherwise 
		//-------------------------------------------------------------------------------------------------------
		Connection con=DriverManager.getConnection(DBvalues.URL,props);
		return con;
	}
}
