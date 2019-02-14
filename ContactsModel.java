/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contactsmodel;

/**
 *
 * @author Nazere Wright 
 */
public class ContactsModel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ContactList contact = new ContactList(); //create an object to access the contactlid class.
        contact.loadContacts("contacts.txt");  //call method to load contacts from the file.
        System.out.print(contact.toString()); //call to string
    }
    
}
