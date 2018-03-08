package nl.molvenolakeresort;

import java.time.*;

public class Reservation {

    private LocalDateTime reservationTime;
    private int numPersons;
    private Guest guest;

    public Reservation(LocalDateTime reservationTime, int numPersons, Guest guest) {
        this.reservationTime = reservationTime;
        this.numPersons = numPersons;
        this.guest = guest;
    }

    //   public void cancel(String reason){ }

}
