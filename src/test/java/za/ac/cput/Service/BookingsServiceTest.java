package za.ac.cput.Service;

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.Domain.bookings.*;
import za.ac.cput.Factory.BookingsFactory;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class BookingServiceTest {

    @Autowired
    private IBookingService bookingsService;

    private static final LearnersTest learnersTest = new LearnersTest();
    private static final DrivingTest drivingTest = new DrivingTest();
    private static final VehicleDisc vehicleDisc = new VehicleDisc();

    private static final Bookings booking = BookingsFactory.createBookings(
            LocalDate.now().plusDays(3),
            "Driving Test",
            200.0,
            learnersTest,
            vehicleDisc,
            drivingTest
    );

    @Test
    @Order(1)
    void create() {
        Bookings created = bookingsService.create(booking);
        assertNotNull(created);
        assertEquals(booking.getBookingId(), created.getBookingId());
    }

    @Test
    @Order(2)
    void read() {
        Bookings found = bookingsService.read(booking.getBookingId());
        assertNotNull(found);
    }

    @Test
    @Order(3)
    void update() {
        Bookings updatedBooking = new Bookings.Builder()
                .copy(booking)
                .setBookingType("Updated Type")
                .build();
        Bookings updated = bookingsService.update(updatedBooking);
        assertEquals("Updated Type", updated.getBookingType());
    }

    @Test
    @Order(4)
    void findAll() {
        List<Bookings> all = bookingsService.getall();
        assertFalse(all.isEmpty());
    }

    @Test
    @Order(5)
    void delete() {
        bookingsService.delete(booking.getBookingId());
        Bookings deleted = bookingsService.read(booking.getBookingId());
        assertNull(deleted);
    }
}
