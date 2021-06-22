
package shoppingapp;


public class ShoppingApp {

  
    public static void main(String[] args) {
        
        Basket MyBasket = new Basket();
        
        //add item (without duplicates)
        MyBasket.addItem("Apples", .23);
        MyBasket.addItem("Nuts", 1.23,Discount.EARLY);
        MyBasket.addItem("Pineapples", .43);
        MyBasket.addItem("Vodka", 10.99,Discount.MIDSEASON);
        
       
        System.out.println(MyBasket.getNames());

        
        
        
       
       
        
        //find item, remove
        
        //find item, update cost
        
        
        
    }
    
}
