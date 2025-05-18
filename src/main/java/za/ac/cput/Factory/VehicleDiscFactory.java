package za.ac.cput.Factory;

import za.ac.cput.Domain.bookings.Bookings;
import za.ac.cput.Domain.bookings.VehicleDisc;
import za.ac.cput.Domain.registration.Vehicle;

import java.time.LocalDate;

import static za.ac.cput.Util.Helper.generateUniqueId;

public class VehicleDiscFactory {
    private static VehicleDisc disc(LocalDate issueDate, LocalDate expiryDate) {
        //generate a random number for the disc
        int vehicleDisc = generateUniqueId();

  return new VehicleDisc.Builder()
                .setIssueDate(issueDate)
                .setExpiryDate(expiryDate)
                .build();

    }
}
