/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanagement;

import java.util.*;

/**
 *
 * @author up889519
 */
public class Admin {
    private List<Student> students;
    
    public Admin(){
        this.students = new ArrayList<Student>();
            }
    
    public void newStu(
            String firstname, 
            String lastname, 
            String course
            )
    {
        Student newstu = new Student(
                firstname,
                lastname,
                course                          
                ); 
        students.add(newstu);
    }
    
    public void changeCourse(String firstname, String newCourse){
         for (Student s : students){
            if (s.getFirstName().equals(firstname)){
                 s.changeCourse(newCourse);
            }
        }
    }
    
    public void markFeesAsPaid(String firstname){
        for (Student s : students){
            if (s.getFirstName().equals(firstname)){
                 s.setFeesPaidT();
            }
        }
    }
    
    public void withdrawStudent(String firstname){
        for (Student s : students){
             if (s.getFirstName().equals(firstname)){
                 s.setEnrolledF();
            }
        }
    }
    
    public void reEnrolStudent(String firstname){
     for (Student s : students){
             if (s.getFirstName().equals(firstname)){
                 s.setEnrolledT();
            }
        }
    }
    
    public void printAllinfo(String firstname){
      for (Student s : students){
             if (s.getFirstName().equals(firstname)){
                 System.out.println(s.getAllInfo());
            }
        }
    }
    
    
    
    
    
    
    
    
}
