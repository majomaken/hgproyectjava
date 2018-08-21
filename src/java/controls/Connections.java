/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controls;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author mikejimenez
 */
public class Connections {
    /*Inportar el metodo Connection= java.sql.Connection*/
    Connection conn=null;
    
    public Connection Connectiondb(){
    
        try {
        
        Class.forName("com.mysql.jdbc.Driver");
        conn=DriverManager.getConnection("jdbc:mysql://localhost/HGDB","root","");
            JOptionPane.showMessageDialog(null, "Connection sucessfull");
        
        } catch (Exception e) {
        
            JOptionPane.showMessageDialog(null, e);
        }
        return conn;
    }
}
