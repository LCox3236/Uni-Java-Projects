/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testlecturer;

import java.util.*;

/**
 *
 * @author up889519
 */
public class Lecturer {
    
    private String firstName;
    private List<String> Units;
    private int salary;
    private String lastName;    

    
    public Lecturer(String firstName, String lastName, int salary){
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.Units = new ArrayList<String>();
    }
    
    public void addUnit(String UnitName){
        boolean exist = this.Units.contains(UnitName);
        if (exist) this.Units.add(UnitName);
        else System.out.println("this unit aleady exists.");
    }
    public void remUnit(String UnitName){
        boolean exist = this.Units.contains(UnitName);
        if (exist) this.Units.remove(UnitName);
        else System.out.println("this unit does not exist.");
    }
    
    public void wageRise(int perctInc){
        this.salary = (perctInc / this.salary) * 100;
    }
    
}
