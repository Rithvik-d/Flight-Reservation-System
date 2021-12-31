package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {

        Passenger p1= new Passenger("Rithvik","7895415214","rithvikd@gamil.com",
                "8-656","Hyderabad","telangana",500045);
        Flight f1=new Flight("Hyderabad to Mumbai ","I895ABS","Indigo",200,100);
        Flight f2=new Flight("Hyderabad to Dubai ","H8895AS","Emirates",500,200);

        Ticket t1 = new RegularTicket("HM1254","Mumbai","Hyderabad","2021-12-31T18:00:00","2022-01-1T1:30:00","98",true,5525,p1,f1,"Regular Ticket","Burger with fries");
        Ticket t2=new TouristTicket("HD1257","Dubai","Hyderabad","2022-01-15T19:00:00","2022-01-16T08:00:00","58",true,40000,p1,f2,"Tourist ticket","Park Hyatt Dubai",new String[]{"global dubai village","palam Jumeriah","the dubai mall"});
//System.out.println("\n\nTicket details\n\n"+"Pnr number: "+ t1.getPnr()+"\nPassenger Details "+ p1.getContact()+ "\nFlight Details"+f1.getFlightDetails()+ "\nDeparture-"+ t1.getFrom()+" Time-"+t1.getDepartureDetails()+ " arrival-"+ t1.getTo()+" Time-"+t1.getArrivalDetails()+ "\nSeat number-"+t1.getSeatNumber());
        printTicketDetails(t1);
        printTicketDetails(t2);
  /*   //unable to access private attributes of Flight class directly outside the class

        System.out.println("flight number: "+f1.FlightNumber()+ "\nairline name:  "+f1.AirlineName()+
                "\ndeparture location: "+"\ncapacity: "+f1.Capacity()+"\n seats booked: "+f1.NoOfSeatsBooked());
    */


//accessing attributes of flight class via getters and setters
  /*  System.out.println("\n\nFlight details \n\n"+"flight number: "+f1.getFlightNumber()+ "\nairline name:  "+f1.getAirlineName()+
                "\ndeparture location: "+"\ncapacity: "+f1.getCapacity()+"\nseats booked: "+f1.getNoOfSeatsBooked());
*/}
        private static void printTicketDetails(Ticket ticket) {
            System.out.println(ticket.getPnr());
    }
}
