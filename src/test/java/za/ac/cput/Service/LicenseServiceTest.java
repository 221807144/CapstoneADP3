package za.ac.cput.Service;

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.Domain.licence.License;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class LicenseServiceTest {

    @Autowired
    private ILicenseService licenseService;

    private static License license;


    @BeforeAll
    static void setUp() {
        license = new License.Builder()
                .setIssueDate(String.valueOf(LocalDate.now()))
                .setExpiryDate(String.valueOf(LocalDate.now().plusYears(5)))
                .setLicenseType("Code B")
                .build();
    }

    @Test
    @Order(1)
    void create() {
        License created = licenseService.create(license);
        assertNotNull(created);
        assertEquals(license.getLicenseType(), created.getLicenseType());
        license = created; // Save the created license for later tests
        System.out.println("Created: " + created);
    }

    @Test
    @Order(2)
    void read() {
        License found = licenseService.read(license.getLicenseId());
        assertNotNull(found);
        assertEquals(license.getLicenseType(), found.getLicenseType());
        System.out.println("Read: " + found);
    }

    @Test
    @Order(3)
    void update() {

        License updatedLicense = new License.Builder()
                    .copy(license)
                    .setLicenseType("Code EC")
                    .build();

            License updated = licenseService.update(updatedLicense);
            assertNotNull(updated);
            assertEquals("Code EC", updated.getLicenseType());
        }}