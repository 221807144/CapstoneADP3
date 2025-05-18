package za.ac.cput.Factory.registration;

import org.junit.jupiter.api.Test;
import za.ac.cput.Domain.bookings.VehicleDisc;
import za.ac.cput.Domain.registration.Registration;
import za.ac.cput.Domain.registration.Vehicle;
import za.ac.cput.Factory.booking.VehicleDiscFactory;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class RegistrationFactoryTest {

//      private static VehicleDisc disc; // = VehicleDiscFactory.disc(LocalDate.parse("2023-01-01"), LocalDate.parse("2024-01-01"));
//      private static Vehicle vehicle ;// = VehicleFactory.createVehicle("Nissan", "Qashqai", LocalDate.parse("2023-01-01"), "White", disc);
//      private static Registration registration = RegistrationFactory.createRegistration("VH234566", "2024-01-01", vehicle);

        @Test
        void testRegistration() {
            VehicleDisc disc = VehicleDiscFactory.disc(LocalDate.parse("2023-01-01"), LocalDate.parse("2024-01-01"));
            Vehicle vehicle = VehicleFactory.createVehicle("Nissan", "Qashqai", LocalDate.parse("2023-01-01"), "White", disc);
            Registration registration = RegistrationFactory.createRegistration("VH234566", "2024-01-01", vehicle);

            assertNotNull(registration);
            System.out.println(registration.toString());
        }



    }

