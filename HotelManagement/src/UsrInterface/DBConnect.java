/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UsrInterface;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

 
public class DBConnect {
    private  Statement stmt = null;
    private  Connection connection ;   
    
    public DBConnect(){  }

    public void connectToDB() throws SQLException, ClassNotFoundException{
        try {
          
            System.out.println("op...");
            Class.forName("com.mysql.jdbc.Driver");
            String connectionUrl =  "jdbc:mysql://localhost/" + "hotelsystm";
        
            
            connection = DriverManager.getConnection(connectionUrl,"root","");
            
            System.out.println("Connected database successfully...");
            
            java.sql.Statement stmt=connection.createStatement();
            
        } catch(SQLException se){System.out.println(se.getMessage());}
          
     }

    
    public void disconnectFromDB(){

    try{
       // if (rs != null){rs.close();}
        if (stmt != null){stmt.close();}
        if (connection != null){connection.close();}
    }
        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Unable to close connection");
        }
    }

    public boolean insertDataToDB(String query)
     {
        try
        {
            java.sql.Statement stmt=connection.createStatement();
            stmt.executeUpdate(query);
            return true;
        }
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "Unable to Insert Data");
            Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }        
     }
}
