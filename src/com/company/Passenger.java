package com.company;

public class Passenger {
    public int id;
    public Address address;

    public static class Contact{
        String name, phoneNumber, emailId;
        Contact(String name, String phoneNumber, String emailId){
            this.name=name;
            this.phoneNumber=phoneNumber;
            this.emailId=emailId;
        }
    }
    private Contact contact;

    public Passenger(String name, String phoneNumber, String emailId, String addressStreet, String city, String state, int pinCode){

        this.address=new Address(addressStreet, city, state, pinCode);
        this.contact=new Contact(name, phoneNumber, emailId);
    }

    public int getId(){
        return this.id;
    }

    public String getContact(){
        return "Name: " + contact.name + ", Phone: " + contact.phoneNumber + ", Email: " + contact.emailId;
    }


}
