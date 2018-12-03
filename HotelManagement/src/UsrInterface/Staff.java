/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UsrInterface;
 
public class Staff {
    private int JobID;
            private String FirstName;
            private String LastName;
            private String Address;

    public Staff(int JobID, String FirstName, String LastName, String Address) {
        this.JobID = JobID;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Address = Address;
    }

    public int getJobID() {
        return JobID;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public String getAddress() {
        return Address;
    }
    
}
