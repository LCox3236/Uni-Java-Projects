package InClassTestJava;

public class Test {
  
    //*** DO NOT INSERT OR CHANGE CODE IN THIS CLASS TO OBTAIN ***//
    //*** CORRECT OUTPUT                                         ***//
    
    public static void main(String[] args) {
        
        //(String companyName, String hotelId, int guestCount, int availableBeds){
        System.out.println("*****STEP 1 & 2 ************");
        Hotel myHotel = new Hotel("EasyHotels", "XX34-RT55", 34);
        myHotel.setBeds(100);
        display(myHotel);
        
        System.out.println("\n");        
        System.out.println("******STEP 4************");
        System.out.println("*ADDING GUESTS: 45*");
        myHotel.addGuests(45);      
        display(myHotel);

        System.out.println("*ADDING GUESTS: 45*");
        myHotel.addGuests(45);      
        display(myHotel);

        System.out.println("\n");        
        System.out.println("***********STEP 5*******");       
        
        /********************STEP 5**************************/
        
       
        System.out.println("***********************");
        System.out.println("GUEST WITH MEALS: 60%");
        myHotel.setWithBreakfast(.6);

        System.out.println("Breakfasts: " + myHotel.orderBreakfasts());        
       


    }
    
     public static void display(Hotel myHotel){

        System.out.println("***********************");
        System.out.println("COMPANY: " + myHotel.getCompanyName());        
        System.out.println("HOTEL: " + myHotel.getId());
        System.out.println("Guests: " + myHotel.getGuests());
        System.out.println("Rooms: " + myHotel.getRooms() + " ***STEP 3***");
        System.out.println("Beds: " + myHotel.getBeds());
        System.out.println("***********************");
    }    
}
