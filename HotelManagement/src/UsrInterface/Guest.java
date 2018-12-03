/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UsrInterface;

 
public class Guest {
    private String Firstname;
    private String LastName;
    private String Address;
    private String Postcode;
    private String Telephone;
    private String Occupation;
    private String Nationality;

    public Guest(String Firstname, String LastName, String Address, String Postcode, String Telephone, String Occupation, String Nationality) {
        this.Firstname = Firstname;
        this.LastName = LastName;
        this.Address = Address;
        this.Postcode = Postcode;
        this.Telephone = Telephone;
        this.Occupation = Occupation;
        this.Nationality = Nationality;
    }

    public String getFirstname() {
        return Firstname;
    }

    public String getLastName() {
        return LastName;
    }

    public String getAddress() {
        return Address;
    }

    public String getPostcode() {
        return Postcode;
    }

    public String getTelephone() {
        return Telephone;
    }

    public String getOccupation() {
        return Occupation;
    }

    public String getNationality() {
        return Nationality;
    }
    
    
    
    
}
