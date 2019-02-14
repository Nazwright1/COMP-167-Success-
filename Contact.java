/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contacts;

/**
 *
 * @author CCannon
 */
public class Contact {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String emailAddress;

    public Contact(String firstName, String lastName, String phoneNumber, String emailAddress) {
             this.firstName = firstName;
             this.lastName = lastName;
            this.phoneNumber = phoneNumber;
            this.emailAddress = emailAddress; 
                    
       }
    
    @Override
    public String toString(){
        return firstName + " " + lastName + "/n" + phoneNumber + "/n" + emailAddress;
    }
        
        // TODO: The toString method returns a string representation of a java object. We will use this
        // method whenever we create a data type. For this method, return the first and last name
        // on one line, separated by a space, followed by a new line, then the phone number, another
        // new line, and the email address
        // Make sure you delete the "throw" statement below when you add your own code.
        // Complete this method, save, commit, and push. 
    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName; 
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName ;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName ;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
this.lastName = lastName;   
    }

    /**
     * @return the phoneNumber
     */
    public String getPhoneNumber() {
return phoneNumber ; 
    }

    /**
     * @param phoneNumber the phoneNumber to set
     */
    public void setPhoneNumber(String phoneNumber) {
this.phoneNumber = phoneNumber ;
    }

    /**
     * @return the emailAddress
     */
    public String getEmailAddress() {
return emailAddress ;    }

    /**
     * @param emailAddress the emailAddress to set
     */
    public void setEmailAddress(String emailAddress) {
this.emailAddress = emailAddress ; 
    }
}
