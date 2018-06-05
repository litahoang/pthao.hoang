/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;

import Assignment2.Booking;

/**
 *
 * @author hoangthao
 */
public class mainBooking {

    public static void main(String[] args) {
        Booking lodonBooking = new Booking("LD452BC", 34, 344, "VIP", 422, "London");
        lodonBooking.getTotalPrice();
        lodonBooking.ticketConfirmation();

        Booking singaporeBooking = new Booking("SG7632", 1, 666, "Economy", 987, "Singapore");
        singaporeBooking.getTotalPrice();
        singaporeBooking.ticketConfirmation();
    }

}
