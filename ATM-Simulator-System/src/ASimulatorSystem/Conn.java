package ASimulatorSystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import java.sql.DriverManager; 

public class Conn{
    Connection c;
    Statement s;
    public Conn(){  
        try{  
            Class.forName("com.mysql.cj.jdbc.Driver");  
            c =DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem","root","172020");    
            s =c.createStatement(); 
           
          
            
        }catch(Exception e){ 
            e.getStackTrace();
        }  
    }  
}  
