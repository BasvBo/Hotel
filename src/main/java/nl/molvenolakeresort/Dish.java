package nl.molvenolakeresort;

import java.util.List;

public class Dish {

    private String name;
    private double price;
    private List<Ingredient> ingredientList;
    private Course course;

    public Dish(String name, double price, Course course) {
        this.name = name;
        this.price = price;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", course=" + course +
                '}';
    }
}
