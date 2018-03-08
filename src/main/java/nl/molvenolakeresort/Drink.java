package nl.molvenolakeresort;

import java.util.ArrayList;

public class Drink {

    private String name;
    private double price;
    private boolean hasAlcohol;
    private boolean isWarm;

    @Override
    public String toString() {
        return "Drink{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", hasAlcohol=" + hasAlcohol +
                ", isWarm=" + isWarm +
                '}';
    }

    /**public void displayInformation(Drink){
        System.out.println(name + price);
        if (hasAlcohol){
            System.out.println("Deze drank heeft alcohol");
        } else{
            System.out.println("Deze drank heeft geen alcohol");
        }
        if (isWarm){
            System.out.println("Deze drank is warm");
        } else{
            System.out.println("Deze drank is koud");
        }
    }*/


    public Drink(String name, double price, boolean hasAlcohol, boolean isWarm) {
        this.name = name;
        this.price = price;
        this.hasAlcohol = hasAlcohol;
        this.isWarm = isWarm;
    }
}
