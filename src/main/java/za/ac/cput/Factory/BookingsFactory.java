package za.ac.cput.Factory;

import za.ac.cput.Domain.bookings.Bookings;
import za.ac.cput.Domain.bookings.Test;
import za.ac.cput.Domain.bookings.VehicleDisc;
import za.ac.cput.Util.Helper;

import java.time.LocalDate;



public class BookingsFactory {

    private static Bookings createBookings( LocalDate bookingDate, String bookingType, Double bookingAmount, Test test, VehicleDisc vehicleDisc) {

        int bookingId = Helper.generateUniqueId();
if (bookingAmount == null || bookingAmount <= 0)
            return null;
if(Helper.isNullOrEmpty(bookingType))
    return null;

if(Helper.isDateInPast(bookingDate)|| !Helper.isNullOrEmpty(bookingDate.toString()))
    return null;

        if (test == null || vehicleDisc == null) {
            return null;
        }





        return new Bookings.Builder()
                .setBookingId(bookingId)
                .setBookingDate(bookingDate)
                .setBookingType(bookingType)
                .setBookingAmount(bookingAmount)
                .setTest(test)
                .setVehicleDisc(vehicleDisc)
                .build();
    }
}