package com.company;

public class TouristTicket extends Ticket {
private String hotelAddress;
//
private String [] selectedTouristLocation;
 TouristTicket(String pnr, String to, String from, String departureDetails, String arrivalDetails, String seatNumber,
               boolean isBooked, float ticketPrice, Passenger passenger, Flight flight,String bookingType,String hotelAddress,String[] selectedTouristLocation){
     super(pnr, to, from, departureDetails, arrivalDetails, seatNumber, isBooked, ticketPrice, passenger, flight,bookingType);
     this.hotelAddress=hotelAddress;
this.selectedTouristLocation=selectedTouristLocation;
}

public String getHotelAddress() {
     return hotelAddress;
    }
    public void setHotelAddress(String hotelAddress) {
        this.hotelAddress = hotelAddress;
    }
    public String[] getSelectedTouristLocation() {
     return selectedTouristLocation;
    }
    public void setSelectedTouristLocation(String[] selectedTouristLocation) {
        this.selectedTouristLocation = selectedTouristLocation;
    }
    public void addTouristLocation(String location) {
        int k = -1;
        for (int i=0; i< selectedTouristLocation.length; i++) {
            if (selectedTouristLocation[i] == null) {
                k = i;
                break;
            }
        }
        if (k != -1) {
            selectedTouristLocation[k] = location;
        }
    }

    public void removeTouristLocation(String location) {
        int k = -1;
        for (int i = 0; i < selectedTouristLocation.length; i++) {
            if (selectedTouristLocation[i].equals(location)) {
                k = i;
                break;
            }
        }
        if (k == -1) {
            return;
        } else {
            for (int i = k; i < selectedTouristLocation.length - 1; i++) {
                selectedTouristLocation[i] = selectedTouristLocation[i + 1];
            }
            selectedTouristLocation[selectedTouristLocation.length - 1] = null;
        }
    }

}

