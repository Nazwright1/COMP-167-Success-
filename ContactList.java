/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contactsmodel;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nazere Wright 
 */
public class ContactList {
   private String listName;
   private ArrayList<Client>contacts;

   public ContactList() { 
       
       listName ="";
       contacts = new ArrayList<>();
    
   }
   public String getListName() { 
       return listName; 
   }
   public void setListName(String listName) { 
       this.listName = listName;
   }
   @Override
   public String toString() {
       String s = "";
       
       for(int i = 0; i < size(); i ++) {
           s+= contacts.get(i) + System.lineSeparator();
       }
       return listName + System.lineSeparator() + s;
   }
   
   
   public Client getContact(int index){
       return contacts.get(index);
   }
   public int size() {
       return contacts.size();
   }
   public void deleteContact(int index) {
       Client remove = contacts.remove(index);
   }
   public void addContact(Client client ){
       contacts.add(client);
   }
  public void loadContacts(String filename) { 
      try { 
          Scanner read = new Scanner(new File("contacts.txt"));
          listName = read.nextLine();
          while(read.hasNext()) { 
              String [] info = read.nextLine().split(",");
              Client client = new Client(info[0],info[1],info[2],Integer.parseInt(info[3]),info[4],info[5]);
              contacts.add(client);
          }
      } catch (FileNotFoundException ex) {
           Logger.getLogger(ContactList.class.getName()).log(Level.SEVERE, null, ex);
           System.err.print("File data not found.");
       }
  }
  public void saveContacts(String filename) { 
      try {
          PrintWriter print = new PrintWriter(new File("contacts.txt"));
          print.print(this.toString());
          print.close();
          
      } catch (FileNotFoundException ex) {
          System.err.println("Data Cannot Be Written To File.");
           Logger.getLogger(ContactList.class.getName()).log(Level.SEVERE, null, ex);
       }
  }
}
