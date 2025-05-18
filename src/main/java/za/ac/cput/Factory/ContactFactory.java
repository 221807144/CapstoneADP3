package za.ac.cput.Factory;

import za.ac.cput.Domain.contact.Contact;
import za.ac.cput.Util.Helper;

import static za.ac.cput.Util.Helper.generateUniqueId;

public class ContactFactory {
    public static Contact createContact(String cellphone, String email){

        int ContactId=generateUniqueId();

        if (Helper.isNullOrEmpty(cellphone)|| Helper.isNullOrEmpty(email)) {
            return null;
        }
        if (!Helper.isValidEmail(email)) {
            return null;

        }
        return new Contact.Builder().setContactId(ContactId).setCellphone(cellphone).setEmail(email).build();
    }

}
