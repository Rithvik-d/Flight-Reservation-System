package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {

        Passenger p1= new Passenger("Rithvik","7895415214","rithvikd@gamil.com",
                "8-656","Hyderabad","telangana",500045);
        Flight f1=new Flight("Hyderabad to Mumbai ","89d5ABS","Indigo",200,100);



        String locationlist []={"abids","hyderabad"};
        TouristTicket T1= new TouristTicket("Grand hotel",locationlist);
        RegularTicket t2=new RegularTicket("Snacks order");
        //String [] a=T1.getSelectedTouristLocation();


        System.out.println("hoteladdress   "+T1.getHotelAddress()+"\nselectedTouristLocation   "+Arrays.toString(T1.getSelectedTouristLocation()));
        System.out.println(t2.getspecialServices());


    }
}
