package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {

        Passenger p1= new Passenger("Rithvik","7895415214","rithvikd@gamil.com",
                "8-656","Hyderabad","telangana",500045);
        Flight f1=new Flight("Hyderabad to Mumbai ","89d5ABS","Indigo",200,100);

        Ticket t1 = new RegularTicket("1254","Mumbai","Hyderabad","2021-12-31T18:00:00","2022-01-1T1:30:00","98",true,5525,p1,f1,"Regular Ticket","available");
        System.out.println("\n\nTicket details\n\n"+"Pnr number: "+ t1.getPnr()+"\nPassenger Details "+ p1.getContact()+ "\nFlight Details"+f1.getFlightDetails()+ "\nDeparture-"+ t1.getFrom()+" Time-"+t1.getDepartureDetails()+ " arrival-"+ t1.getTo()+" Time-"+t1.getArrivalDetails()+ "\nSeat number-"+t1.getSeatNumber());

        //unable to access private attributes of Flight class directly outside the class

	/*
        System.out.println("flight number: "+f1.FlightNumber()+ "\nairline name:  "+f1.AirlineName()+
                "\ndeparture location: "+"\ncapacity: "+f1.Capacity()+"\n seats booked: "+f1.NoOfSeatsBooked());
    */


//accessing attributes of flight class via getters and setters
        System.out.println("\n\nFlight details \n\n"+"flight number: "+f1.getFlightNumber()+ "\nairline name:  "+f1.getAirlineName()+
                "\ndeparture location: "+"\ncapacity: "+f1.getCapacity()+"\nseats booked: "+f1.getNoOfSeatsBooked());



    }
}
