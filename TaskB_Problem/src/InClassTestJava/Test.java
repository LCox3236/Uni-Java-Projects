package InClassTestJava;

public class Test {
  
    //*** DO NOT INSERT OR CHANGE CODE INTO THIS CLASS TO OBTAIN ***//
    //*** CORRECT OUTPUT                                         ***//
    
    public static void main(String[] args) {
        
         System.out.println("******STEP 1 OBJECT CREATION************");
        HotelChain myHotels = new HotelChain();
       
        System.out.println("******STEP 2 ADD HOTELS************");
        myHotels.addHotel("BestHotel", "BS567", 23, 10, 50);
        myHotels.addHotel("Hostel", "HX4", 2, 3, 5);
        display(myHotels);
        
        System.out.println("\n******STEP 3 SET STAFF CAPACITY (BED/2)************");
        myHotels.setStaffCapacity();
        display(myHotels);         

        System.out.println("\n******STEP 4 RESTAFF HOTEL 2 (+10)************");
        display(myHotels,1); 
        myHotels.reStaff(1);
        display(myHotels,1);

        /********************STEP 5**************************/
        
        System.out.println("\n** STEP 5 GUESTS LEAVING: 5 from BS567 **");
        display(myHotels,0); 
        myHotels.leavingHotel("BS567", 5);
        display(myHotels,0); 
        
    }


    
    
    
    
    
    
    
/**************CODE BELOW SUPPORTS DISPLAY AND SHOULD NOT BE EDITED***********/
/*****************************************************************************/
/*****************************************************************************/     
    public static void display(HotelChain myHotels, int index){
            System.out.println(myHotels.displayItem(index));
    }
    
    public static void display(HotelChain myHotels){
            for(int i = 0;i<myHotels.getCount(); i++){
                System.out.println(myHotels.displayItem(i));
            }
    }
}
