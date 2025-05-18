package za.ac.cput.Factory;

import za.ac.cput.Domain.bookings.VehicleDisc;
import za.ac.cput.Domain.registration.Vehicle;
import za.ac.cput.Util.Helper;

import java.time.LocalDate;

import static za.ac.cput.Util.Helper.generateUniqueId;

public class VehicleFactory {
    private Vehicle createVehicle(String vehicleType, String vehicleModel, LocalDate vehicleYear, String vehicleColor, VehicleDisc vehicleDisc) {
        // generate the ID
        int vehicleID = generateUniqueId();
        if (Helper.isNullOrEmpty(vehicleType) || Helper.isNullOrEmpty(vehicleModel) || Helper.isNullOrEmpty(vehicleColor) || vehicleYear == null)
            return null;

       return new Vehicle.Builder()
               // .setVehicleID(vehicleID)
                .setVehicleType(vehicleType)
                .setVehicleModel(vehicleModel)
                .setVehicleYear(vehicleYear)
                .setVehicleColor(vehicleColor)
                .setVehicleDisc(vehicleDisc)
                .build();
    }
}
