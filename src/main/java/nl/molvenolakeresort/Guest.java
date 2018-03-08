package nl.molvenolakeresort;

import java.util.List;

public class Guest {

    private String name;
    private String phoneNumber;
    private Gender gender;

    public Guest(String name, String phoneNumber, Gender gender) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }

    public void placeOrder(Order order){
        System.out.println("Order being placed");
    }

    public void payOrder(double totalPrice){
        System.out.println("Paying order");
    }
}
