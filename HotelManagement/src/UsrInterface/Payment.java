/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UsrInterface;

 
public class Payment {
    
    private int MethodID;
     private int Amount;
      private String DateOfPay;
       private int BookingID;

    public Payment(int MethodID, int Amount, String DateOfPay, int BookingID) {
        this.MethodID = MethodID;
        this.Amount = Amount;
        this.DateOfPay = DateOfPay;
        this.BookingID = BookingID;
    }

    public int getMethodID() {
        return MethodID;
    }

    public int getAmount() {
        return Amount;
    }

    public String getDateOfPay() {
        return DateOfPay;
    }

    public int getBookingID() {
        return BookingID;
    }
    
            
    
}
