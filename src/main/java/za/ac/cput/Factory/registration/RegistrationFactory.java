package za.ac.cput.Factory.registration;

import za.ac.cput.Domain.registration.Registration;
import za.ac.cput.Domain.registration.Vehicle;
import za.ac.cput.Util.Helper;

import static za.ac.cput.Util.Helper.generateUniqueId;

public class RegistrationFactory {
   public static Registration createRegistration (String registrationNumber, String registrationDate, Vehicle vehicle) {
       int registrationId = generateUniqueId();
       if(Helper.isNullOrEmpty(registrationNumber) || Helper.isNullOrEmpty(registrationDate)|| vehicle == null) {
           return null;
       }
         return new Registration.Builder()
                .setRegistrationNumber(registrationNumber)
                .setRegistrationDate(registrationDate)
                .build();
    }
}
