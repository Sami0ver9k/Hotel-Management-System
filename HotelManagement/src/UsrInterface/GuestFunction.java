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

 
public class GuestFunction {
    private DBConnect dbc;
    private ResultSet rs;

    public GuestFunction() {
    }
        public void saveInvoice(Guest guest) throws ClassNotFoundException
    {   System.out.println("ghk ");       
        try{
         dbc = new DBConnect();
         dbc.connectToDB();  
         
         String query2="SET FOREIGN_KEY_CHECKS=0;";
             Boolean dataSaved =  dbc.insertDataToDB(query2);
            //Statement pStatement2=(Statement) connection.createStatement();
            
         
        // String pp = g.getFirstName();
         //String p1 = stu.getLastName();
        // Integer y = stu.getYear();
         //System.out.println("firstname "+ pp);
        // System.out.println("lastname "+ p1);
        // System.out.println("year "+ y);

         //Boolean dataSaved = dbc.insertDataToDB("INSERT INTO Student(firstName, lastName, year)"
          //                                  + " VALUES("+stu.getFirstName()+", "+stu.getLastName()+", "+stu.getYear()+")");
         dataSaved = dbc.insertDataToDB("INSERT INTO Guest(FirstName, LastName,Address,PostCode,Telephone,Occupation,Nationality)"
                                            + " VALUES('"+guest.getFirstname()+"', '"+guest.getLastName()+"', '"+guest.getAddress()+"','"+guest.getPostcode()+"','"+guest.getTelephone()+"','"+guest.getOccupation()+"','"+guest.getNationality()+"')");
         
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
