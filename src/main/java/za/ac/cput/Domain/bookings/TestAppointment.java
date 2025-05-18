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

}