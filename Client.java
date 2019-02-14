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
public class Client {
    private String firstname;
    private String lastname; 
    private String gender;
    private int age;
    private String phoneno;
    private String email;
  
    public Client(String fn, String ln, String gen, int agee, String phone, String mail) { 
        firstname = fn;
        lastname = ln;
        gender = gen;
        age = agee;
        phoneno = phone; 
        email = mail;
    }
    public String getFirstname(){ 
        return firstname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname; 
        
    }
    public String getLastname() { 
        return lastname;
    }
    public void setLastname(String lastname) { 
        this.lastname = lastname; 
    }
    public String getGender () { 
        return gender;
    }
    public void setGender(String gender) { 
        this.gender = gender; 
    }
    public int getAge() { 
        return age; 
    }
    public void setAge(int age) { 
        this.age = age;
    }
    public String getPhone() { 
        return phoneno;        
    }
    public void setPhone(String phoneno) {
        this.phoneno = phoneno;
    }
    public String getEmail() { 
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    @Override
    public String toString() { 
         
        return String.format("%-20s%-20s%-10s%10s%20s%30s", firstname, lastname, gender, age, phoneno, email);
    }
}
