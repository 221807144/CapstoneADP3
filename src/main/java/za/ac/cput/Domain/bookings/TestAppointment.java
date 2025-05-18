package za.ac.cput.Domain.bookings;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.util.Objects;
//Sinokholo Singazi 222705698
@Entity
public class TestAppointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected int testID;
    protected String testAddress;
    protected String testVenue;
    protected LocalDate testDate;
    protected boolean testResult;
    protected String licenseCode;
    protected double testAmount;

    public TestAppointment() {
    }
    private TestAppointment(Builder builder) {
        this.testID = builder.testID;
        this.testAddress = builder.testAddress;
        this.testVenue = builder.testVenue;
        this.testDate = builder.testDate;
        this.testResult = builder.testResult;
        this.licenseCode = builder.licenseCode;
        this.testAmount = builder.testAmount;
    }

    public String getLicenseCode() {
        return licenseCode;
    }

    public String getTestAddress() {
        return testAddress;
    }

    public double getTestAmount() {
        return testAmount;
    }

    public LocalDate getTestDate() {
        return testDate;
    }

    public boolean isTestResult() {
        return testResult;
    }

    public int getTestID() {
        return testID;
    }

    public String getTestVenue() {
        return testVenue;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        TestAppointment test = (TestAppointment) o;
        return testResult == test.testResult && testAmount == test.testAmount && Objects.equals(testID, test.testID) && Objects.equals(testAddress, test.testAddress) && Objects.equals(testVenue, test.testVenue) && Objects.equals(testDate, test.testDate) && Objects.equals(licenseCode, test.licenseCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(testID, testAddress, testVenue, testDate, testResult, licenseCode, testAmount);
    }
    @Override
    public String toString() {
        return "Test{" +
                "testID='" + testID + '\'' +
                ", testAddress='" + testAddress + '\'' +
                ", testVenue='" + testVenue + '\'' +
                ", testDate=" + testDate +
                ", testResult=" + testResult +
                ", licenseCode='" + licenseCode + '\'' +
                ", testAmount=" + testAmount +
                '}';
    }
    public static class Builder {
        private int testID;
        private String testAddress;
        private String testVenue;
        private LocalDate testDate;
        private boolean testResult;
        private String licenseCode;
        private double testAmount;

        public Builder setTestID(int testID) {
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

        public Builder setTestAmount(double testAmount) {
            this.testAmount = testAmount;
            return this;
        }
        public Builder copy(TestAppointment test) {
            this.testID = test.testID;
            this.testAddress = test.testAddress;
            this.testVenue = test.testVenue;
            this.testDate = test.testDate;
            this.testResult = test.testResult;
            this.licenseCode = test.licenseCode;
            this.testAmount = test.testAmount;
            return this;

        }
        public TestAppointment build() {
            return new TestAppointment(this);
        }
    }

}