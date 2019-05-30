/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stores;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author Shasank Joshi
 */
public class DBConnection {
     public static Statement statementObject(){
        
           
      try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver Loaded");
        }catch(Exception e){
            System.out.println("Driver Not Loaded");
        }
       
        
        Connection con=null;
        try{
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/olizstore", "root", "");
            System.out.println("Database connected");
        }catch(Exception f){
            System.out.println("Database not connected");
        }
        
           Statement st = null;
        try{
           st=con.createStatement();
            
        }catch(Exception g){
            System.out.println("Query Not executed");
        }
         
        return st;
    
}
    
}
