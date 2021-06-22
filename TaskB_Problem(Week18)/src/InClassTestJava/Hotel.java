package InClassTestJava;

public class Hotel {
    
    private String company;
    private String id;
    
    private int guests;
    private int beds;
    
    private double withBreakfast;

    //STEP 1
    public Hotel(String companyName, String hotelId, int guestCount){
        //*** PLACE CODE HERE ***//
        this.company = companyName;
        this.id = hotelId;
        this.guests = guestCount;
        }
    
    //STEP 2
    public void setBeds(int availableBeds){
        //*** PLACE CODE HERE ***//
        this.beds = availableBeds;
    }
            
            
    public String getCompanyName() { 
        return company; 
    }
    
    public String getId() { 
        return id; 
    } 

    public int getBeds() { 
        return beds; 
    }
    
    public int getGuests() { 
        return guests; 
    } 
    
    //STEP 3
    public double getRooms() {
        return this.beds/4;//*** REPLACE THE CODE IN THIS METHOD ***//
    }

    //STEP 4
    public void addGuests(int newGuests){  
     //*** PLACE CODE HERE ***//
     if (newGuests + this.guests <= this.beds){
         this.guests += newGuests;
     }
     else{
         this.guests = this.beds;
     }
    }
    
    //STEP 5
    public void setWithBreakfast(double value){
        this.withBreakfast = value;
        
    }
   
    
    public double orderBreakfasts(){
        return this.guests * this.withBreakfast;
    }
}
