package za.ac.cput.Factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.Domain.bookings.Bookings;
import za.ac.cput.Domain.bookings.DrivingTest;
import za.ac.cput.Domain.bookings.LearnersTest;
import za.ac.cput.Domain.bookings.VehicleDisc;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

//Emihle Thole
// 221755349
//18/05/18
public class BookingsFactoryTest {

    @Test
    public void testBookingForLearnersTest() {
        Bookings booking = BookingsFactory.createBookings(
                LocalDate.now().plusDays(7),
                "Learner's Test",
                180.00,
                new LearnersTest(),
                null,
                new VehicleDisc()
        );
        assertNotNull(booking);
    }

    @Test
    public void testBookingForDrivingTest() {
        Bookings booking = BookingsFactory.createBookings(
                LocalDate.now().plusDays(7),
                "Driving Test",
                250.00,
                null,
                new VehicleDisc(),
                new DrivingTest()
        );
        assertNotNull(booking);
    }

    @Test
    public void testBookingFailsWithPastDate() {
        Bookings booking = BookingsFactory.createBookings(
                LocalDate.now().minusDays(1),
                "Learner's Test",
                100.00,
                new LearnersTest(),
                null,
                new VehicleDisc()
        );
        assertNull(booking);
    }
}
