package nl.molvenolakeresort;

import java.util.ArrayList;
import java.util.List;

import static nl.molvenolakeresort.Course.*;

public class Menu {

private List<Drink> drinks;
private List<Dish> dishes;
private double menuPrice;

    public void drinkList(){
        ArrayList<Drink> drinkArrayList = new ArrayList<>();
        Drink water = new Drink("Water",1.00, false, false);
        Drink tea = new Drink("Tea",2.00, false, true);
        Drink beer = new Drink("Beer",3.00, true, false);
        Drink wine = new Drink("Wine",3.00, true, false);
        drinkArrayList.add(water);
        drinkArrayList.add(tea);
        drinkArrayList.add(beer);
        drinkArrayList.add(wine);

        for (Drink drinks : drinkArrayList){
            System.out.println(drinks.toString());
        }
    }
    public void dishList(){
        ArrayList<Dish> dishArrayList = new ArrayList<>();
        Dish soup = new Dish("Tomato Soup",5.00, ENTREE);
        Dish potatoes = new Dish("Potatoes with Cauliflower",7.00, MAIN);
        Dish dessert = new Dish("Vanilla Ice Cream",6.00, DESSERT);
        dishArrayList.add(soup);
        dishArrayList.add(potatoes);
        dishArrayList.add(dessert);

        for (Dish dishes : dishArrayList){
            System.out.println(dishes.toString());
        }
    }

    public Menu(){
    }

    public Menu(List<Drink> drinks, List<Dish> dishes, double menuPrice) {
        this.drinks = drinks;
        this.dishes = dishes;
        this.menuPrice = menuPrice;
    }
}
