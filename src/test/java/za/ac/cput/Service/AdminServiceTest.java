package za.ac.cput.Service;

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.Domain.bookings.*;
import za.ac.cput.Domain.contact.Contact;
import za.ac.cput.Domain.payment.Payments;
import za.ac.cput.Domain.user.Admin;
import za.ac.cput.Factory.BookingsFactory;
import za.ac.cput.Factory.Contact.ContactFactory;
import za.ac.cput.Factory.User.AdminFactory;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class AdminServiceTest {

    @Autowired
    private IAdminService adminService;
    private static final LearnersTest learnersTest = new LearnersTest(); // or use a factory
    private static final VehicleDisc vehicleDisc = new VehicleDisc(); // or use a factory
    private static final DrivingTest drivingTest = new DrivingTest(); // or use a factory
    //private static final Bookings bookings = BookingsFactory.createBookings(
           private static final Bookings bookings = BookingsFactory.createBookings(
                    LocalDate.now().plusDays(7), // Use a future date
                    "Test",
                    100.0,
                    learnersTest,
                    vehicleDisc,
                    drivingTest
            );

    // Make these static so they can be used in the static admin field
    private static final Contact contact = ContactFactory.createContact("0712345678", "admin@example.com");
    //private static final Bookings bookings = BookingsFactory.createBookings("123456789", "2023-10-01", "2023-10-02", "Confirmed");
    private static final TestAppointment testAppointment = new TestAppointment(); // or use a factory
    private static final Payments payments = new Payments(); // or use a factory

    private static final Admin admin = AdminFactory.create(
            "adminId1",
            "John",
            "Doe",
            contact,
            bookings,
            testAppointment,
            payments
    );
    @Test
    @Order(1)
    void create() {
        Admin created = adminService.create(admin);
        assertNotNull(created);
        assertEquals(admin.getAdminId(), created.getAdminId());
    }

    @Test
    @Order(2)
    void read() {
        Admin found = adminService.read(admin.getAdminId());
        assertNotNull(found);
        assertEquals(admin.getAdminId(), found.getAdminId());
    }

    @Test
    @Order(3)
    void update() {
        Admin updatedAdmin = new Admin.Builder()
                .copy(admin)
                .setAdminName("Jane")
                .build();
        Admin updated = adminService.update(updatedAdmin);
        assertNotNull(updated);
        assertEquals("Jane", updated.getAdminName());
    }

    @Test
    @Order(4)
    void findById() {
        Admin found = adminService.findById(admin.getAdminId());
        assertNotNull(found);
    }

    @Test
    @Order(5)
    void findAll() {
        List<Admin> admins = adminService.findAll();
        assertFalse(admins.isEmpty());
    }

    @Test
    @Order(6)
    void delete() {
        adminService.delete(admin.getAdminId());
        Admin deleted = adminService.read(admin.getAdminId());
        assertNull(deleted);
    }
}