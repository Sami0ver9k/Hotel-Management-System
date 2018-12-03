/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UsrInterface;

 
public class Room {
    
   private int RoomNum ;
   private int RoomType ;
   private String Availability ;

    public Room(int RoomNum, int RoomType, String Availability) {
        this.RoomNum = RoomNum;
        this.RoomType = RoomType;
        this.Availability = Availability;
    }

    public int getRoomNum() {
        return RoomNum;
    }

    public int getRoomType() {
        return RoomType;
    }

    public String getAvailability() {
        return Availability;
    }
    
    
}
