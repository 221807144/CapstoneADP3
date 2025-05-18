package za.ac.cput.Factory.User;

import za.ac.cput.Domain.bookings.Bookings;
import za.ac.cput.Domain.bookings.TestAppointment;
import za.ac.cput.Domain.bookings.TestAppointment;
import za.ac.cput.Domain.contact.Contact;
import za.ac.cput.Domain.payment.Payments;
import za.ac.cput.Domain.user.Admin;
import za.ac.cput.Util.Helper;

import static za.ac.cput.Util.Helper.generateUniqueId;

public class AdminFactory {
    public static Admin create(String adminName, String adminSurname, String idNumber , Contact contact, Bookings adminBookings, TestAppointment testAppointment, Payments payment) {
        int adminId = generateUniqueId();
        if(Helper.isNullOrEmpty(adminName) || Helper.isNullOrEmpty(adminSurname) || Helper.isNullOrEmpty(idNumber) || contact==null || adminBookings==null || testAppointment==null || payment==null) {
            return null;
        }
        return new Admin.Builder()
                .setAdminId(adminId)
                .setAdminName(adminName)
                .setAdminSurname(adminSurname)
                .setIdNumber(idNumber)
                .setContact(contact)
                .setAdminBookings(adminBookings)
                .setTest(testAppointment)
                .setPayments(payment)
                .build();
    }
}
