/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UsrInterface;


public class BookingInfo {
    private int GuestID;
    private int StaffID;
    private int RoomNum;
    private int NumberOfGuest;
    private String BookingDate;

    public BookingInfo(int GuestID, int StaffID, int RoomNum, int NumberOfGuest, String BookingDate) {
        this.GuestID = GuestID;
        this.StaffID = StaffID;
        this.RoomNum = RoomNum;
        this.NumberOfGuest = NumberOfGuest;
        this.BookingDate = BookingDate;
    }

    public int getGuestID() {
        return GuestID;
    }

    public int getStaffID() {
        return StaffID;
    }

    public int getRoomNum() {
        return RoomNum;
    }

    public int getNumberOfGuest() {
        return NumberOfGuest;
    }

    public String getBookingDate() {
        return BookingDate;
    }
    
    
}
