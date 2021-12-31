package com.company;

public class Address {
    public String addressStreet, city, state;
    int pinCode;

    Address(String addressStreet, String city, String state, int pinCode) {
        this.addressStreet = addressStreet;
        this.city = city;
        this.state = state;
        this.pinCode = pinCode;
    }

    private Address address;

    public String getAddressDetails() {
        return "Street: " + address.addressStreet + ", City: " + address.city + ", State: " + address.state;
    }
public void updateAddressDetails(Address address,String addressStreet, String city, String state, int pinCode){
    this.addressStreet = addressStreet;
    this.city = city;
    this.state = state;
    this.pinCode = pinCode;
}
}
