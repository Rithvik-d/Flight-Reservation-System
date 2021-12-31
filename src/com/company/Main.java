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


        //unable to access private attributes of Flight class directly outside the class

	/*
        System.out.println("flight number: "+f1.FlightNumber()+ "\nairline name:  "+f1.AirlineName()+
                "\ndeparture location: "+"\ncapacity: "+f1.Capacity()+"\n seats booked: "+f1.NoOfSeatsBooked());
    */


//accessing attributes of flight class via getters and setters
        System.out.println("Flight details \n"+"flight number: "+f1.getFlightNumber()+ "\nairline name:  "+f1.getAirlineName()+
                "\ndeparture location: "+"\ncapacity: "+f1.getCapacity()+"\nseats booked: "+f1.getNoOfSeatsBooked());


        System.out.println("\nHotel details\nhotelhoteladdress   "+T1.getHotelAddress()+"\nselectedTouristLocation   "+Arrays.toString(T1.getSelectedTouristLocation()));
        System.out.println(t2.getspecialServices());


    }
}
