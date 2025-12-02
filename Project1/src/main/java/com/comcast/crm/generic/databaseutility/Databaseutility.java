package com.comcast.crm.generic.databaseutility;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class Databaseutility {
	Connection con;
	
	public void getdbconnection(String url,String username,String password)
	{
		try
		{
			Driver driver=new Driver();
			DriverManager.registerDriver(driver);
			con=DriverManager.getConnection(url,username,password);
		}
		catch(Exception e)
		{
			
		}
	}
	
		
		
	public void getDbconnection()
	{
		try
		{
			Driver driver=new Driver();
			DriverManager.registerDriver(driver);
			con=DriverManager.getConnection("");
		}
		catch(Exception e)
		{
			
		}
	}
		
    public void closedbconnection()
       {
	     try {
           con.close();
            	}
	  catch (Exception e) {
	
	                    }
       }
    
    
	     public ResultSet executeconselectquery(String query) throws SQLException
	     {
	    	 ResultSet result=null;
	    	 try
	    	 {
	    	   Statement stat = con.createStatement();
	    	   result=stat.executeQuery(query);
	    	 }
	    	 catch(Exception e)
	    	 {
			   
	    	 }
			 return result;
	    	}
	     
	     public int executenonselectquery(String query)
	     {
	      int result=0;
	      try
	      {
	    	  Statement stat=con.createStatement();
	    	  result=stat.executeUpdate(query);
	      }
	      catch(Exception e)
	      {
	    	  
	      }
	      return result;
	     }
}



