package shoppingapp;

public enum Discount {
    
    NONE (1),EARLY(.75),MIDSEASON(.50), ENDOFSEASON(.25);
    
    private double value;
    
    Discount(double value) { this.value = value; }
    
    public double getValue() { return this.value;}
    public String getValAsString() { return String.valueOf(value);}
}
