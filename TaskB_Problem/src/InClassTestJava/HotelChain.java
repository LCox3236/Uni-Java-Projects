package InClassTestJava;
import Support.Attribute;
import java.util.*;


public class HotelChain {

    private ArrayList<Hotel> hotels;


    //STEP 1
    public HotelChain(){
        //*** PLACE CODE HERE ***//
        this.hotels = new ArrayList<Hotel>();
    }
    
    //STEP 2
    public void addHotel(String name, String id, int guestCount, int currentStaffing, int bedsInHotel){
        Hotel myHotel = new Hotel(name, id, guestCount,currentStaffing,bedsInHotel);
        //*** PLACE CODE HERE ***//
        this.hotels.add(myHotel);
    }

    //STEP 3    
    public void setStaffCapacity(){
        for(Hotel myHotel : hotels) {
            //*** PLACE CODE HERE ***//
            myHotel.setStaffCapacity();
        }
    }    
    
    //STEP 4          
    public void reStaff(int index){
        Hotel myHotel = this.hotels.get(index);
        //*** PLACE CODE HERE ***//
        myHotel.reStaff();
    }      
    
    //STEP 5
    //*** PLACE CODE HERE ***//
    public void leavingHotel(String id, int guestsLeaving){
        for(Hotel myHotel : hotels){
            if(myHotel.getId().equals(id)){
                myHotel.leavingHotel(guestsLeaving);
            }
        }
    }


/******************************* DO NOT TOUCH  *******************************/
/**************CODE BELOW SUPPORTS DISPLAY AND SHOULD NOT BE EDITED***********/
/*****************************************************************************/
/*****************************************************************************/    

    public int getCount(){
        return this.hotels.size();
    }

    public String displayItem(int index){
        String strValue = "\n";
        strValue += displayItem(index, Attribute.NAME_ID)+ "\n";//"COMPANY: " + myPlane.getName() + ", ";        
        strValue += displayItem(index, Attribute.BEDS_GUESTS)+ "\n";  
        strValue += displayItem(index, Attribute.STAFF_CAPACITY)+ "";
        return strValue;
    }

    public String displayItem(int index, Attribute selAttribute){
        Hotel myHotel = this.hotels.get(index);
        String sInfo = "";
        switch (selAttribute) {
            case NAME_ID:  
                sInfo = "NAME: " + myHotel.getName()  ;
                sInfo += ", ID: " + myHotel.getId() ;
                break;
            case BEDS_GUESTS: 
                sInfo = "BEDS: " + myHotel.getBeds()+ ",  GUESTS: " + myHotel.getGuests();
                break; 
            case STAFF_CAPACITY: 
                sInfo = "STAFF: " + myHotel.getStaff();
                if(myHotel.getStaffCapacity() <= 0) {
                     sInfo += ",  STAFF CAPACITY:" + " ***NOT SET*** ";
                }
                else { 
                    sInfo += ",  STAFF CAPACITY: " + myHotel.getStaffCapacity() ;
                }
                break;
            }        
        return sInfo;
    }         
}
