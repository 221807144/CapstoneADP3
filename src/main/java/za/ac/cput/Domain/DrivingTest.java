package za.ac.cput.Domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class DrivingTest extends Test {
    @Id
    private String driverLicenseID;
    private String examiner;

    public DrivingTest() {
    }

    private DrivingTest(Builder builder) {
        this.driverLicenseID = builder.driverLicenseID;
        this.examiner = builder.examiner;
        this.testID = builder.testID;
        this.testAddress = builder.testAddress;
        this.testVenue = builder.testVenue;
        this.testDate = builder.testDate;
        this.testResult = builder.testResult;
        this.licenseCode = builder.licenseCode;
        this.testAmount = builder.testAmount;
    }

    public String getDriverLicenseID() {
        return driverLicenseID;
    }

    public String getExaminer() {
        return examiner;
    }

    @Override
    public String toString() {
        return "DrivingTest{" +
                "driverLicenseID='" + driverLicenseID + '\'' +
                ", examiner='" + examiner + '\'' +
                ", testID='" + testID + '\'' +
                ", testAddress='" + testAddress + '\'' +
                ", testVenue='" + testVenue + '\'' +
                ", testDate=" + testDate +
                ", testResult=" + testResult +
                ", licenseCode='" + licenseCode + '\'' +
                ", testAmount=" + testAmount +
                '}';
    }

    public static class Builder {
        private String driverLicenseID;
        private String examiner;
        private String testID;
        private String testAddress;
        private String testVenue;
        private LocalDate testDate;
        private boolean testResult;
        private String licenseCode;
        private int testAmount;

        public Builder setDriverLicenseID(String driverLicenseID) {
            this.driverLicenseID = driverLicenseID;
            return this;
        }

        public Builder setExaminer(String examiner) {
            this.examiner = examiner;
            return this;
        }

        public Builder setTestID(String testID) {
            this.testID = testID;
            return this;
        }

        public Builder setTestAddress(String testAddress) {
            this.testAddress = testAddress;
            return this;
        }

        public Builder setTestVenue(String testVenue) {
            this.testVenue = testVenue;
            return this;
        }

        public Builder setTestDate(LocalDate testDate) {
            this.testDate = testDate;
            return this;
        }

        public Builder setTestResult(boolean testResult) {
            this.testResult = testResult;
            return this;
        }

        public Builder setLicenseCode(String licenseCode) {
            this.licenseCode = licenseCode;
            return this;
        }

        public Builder setTestAmount(int testAmount) {
            this.testAmount = testAmount;
            return this;
        }

        public Builder copy(DrivingTest drivingTest) {
            this.driverLicenseID = drivingTest.driverLicenseID;
            this.examiner = drivingTest.examiner;
            this.testID = drivingTest.testID;
            this.testAddress = drivingTest.testAddress;
            this.testVenue = drivingTest.testVenue;
            this.testDate = drivingTest.testDate;
            this.testResult = drivingTest.testResult;
            this.licenseCode = drivingTest.licenseCode;
            this.testAmount = drivingTest.testAmount;
            return this;
        }

        public DrivingTest build() {
            return new DrivingTest(this);
        }
    }
}
