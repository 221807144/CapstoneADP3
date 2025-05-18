package za.ac.cput.Factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.Domain.bookings.LearnersTest;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class LearnersTestFactoryTest {

    @Test
    void createLearnersTest_ValidInput_ReturnsLearnersTest() {
        var learnersTest = LearnersTestFactory.createLearnersTest(
                1, "Address", "Venue", LocalDate.now(), true, "B", 200.0);

        assertNotNull(learnersTest);
        assertEquals(1, learnersTest.getLearnersLicenseID());
        assertEquals("Address", learnersTest.getTestAddress());
        assertEquals("Venue", learnersTest.getTestVenue());
        assertEquals("B", learnersTest.getLicenseCode());
        assertEquals(200.0, learnersTest.getTestAmount(), 0.01);
    }

    @Test
    void createLearnersTest_InvalidAddress_ReturnsNull() {
        var result = LearnersTestFactory.createLearnersTest(
                1, "", "Venue", LocalDate.now(), true, "B", 200.0);
        assertNull(result);
    }

    @Test
    void createLearnersTest_InvalidVenue_ReturnsNull() {
        var result = LearnersTestFactory.createLearnersTest(
                1, "Address", "", LocalDate.now(), true, "B", 200.0);
        assertNull(result);
    }

    @Test
    void createLearnersTest_InvalidLicenseCode_ReturnsNull() {
        var result = LearnersTestFactory.createLearnersTest(
                1, "Address", "Venue", LocalDate.now(), true, "", 200.0);
        assertNull(result);
    }
}