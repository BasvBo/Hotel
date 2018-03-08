package nl.molvenolakeresort;

import java.time.LocalDateTime;

import static nl.molvenolakeresort.Gender.*;

public class App
{
    public static void main( String[] args ) {

        Guest newGuest = new Guest("Julius von Gueston", "0666677788", OTHER);

        Reservation newReservation = new Reservation(LocalDateTime.now(), 5, newGuest);

        Menu newMenu = new Menu();

        System.out.println("Drinks");

        newMenu.drinkList();

        System.out.println("Dishes");

        newMenu.dishList();

    }
}
