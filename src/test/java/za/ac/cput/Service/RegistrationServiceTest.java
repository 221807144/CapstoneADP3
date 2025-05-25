package za.ac.cput.Service;

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.Domain.bookings.VehicleDisc;
import za.ac.cput.Domain.registration.Registration;
import za.ac.cput.Domain.registration.Vehicle;
import za.ac.cput.Factory.booking.VehicleDiscFactory;
import za.ac.cput.Factory.registration.RegistrationFactory;
import za.ac.cput.Factory.registration.VehicleFactory;
import za.ac.cput.Repository.VehicleDiscRepository;
import za.ac.cput.Repository.VehicleRepository;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class RegistrationServiceTest {
    @Autowired
    private RegistrationService registrationService;

    @Autowired
    private VehicleRepository vehicleRepository;
    @Autowired
    private VehicleDiscRepository vehicleDiscRepository;
    private static VehicleDisc disc;
    private static Vehicle vehicle;
    private static Registration registration;

    @BeforeAll
    static void setUp() {
        disc = VehicleDiscFactory.disc(LocalDate.parse("2023-01-01"), LocalDate.parse("2024-01-01"));
        vehicle = VehicleFactory.createVehicle("Nissan", "Qashqai", LocalDate.parse("2023-01-01"), "White", disc);
        registration = RegistrationFactory.createRegistration("VH234566", "2024-01-01", vehicle);
    }

    @Test
    @Order(1)
    void create() {
        vehicleDiscRepository.save(disc);
        vehicleRepository.save(vehicle);
        Registration created = registrationService.create(registration);
        assertNotNull(created);
        assertEquals(registration.getRegistrationNumber(), created.getRegistrationNumber());
        System.out.println("Created: " + created);
    }

    @Test
    void read() {
    }

    @Test
    void update() {
    }

    @Test
    void delete() {
    }

    @Test
    void getAll() {
    }
}