/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UsrInterface;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

 
public class BookingFunc {
     private DBConnect dbc;
    private ResultSet rs;

    public BookingFunc() {
    }

    
    public void saveInvoice(BookingInfo Bking) throws ClassNotFoundException
    {         
        try{
         dbc = new DBConnect();
         dbc.connectToDB();   
         
        
         String query2="SET FOREIGN_KEY_CHECKS=0;";
             Boolean dataSaved =  dbc.insertDataToDB(query2);
         //Boolean dataSaved = dbc.insertDataToDB("INSERT INTO Student(firstName, lastName, year)"
          //                                  + " VALUES("+stu.getFirstName()+", "+stu.getLastName()+", "+stu.getYear()+")");
         dataSaved = dbc.insertDataToDB("INSERT INTO booking(GuestID,RoomNum,StaffID,NumberOfguest,BookingDate)"
                                            + " VALUES('"+Bking.getGuestID()+"', '"+Bking.getRoomNum()+"', '"+Bking.getStaffID()+"','"+Bking.getNumberOfGuest()+"', '"+Bking.getBookingDate()+"')");
         
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
