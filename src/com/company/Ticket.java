package com.company;

import java.time.LocalDateTime;

public class Ticket {
    private String pnr, to, from, departureDetails, arrivalDetails;
    private String seatNumber;
    private boolean isBooked;
    private  Passenger passenger;
    private  Flight flight;
    private float ticketPrice;
    private String bookingType;

    public Ticket(String pnr, String to, String from, String departureDetails, String arrivalDetails, String seatNumber,
                  boolean isBooked, float ticketPrice, Passenger passenger, Flight flight,String bookingType){
        this.arrivalDetails=arrivalDetails;
        this.departureDetails=departureDetails;
        this.flight=flight;
        this.from=from;
        this.to=to;
        this.isBooked=isBooked;
        this.passenger=passenger;
        this.pnr=pnr;
        this.seatNumber=seatNumber;
        this.ticketPrice=ticketPrice;
        this.bookingType=bookingType;
    }

    public String checkStatus(){
        return isBooked?"Confirmed":"Cancelled";
    }
    public void cancelTicket(){
        isBooked=false;
    }
    public int journeyDuration(){
        LocalDateTime departureLocalDateTime = LocalDateTime.parse(departureDetails);
        LocalDateTime arrivalLocalDateTime = LocalDateTime.parse(arrivalDetails);
        return (arrivalLocalDateTime.getDayOfMonth() - departureLocalDateTime.getDayOfMonth()) * 24 +
                (arrivalLocalDateTime.getHour() - departureLocalDateTime.getHour());
    }

    public String getPnr() {
        return pnr;
    }

    public void setPnr(String pnr) {
        this.pnr = pnr;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getDepartureDetails() {
        return departureDetails;
    }

    public void setDepartureDetails(String departureDetails) {
        this.departureDetails = departureDetails;
    }

    public String getArrivalDetails() {
        return arrivalDetails;
    }

    public void setArrivalDetails(String arrivalDetails) {
        this.arrivalDetails = arrivalDetails;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public boolean isCancelled() {
        return isBooked;
    }

    public void setCancelled(boolean cancelled) {
        isBooked = cancelled;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public float getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(float ticketPrice) {
        this.ticketPrice = ticketPrice;
    }


}
