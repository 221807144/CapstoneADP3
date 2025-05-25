package za.ac.cput.Factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.Domain.bookings.*;
import za.ac.cput.Domain.contact.Address;
import za.ac.cput.Domain.contact.Contact;
import za.ac.cput.Domain.user.User;
import za.ac.cput.Factory.Contact.AddressFactory;
import za.ac.cput.Factory.Contact.ContactFactory;
import za.ac.cput.Factory.User.UserFactory;
import za.ac.cput.Factory.BookingsFactory;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class UserFactoryTest {
    LearnersTest learnersTest = new LearnersTest(); // Use factory if available
    VehicleDisc vehicleDisc = new VehicleDisc(); // Use factory if available
    DrivingTest drivingTest = new DrivingTest(); // Use factory if available
    Bookings bookings = BookingsFactory.createBookings(
            LocalDate.now().plusDays(7), // Use a future date
            "Test",
            100.0,
            learnersTest,
            vehicleDisc,
            drivingTest
    );

    Address address = AddressFactory.createAddress("123 Main St", "Cape Town", "Western Cape", "South Africa");
    Contact contact = ContactFactory.createContact("0719250925", "sisipho@gmail.com");
    TestAppointment testAppointment = new TestAppointment(); // Replace with factory if available
   // VehicleDisc vehicleDisc = new VehicleDisc(); // Replace with factory if available
    //Bookings bookings = BookingsFactory.createBookings(LocalDate.parse("2023-10-01"), "Test", 100.0, testAppointment, vehicleDisc);
    User user1 = UserFactory.createUser("Sinokholo", "Singazi", "0404291234080", LocalDate.of(2000, 4, 29), contact, address, bookings);

    @Test
    void createUser() {
        assertNotNull(user1);
        System.out.println(user1.toString());
    }
}