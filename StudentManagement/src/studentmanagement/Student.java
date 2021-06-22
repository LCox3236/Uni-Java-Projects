/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanagement;

/**
 *
 * @author up889519
 */
public class Student {
    private String firstName;
    private String lastName;
    private String stuID;
    private String email;
    private String course;
    private boolean paymentStatus;
    private boolean currentStudent;        

    public Student(
        String firstname, 
        String lastname, 
        String course)
    {
        this.firstName = firstname;
        this.lastName = lastname;
        this.stuID = genID();
        this.email = genEmail();
        this.course = course;
        this.paymentStatus = false;
        this.currentStudent = true;
              
    }

    public String genID(){
        String ID = "";
        ID += this.firstName.charAt(0);
        ID += this.lastName;
        return ID;
    }
    public String genEmail(){
        String email = "";
        email += genID();
        email += "@university.ac.uk";
        return email;
    }

    
    
    public void setFeesPaidT(){ this.paymentStatus = true; }
    public void setFeesPaidF(){ this.paymentStatus = false; }
    
    public void setEnrolledT(){ this.paymentStatus = true; }
    public void setEnrolledF(){ this.paymentStatus = false; }
    
    public String getFirstName(){ return this.firstName; }
    
    public String getAllInfo(){
        String info = "";
        info += this.firstName + "\n" + this.lastName + "\n" + this.stuID + "\n" + 
                this.course + "\n" + this.email + "\n" + this.paymentStatus + 
                "\n" + this.currentStudent;
            
        
        
        return info;
    }
    
    public void changeCourse(String course){ this.course = course; }
}

