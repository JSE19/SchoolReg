/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolreg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author User
 */
public class DbConnect {
    Connection con;
    Statement stmt;
    ResultSet rs;
    public static void Connection(){
        try{
            Connection con;
            Statement stmt;
            ResultSet rs;
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection("jdbc:sqlserver://JOY; DatabaseName=SchoolManagementSystem; IntegratedSecurity=true");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
}
