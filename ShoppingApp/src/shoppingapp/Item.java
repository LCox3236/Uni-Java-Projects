package shoppingapp;

public class Item {
    
    private String name;
    private double value;
    private Discount discount;
    
    public Item(){  ;}
    
    public Item(String name, double value){
        
        this.name = name;
        this.value = value;
        this.discount = Discount.NONE;
        }
    
    public Item(String name, double value, Discount discount){
        
        this.name = name;
        this.value = value;
        this.discount = discount;
        }    
    
    public void setName(String newName){
        this.name = newName;
    }
    
    public void setValue(double newValue){ 
        this.value = newValue;
    }

    public void setDiscount(Discount newDiscount){
        this.discount = newDiscount;
    }    
    
    public String getName() { return name; }
    public double getValue() { return value; }
    public Discount getDiscount() { return discount; }
    
    public double getDiscountedValue() {
        
        double discountValue = discount.getValue();
        return discountValue * this.value;
    }
    
    
}
