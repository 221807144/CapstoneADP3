package za.ac.cput.Factory;

import za.ac.cput.Domain.bookings.*;
import za.ac.cput.Util.Helper;

import java.time.LocalDate;



public class BookingsFactory {

    public static Bookings createBookings(LocalDate bookingDate, String bookingType, Double bookingAmount, LearnersTest learnersTest, VehicleDisc vehicleDisc, DrivingTest drivingTest) {

        int bookingId = Helper.generateUniqueId();
if (bookingAmount == null || bookingAmount <= 0)
            return null;
if(Helper.isNullOrEmpty(bookingType))
    return null;

if(Helper.isDateInPast(bookingDate)|| !Helper.isNullOrEmpty(bookingDate.toString()))
    return null;
        if (vehicleDisc == null)
            return null;

        if (learnersTest == null && drivingTest == null)
            return null;




        return new Bookings.Builder()
                .setBookingId(bookingId)
                .setBookingDate(bookingDate)
                .setBookingType(bookingType)
                .setBookingAmount(bookingAmount)
                .setVehicleDisc(vehicleDisc)
                .setDrivingTest(drivingTest)
                .setLearnersTest(learnersTest)
                .build();
    }

    public static Bookings createBookings(LocalDate bookingDate, String drivingTest, double bookingAmount, LearnersTest learnersTest, VehicleDisc vehicleDisc, DrivingTest drivingTest1) {
    }
}