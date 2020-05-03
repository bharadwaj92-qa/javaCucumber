package com.optum.icube.atdd.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class IcubeDatabaseUtil {
	
	 public static Connection connection = null;
	  public static Statement stateMent =null;
	  public static  ResultSet resultSet = null;
	  public  static ResultSetMetaData resultSetMetaData = null;
	  
	  public static  ResultSet  executeReuestedQuery (String qureyString) throws ClassNotFoundException  {
	    //ResultSet rsa  = null;
	    try {
	            Class.forName(Config.getProperty("csddb_driver"));
	            connection = DriverManager.getConnection(Config.getProperty("csddb_connectstring"),Config.getProperty("csddb_id"),Config.getProperty("csddb_pw"));
	    } catch (SQLException e) {
	            System.out.println("Connection Failed! Check output console");
	            e.printStackTrace();
	    } 
	    if (connection != null) {
	            System.out.println("You made it, take control of database now!");
	    } else {
	            System.out.println("Failed to make connection!");
	    }

	    try {
	      stateMent=connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
	      resultSet=stateMent.executeQuery(qureyString);
	    } catch (Exception e) {
	            System.out.println("Connection Failed! Check output console");
	            e.printStackTrace();
	            resultSet  = null;
	    } 
	    return resultSet;
	}
	  
	  public static void main(String[] args) throws SQLException {
		  IcubeDatabaseUtil udb = new IcubeDatabaseUtil();
	    try {
	      resultSet = udb.executeReuestedQuery(Config.getProperty("csddb_query"));
	      while (resultSet.next()) {
	        String qcCrId = resultSet.getString("qc_cr_id");
	        String chartId = resultSet.getString("chart_id");
	        String qcId = resultSet.getString("qc_id");
	        String psychiatricDiag = resultSet.getString("addl_psychiatric_diag");
	      
	        System.out.println("qcCrId: " +qcCrId + "\t" + "chartId: " + chartId +
	                           "\t" + "qcId: " + qcId + "\t" + "psychiatricDiag: " + psychiatricDiag );
	    }
	      
	    } catch (ClassNotFoundException e) {
	      e.printStackTrace();
	    }
	  }

}
