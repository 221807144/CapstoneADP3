package za.ac.cput.Factory.User;

import org.junit.jupiter.api.Test;
import za.ac.cput.Domain.bookings.*;
import za.ac.cput.Domain.contact.Contact;
import za.ac.cput.Domain.payment.Payments;
import za.ac.cput.Domain.user.Admin;
import za.ac.cput.Factory.Contact.ContactFactory;
import za.ac.cput.Factory.BookingsFactory;
//import za.ac.cput.Factory.Payment.PaymentsFactory;
import za.ac.cput.Factory.payment.PaymentFactory;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class AdminFactoryTest {
    LearnersTest learnersTest = new LearnersTest();
    VehicleDisc vehicleDisc = new VehicleDisc();
    DrivingTest drivingTest = new DrivingTest();
    Bookings bookings = BookingsFactory.createBookings(
            LocalDate.now().plusDays(7),
            "Test",
            100.0,
            learnersTest,
            vehicleDisc,
            drivingTest
    );
    Contact contact = ContactFactory.createContact("0719250925", "admin@gmail.com");
    TestAppointment testAppointment = new TestAppointment();
    // Adjust the arguments below to match your PaymentsFactory.createPayments signature
    Payments payment = PaymentFactory.createPayments(
            "Card",                // paymentMethod
            "Paid",                // paymentDetails (e.g., status or reference)
            100.0,                 // paymentAmount
            LocalDate.now().plusDays(7) // paymentDate
    );

    Admin admin = AdminFactory.create(
            "AdminName",
            "AdminSurname",
            "1234567890123",
            contact,
            bookings,
            testAppointment,
            payment
    );

    @Test
    void createAdmin() {
        assertNotNull(admin);
        System.out.println(admin.toString());
    }
}