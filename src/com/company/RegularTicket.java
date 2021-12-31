package com.company;

public class RegularTicket extends Ticket{
    private String specialServices;
    RegularTicket(String pnr, String to, String from, String departureDetails, String arrivalDetails, String seatNumber,
                  boolean isBooked, float ticketPrice, Passenger passenger, Flight flight,String bookingType,String specialServices){
super(pnr, to, from, departureDetails, arrivalDetails, seatNumber, isBooked, ticketPrice, passenger, flight,bookingType);
        this.specialServices=specialServices;
    }
    public String getspecialServices() {
        return specialServices;
    }
}
