package InClassTestJava;

public class Hotel {
    
    private String name;
    private String id;
    private double staffCapacity;   
    private int beds;

    private int guests;
    private double staff;

    
    public Hotel(String name, String id, int passengerCount, double currentStaffing, int bedsInHotel){
        this.name = name;
        this.id = id;
        this.beds = bedsInHotel;
        this.guests = passengerCount;
        this.staff = currentStaffing;        
        }

    public String getName() { return name; }
    public String getId() { return id;} 
    public int getGuests() { return guests;}
    public double getStaff(){ return staff;}    
    public double getBeds(){ return beds;}    
    public double getStaffCapacity(){ return staffCapacity;}    

    
    public void setStaffCapacity(){
        staffCapacity = beds/2; //* 90;
    }

   
    public void leavingHotel(int guestsLeaving){  
        guests -= guestsLeaving;
    }

    public void reStaff(){
        if((staff + 10) <= staffCapacity) {
            staff += 10;
        }
        else {
            staff = staffCapacity;
        }
    } 
   
}
