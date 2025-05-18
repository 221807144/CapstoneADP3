package za.ac.cput.Factory;

import za.ac.cput.Domain.bookings.Bookings;
import za.ac.cput.Domain.bookings.TestAppointment;
import za.ac.cput.Domain.bookings.TestAppointment;
import za.ac.cput.Domain.bookings.VehicleDisc;
import za.ac.cput.Util.Helper;

import java.time.LocalDate;



public class BookingsFactory {

    public static Bookings createBookings(LocalDate bookingDate, String bookingType, Double bookingAmount, TestAppointment testAppointment, VehicleDisc vehicleDisc) {

        int bookingId = Helper.generateUniqueId();
if (bookingAmount == null || bookingAmount <= 0)
            return null;
if(Helper.isNullOrEmpty(bookingType))
    return null;

if(Helper.isDateInPast(bookingDate)|| !Helper.isNullOrEmpty(bookingDate.toString()))
    return null;

        if (testAppointment == null || vehicleDisc == null) {
            return null;
        }



        return new Bookings.Builder()
                .setBookingId(bookingId)
                .setBookingDate(bookingDate)
                .setBookingType(bookingType)
                .setBookingAmount(bookingAmount)
                .setTest(testAppointment)
                .setVehicleDisc(vehicleDisc)
                .build();
    }
}