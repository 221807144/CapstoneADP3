package za.ac.cput.Factory.booking;

import za.ac.cput.Domain.bookings.VehicleDisc;

import java.time.LocalDate;

import static za.ac.cput.Util.Helper.generateUniqueId;

public class VehicleDiscFactory {
    public static VehicleDisc disc(LocalDate issueDate, LocalDate expiryDate) {
        //generate a random number for the disc
        int vehicleDisc = generateUniqueId();
        if(issueDate == null || expiryDate == null)
            return null;
  return new VehicleDisc.Builder()
                .setIssueDate(issueDate)
                .setExpiryDate(expiryDate)
                .build();

    }
}
