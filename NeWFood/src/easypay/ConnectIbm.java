/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easypay;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Toshiba
 */
public class ConnectIbm {
    Connection connection;
    public static Connection ConnecrDb(){
         try {
            Class.forName("com.ibm.db2.jcc.DB2Driver");
        }
        catch(ClassNotFoundException cnfex) {
            System.out.println("Problem in"
                    + " loading or registering IBM DB2 JDBC driver");
        }
        
        try {
 
            //  Create and get connection using DriverManager class
//            System.out.println("established1");
            Connection connection = DriverManager.getConnection (
                    "jdbc:db2://55fbc997-9266-4331-afd3-888b05e734c0.bs2io90l08kqb1od8lcg.databases.appdomain.cloud:31929/bludb:sslConnection=true;",
                    "stj38249", 
                    "0oumSgjh8Yj8uohu");
//            System.out.println("established2");
             return connection;
        }
        catch (Exception e )
        {
            
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    
    
}
}