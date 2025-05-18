//package za.ac.cput.Factory;
//
//import org.junit.jupiter.api.Test;
//import za.ac.cput.Domain.bookings.Bookings;
//import za.ac.cput.Domain.contact.Address;
//import za.ac.cput.Domain.contact.Contact;
//import za.ac.cput.Domain.user.User;
//import za.ac.cput.Factory.Contact.AddressFactory;
//import za.ac.cput.Factory.Contact.ContactFactory;
//import za.ac.cput.Factory.User.UserFactory;
//import za.ac.cput.Factory.BookingsFactory;
//
//import java.time.LocalDate;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class UserFactoryTest {
//    Address address = AddressFactory.createAddress("123 Main St", "Cape Town", "Western Cape", "South Africa");
//    Contact contact = ContactFactory.createContact("0719250925", "sisipho@gmail.com");
//    Bookings bookings = BookingsFactory.createBookings(LocalDate.parse("2023-10-01"), "Tset", "R100 ", 2, 1);
//    User user1 = UserFactory.createUser(1, "Sinokholo", "Singazi", "0404291234080", address, contact, bookings);
//
//    @Test
//    void createUser() {
//        assertNotNull(user1);
//        System.out.println(user1.toString());
//    }
//}