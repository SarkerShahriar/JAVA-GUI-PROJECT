/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atmbanking;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author User
 */
public class atmdatabase {
    
       public String URL = "jdbc:sqlserver://localhost:1433; databaseName=banking; user=sa; password=01910778878";
   
   // Declaring JDBC objects
   
   public Connection con = null;
   public ResultSet rs = null;
   public PreparedStatement pst = null;
   
   public void connect() 
   {
       //  Connection
       try {
           
           Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
           con = DriverManager.getConnection(URL);  
          // System.out.println("connected");
           
       } catch (Exception e) {
           
           e.printStackTrace();
       }
       
   }
   
}
