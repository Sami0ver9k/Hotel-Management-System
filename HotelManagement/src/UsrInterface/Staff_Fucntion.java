/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UsrInterface;
import java.sql.ResultSet;
import java.sql.SQLException;
import net.proteanit.sql.DbUtils;
import java.sql.*;

 
public class Staff_Fucntion {
    private DBConnect dbc;
    private ResultSet rs;

    public Staff_Fucntion() {        
            }
    
    public void saveInvoice(Staff staf) throws ClassNotFoundException
    {   System.out.println("ghk ");       
        try{
         dbc = new DBConnect();
         dbc.connectToDB();   
         
        // String pp = g.getFirstName();
         //String p1 = stu.getLastName();
        // Integer y = stu.getYear();
         //System.out.println("firstname "+ pp);
        // System.out.println("lastname "+ p1);
        // System.out.println("year "+ y);

         //Boolean dataSaved = dbc.insertDataToDB("INSERT INTO Student(firstName, lastName, year)"
          //                                  + " VALUES("+stu.getFirstName()+", "+stu.getLastName()+", "+stu.getYear()+")");
        Boolean dataSaved = dbc.insertDataToDB("INSERT INTO Staff(JobID, FirstName,LastName,Address)"
                                            + " VALUES('"+staf.getJobID()+"', '"+staf.getFirstName()+"', '"+staf.getLastName()+"','"+staf.getAddress()+"')");
         
        System.out.println("save or not + dataSaved");
         dbc.disconnectFromDB();            
     }
       catch (SQLException ex) {
            System.out.println(ex.getMessage());
            
        }finally {closeDB();}

    } 
    
 private void closeDB()
{
    try{
        if (rs != null){rs.close();}
       // if (stmt != null){stmt.close();}
        //if (dbc != null){dbc.close();}
    }catch(Exception e){}
}
 
    
}
