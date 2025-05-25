package za.ac.cput.Factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.Domain.bookings.Bookings;
import za.ac.cput.Domain.bookings.DrivingTest;
import za.ac.cput.Domain.bookings.LearnersTest;
import za.ac.cput.Domain.bookings.VehicleDisc;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class BookingsFactoryTest {

    @Test
    public void testCreateValidBookingWithLearnersAndDrivingTest() {
        LocalDate futureDate = LocalDate.now().plusDays(5);
        LearnersTest learnersTest = new LearnersTest();
        DrivingTest drivingTest = new DrivingTest();
        VehicleDisc vehicleDisc = new VehicleDisc();

        Bookings booking = BookingsFactory.createBookings(futureDate, "Learners and Driving", 200.00, learnersTest, vehicleDisc, drivingTest);
        assertNotNull(booking);
        System.out.println(booking);
    }

    @Test
    public void testCreateBookingWithNullAmount() {
        LocalDate futureDate = LocalDate.now().plusDays(3);
        LearnersTest learnersTest = new LearnersTest();
        DrivingTest drivingTest = new DrivingTest();
        VehicleDisc vehicleDisc = new VehicleDisc();

        Bookings booking = BookingsFactory.createBookings(futureDate, "Null Amount", null, learnersTest, vehicleDisc, drivingTest);
        assertNull(booking);
    }

    @Test
    public void testCreateBookingWithPastDate() {
        LocalDate pastDate = LocalDate.now().minusDays(1);
        LearnersTest learnersTest = new LearnersTest();
        DrivingTest drivingTest = new DrivingTest();
        VehicleDisc vehicleDisc = new VehicleDisc();

        Bookings booking = BookingsFactory.createBookings(pastDate, "Past Date", 100.00, learnersTest, vehicleDisc, drivingTest);
        assertNull(booking);
    }

    @Test
    public void testCreateBookingWithNullVehicleDisc() {
        LocalDate futureDate = LocalDate.now().plusDays(5);
        LearnersTest learnersTest = new LearnersTest();
        DrivingTest drivingTest = new DrivingTest();

        Bookings booking = BookingsFactory.createBookings(futureDate, "No VehicleDisc", 120.00, learnersTest, null, drivingTest);
        assertNull(booking);
    }

    @Test
    public void testCreateBookingWithNullTests() {
        LocalDate futureDate = LocalDate.now().plusDays(5);
        VehicleDisc vehicleDisc = new VehicleDisc();

        Bookings booking = BookingsFactory.createBookings(futureDate, "No Tests", 150.00, null, vehicleDisc, null);
        assertNull(booking);
    }
}
