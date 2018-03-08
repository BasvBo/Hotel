package nl.molvenolakeresort;

public class Guest {

    private String name;
    private String phoneNumber;
    private Gender gender;

    public void placeOrder(Order order){
        System.out.println("Order being placed");
    }

    public void payOrder(double totalPrice){
        System.out.println("Paying order");
    }
}
