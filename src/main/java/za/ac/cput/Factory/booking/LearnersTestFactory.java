package za.ac.cput.Factory.booking;

import za.ac.cput.Domain.bookings.LearnersTest;
import za.ac.cput.Util.Helper;

import java.time.LocalDate;

public class LearnersTestFactory {
    // Factory method to create a LearnersTest object
    public static LearnersTest createLearnersTest(int learnersLicenseID, String testAddress, String testVenue,
                                                  LocalDate testDate, boolean testResult, String licenseCode,
                                                  double testAmount) {
        if (Helper.isNullOrEmpty(testAddress) || Helper.isNullOrEmpty(testVenue) || Helper.isNullOrEmpty(licenseCode)) {
            return null;
        }
        return new LearnersTest.Builder()
                .setLearnersLicenseID(learnersLicenseID)
                .setTestAddress(testAddress)
                .setTestVenue(testVenue)
                .setTestDate(testDate)
                .setTestResult(testResult)
                .setLicenseCode(licenseCode)
                .setTestAmount(testAmount)
                .build();
    }
}
