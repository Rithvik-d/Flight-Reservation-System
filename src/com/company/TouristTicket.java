package com.company;

public class TouristTicket {
private String hotelAddress;
// all ready made private
private String [] selectedTouristLocation;
 TouristTicket(String hotelAddress,String[] selectedTouristLocation){
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

