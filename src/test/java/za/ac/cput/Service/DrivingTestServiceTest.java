package za.ac.cput.Service;


import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.Domain.bookings.DrivingTest;
import za.ac.cput.Factory.DrivingTestFactory;


import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class DrivingTestServiceTest {

    @Autowired
    private DrivingTestService drivingTestService;

    private static DrivingTest test;

    @BeforeEach
    void setUp() {
        test = DrivingTestFactory.createDrivingTest(
                111, "John Examiner", 101, "123 Main St", "Cape Town Testing Centre",
                LocalDate.now().plusDays(5), true, 350.0
        );
    }

    @Test
    @Order(1)
    void create() {
        DrivingTest created = drivingTestService.create(test);
        assertNotNull(created);
        assertEquals(test.getExaminer(), created.getExaminer());
        System.out.println("Created: " + created);
    }

    @Test
    @Order(2)
    void read() {
        DrivingTest read = drivingTestService.read(test.getTestID());
        assertNotNull(read);
        assertEquals(test.getTestID(), read.getTestID());
    }

    @Test
    @Order(3)
    void update() {
        DrivingTest updated = new DrivingTest.Builder()
                .copy(test)
                .setTestResult(false)
                .build();
        DrivingTest result = drivingTestService.update(updated);
        assertNotNull(result);
        assertFalse(result.isTestResult());
    }

    @Test
    @Order(4)
    void findByTestId() {
        List<DrivingTest> tests = drivingTestService.findByTestId(test.getTestID());
        assertFalse(tests.isEmpty());
    }

    @Test
    @Order(5)
    @Disabled // Optional: Enable this when you're ready
    void delete() {
        drivingTestService.delete(test.getTestID());
        DrivingTest deleted = drivingTestService.read(test.getTestID());
        assertNull(deleted);
    }
}
