package za.ac.cput.Factory;

import za.ac.cput.Domain.bookings.Bookings;
import za.ac.cput.Domain.contact.Address;
import za.ac.cput.Domain.contact.Contact;
import za.ac.cput.Domain.user.User;
import za.ac.cput.Util.Helper;

import java.time.LocalDate;

import static za.ac.cput.Util.Helper.generateUniqueId;

public class UserFactory {
public static User createUser(int UserId, String UserName, String UserSurname, String IdNumber, Address Address, Contact Contact, Bookings Bookings) {
   int userId = generateUniqueId();
    if(  Helper.isNullOrEmpty(UserName)|| Helper.isNullOrEmpty(UserSurname)||Helper.isNullOrEmpty(IdNumber)|| Address==null || Contact==null || Bookings==null) {
        return null;
    }
    LocalDate BirthDate = Helper.getDateOfBirth(IdNumber);
    return new User.Builder().
            setUserId(UserId)
            .setUserName(UserName)
            .setUserSurname(UserSurname)
            .setIdNumber(IdNumber)
            .setAddress(Address)
            .setContact(Contact)
            .setUserBooks(Bookings)
            .setBirthDate(BirthDate)
            .build();




}
}
