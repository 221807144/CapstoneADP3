package za.ac.cput.Factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.Domain.bookings.VehicleDisc;

import static org.junit.jupiter.api.Assertions.*;
class BookingsFactoryTest {
    Test test = FactoryTest.createTest("Test", "Test", "Test", "Test", "Test");
    VehicleDisc vehicleDisc = VehicleDiscFactory.createVehicleDisc("Test", "Test", "Test", "Test", "Test");

  
}