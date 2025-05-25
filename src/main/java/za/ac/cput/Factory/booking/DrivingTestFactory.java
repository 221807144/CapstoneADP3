package za.ac.cput.Factory.booking;

import za.ac.cput.Domain.bookings.DrivingTest;
import za.ac.cput.Util.Helper;

import java.time.LocalDate;

public class DrivingTestFactory {
    public static DrivingTest createDrivingTest(int driverLicenseID, String examiner, int testID, String testAddress, String testVenue,
                                                LocalDate testDate, boolean testResult, double testAmount) {
        if (Helper.isNullOrEmpty(examiner) || Helper.isNullOrEmpty(testAddress)
                || Helper.isNullOrEmpty(testVenue) ) {
            return null;
        }


        if (testDate.isBefore(LocalDate.now())) {
            return null;
        }

        DrivingTest drivingTest = new DrivingTest.Builder()
                .setDriverLicenseID(driverLicenseID)
                .setExaminer(examiner)
                .setTestID(testID)
                .setTestAddress(testAddress)
                .setTestVenue(testVenue)
                .setTestDate(testDate)
                .setTestResult(testResult)
                //.setLicenseCode(licenseCode)
                .setTestAmount(testAmount)

                .build();

        return drivingTest;
    }

        }







