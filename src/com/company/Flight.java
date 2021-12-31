package com.company;

public class Flight {
    private String flightNumber;
    private String flightName;
    private String airlineName;
    private int capacity;
    private int SeatsBooked;


    public Flight(String flightName ,String flightNumber, String airlineName, int capacity, int SeatsBooked) {
        this.flightNumber = flightNumber;
        this.flightName = flightName;
        this.airlineName = airlineName;
        this.capacity = capacity;
        this.SeatsBooked = SeatsBooked;
    }
    public String getFlightName() {
        return flightName;
    }
    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getAirlineName() {
        return airlineName;
    }

    public void setAirlineName(String airlineName) {
        this.airlineName = airlineName;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setNoOfSeatsBooked(int noOfSeatsBooked) {
        this.SeatsBooked = noOfSeatsBooked;
    }

    public int getNoOfSeatsBooked() {
        return SeatsBooked;
    }

    public int getCurrentCapacity() {
        return capacity - SeatsBooked;
    }



    public String getFlightDetails(){
        return  "\nFlight Number: "+flightNumber+ "\nAirline Name: " +airlineName+ "\nCapacity: "+capacity+ "\nBooked Seats: "+SeatsBooked;
    }

    public boolean checkSeatAvailability(){
        return SeatsBooked<capacity;
    }
    public void updateSeatsBooked(){
        SeatsBooked++;
    }



}
