package za.ac.cput.Factory;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.Domain.bookings.DrivingTest;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class DrivingTestFactoryTest {
    private DrivingTest drivingTest;
    private DrivingTest drivingTest2;



    @BeforeEach
    void setUp() {
        drivingTest = DrivingTestFactory.createDrivingTest(1, "123456789", 123456789, "123456789", "123456789", LocalDate.now(), true, 1000.00);
        drivingTest2 = DrivingTestFactory.createDrivingTest(2, "987654321", 987654321, "987654321", "987654321", LocalDate.now(), false, 2000.00);

    }


    @Test
    void createDrivingTest() {





    }
}