package com.company;

public class Passenger {
    private int id;
    private static int idCounter=0;
    private static class Address {
        String addressStreet, city, state;
        int pinCode;

        Address(String addressStreet, String city, String state, int pinCode) {
            this.addressStreet = addressStreet;
            this.city = city;
            this.state = state;
            this.pinCode = pinCode;
        }
        public void updateAddressDetails(Address address, String addressStreet, String city, String state, int pinCode){
            this.addressStreet = addressStreet;
            this.city = city;
            this.state = state;
            this.pinCode = pinCode;
        }
    }

        private Address address;

    private static class Contact{
        String name, phoneNumber, emailId;
        Contact(String name, String phoneNumber, String emailId){
            this.name=name;
            this.phoneNumber=phoneNumber;
            this.emailId=emailId;
        }
    }
    private Contact contact;

    public Passenger(String name, String phoneNumber, String emailId, String addressStreet, String city, String state, int pinCode){
        this.id = ++idCounter;
        //instantiating Address and Contact classes inside the Passenger constructor
        this.address=new Address(addressStreet, city, state, pinCode);
        this.contact=new Contact(name, phoneNumber, emailId);
    }

    public int getId(){
        return this.id;
    }

    public String getContact(){
        return "Name: " + contact.name + ", Phone: " + contact.phoneNumber + ", Email: " + contact.emailId;
    }
    public String getAddressDetails() {
        return "Street: " + address.addressStreet + ", City: " + address.city + ", State: " + address.state;
    }
    public int getIdCounter(){
        return idCounter;
    }

}
