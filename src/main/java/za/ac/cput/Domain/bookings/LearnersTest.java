package za.ac.cput.Domain.bookings;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;
//Sinokholo Singazi 222705698
@Entity
public class LearnersTest extends Test {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int learnersLicenceID;
    private int testScore;

    public LearnersTest() {
    }

    private LearnersTest(Builder builder) {
        this.learnersLicenceID = builder.learnersLicenceID;
        this.testScore = builder.testScore;
        this.testID = builder.testID;
        this.testAddress = builder.testAddress;
        this.testVenue = builder.testVenue;
        this.testDate = builder.testDate;
        this.testResult = builder.testResult;
        this.licenseCode = builder.licenseCode;
        this.testAmount = builder.testAmount;
    }
    public int getLearnersLicenceID() {
        return learnersLicenceID;
    }
    public int getTestScore() {
        return testScore;
    }
    @Override
    public String toString() {
        return "LearnersTest{" +
                "learnersLicenceID='" + learnersLicenceID + '\'' +
                ", testScore=" + testScore +
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
        private int learnersLicenceID;
        private int testScore;
        private int testID;
        private String testAddress;
        private String testVenue;
        private LocalDate testDate;
        private boolean testResult;
        private String licenseCode;
        private int testAmount;

        public Builder setLearnersLicenceID(int learnersLicenceID) {
            this.learnersLicenceID = learnersLicenceID;
            return this;
        }

        public Builder setTestScore(int testScore) {
            this.testScore = testScore;
            return this;
        }

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

        public Builder setTestAmount(int testAmount) {
            this.testAmount = testAmount;
            return this;
        }
        public Builder copy(LearnersTest learnersTest) {
            this.learnersLicenceID = learnersTest.learnersLicenceID;
            this.testScore = learnersTest.testScore;
            this.testID = learnersTest.testID;
            this.testAddress = learnersTest.testAddress;
            this.testVenue = learnersTest.testVenue;
            this.testDate = learnersTest.testDate;
            this.testResult = learnersTest.testResult;
            this.licenseCode = learnersTest.licenseCode;
            this.testAmount = learnersTest.testAmount;
            return this;
        }

        public LearnersTest build() {
            return new LearnersTest(this);
        }
    }
}