
package shoppingapp;
import java.util.*;

public class Basket {
    
    private ArrayList<Item> items;
    
    
    
    public Basket() { 
        items = new ArrayList<Item>();  
    }
    
    
    public void addItem(String name, double value){
        
        Item i = new Item(name,value);
        
        items.add(i);
    }

    public void addItem(String name, double value, Discount discount){
        
        Item i = new Item(name,value,discount);
        
        items.add(i);
    }    

    public ArrayList<Item> getList(){
        
        return items;
    }
    
    public String getNames(){
        
        String retVal = "";
        
        for (Item i : items) {
           retVal += i.getName();
       }
        
        return retVal;
    }
    
}
