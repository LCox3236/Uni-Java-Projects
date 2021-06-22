/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libarysystem;

import java.util.*;

/**
 *
 * @author up889519
 */
public class Borrower {
    private String firstName;
    private String lastName;
    private int borrowerNumber;
    private int maxLoanedBooks;
    private int currentLoanedBooks;
    
    private List<Books> Books;


    public Borrower(
            String firstName,
            String lastName,
            int maxLoan
        )
        {
            this.firstName = firstName;
            this.lastName = lastName;
            this.borrowerNumber = genID();
            this.maxLoanedBooks = maxLoan;
            this.currentLoanedBooks = 0;
            
            this.Books = new ArrayList<Books>();
        }
    
    private int genID(){
        Random rand = new Random();
        int ID = rand.nextInt(1000)+1000;
        return ID;
    }
    
//    public int test(){
//        return this.borrowerNumber;
//    }
    
    
    public String getfistname(){ return this.firstName; }
    public String getlastname(){ return this.lastName; }
    public int getCurrentLoaned(){ return this.currentLoanedBooks; }
    public void changeMaxLoan(int newMax){ this.maxLoanedBooks = newMax; }
    
    
    
}

