package za.ac.cput.Factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.Domain.bookings.VehicleDisc;
import za.ac.cput.Domain.licence.License;

import static org.junit.jupiter.api.Assertions.*;

class LicenseFactoryTest {

    @Test
    void setUp() {

            License license = new License.Builder()
                    .setLicenseId(123456789)
                    .setLicenseType("B")
                    .setIssueDate("2024-01-01")
                    .setExpiryDate("2025-01-01")
                    .build();

            assertNotNull(license);
            System.out.println(license.toString());



        }


    }




