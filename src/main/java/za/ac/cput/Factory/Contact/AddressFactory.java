package za.ac.cput.Factory.Contact;

import za.ac.cput.Domain.contact.Address;
import za.ac.cput.Util.Helper;

import static za.ac.cput.Util.Helper.generateUniqueId;

public class AddressFactory {
    public static Address createAddress(String street, String city, String province, String country) {
        int addressId =generateUniqueId();
        if (Helper.isNullOrEmpty(street) || Helper.isNullOrEmpty(city)
                || Helper.isNullOrEmpty(province) || Helper.isNullOrEmpty(country)) {
            return null;
        }
        return new Address.Builder()
                .setAddressId(addressId)
                .setStreet(street)
                .setCity(city)
                .setProvince(province)
                .setCountry(country)
                .build();

    }
}
