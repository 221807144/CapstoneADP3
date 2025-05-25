/*Emihle Thole
  221755349
  18/05/18*/

package za.ac.cput.Domain.bookings;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Bookings {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)

    private int bookingId;
    private LocalDate bookingDate;
    private String bookingType;
    private Double bookingAmount;
    @OneToOne
    @JoinColumn(name = "test_id")
    private DrivingTest drivingTest;
    @OneToOne
    @JoinColumn(name = "test_appointment_id")
    private LearnersTest learnersTest;

    @OneToOne
    @JoinColumn(name = "vehicle_disc_id")
    private VehicleDisc vehicleDisc;
    public Bookings() {
    }

    public Bookings(Builder builder) {
        this.bookingId = builder.bookingId;
        this.bookingDate = builder. bookingDate;
        this.bookingType = builder.bookingType;
        this.bookingAmount = builder.bookingAmount;
        this.vehicleDisc = builder.vehicleDisc;
        this.drivingTest = builder.drivingTest;
        this.learnersTest = builder.learnersTest;

    }

    public int getBookingId() {
        return bookingId;
    }

    public LocalDate getBookingDate() {
        return bookingDate;
    }

    public String getBookingType() {
        return bookingType;
    }

    public Double getBookingAmount() {
        return bookingAmount;

    }

    public VehicleDisc getVehicleDisc() {
        return vehicleDisc;

    }

    public DrivingTest getDrivingTest() {
        return drivingTest;
    }
    public LearnersTest getLearnersTest() {
        return learnersTest;
    }

    @Override
    public String toString() {
        return "Bookings{" +
                "bookingId=" + bookingId +
                ", bookingDate=" + bookingDate +
                ", bookingType='" + bookingType + '\'' +
                ", bookingAmount=" + bookingAmount +
                ", drivingTest=" + drivingTest +
                ", learnersTest=" + learnersTest +
                ", vehicleDisc=" + vehicleDisc +
                '}';
    }

    public static class Builder{

        private int bookingId;
        private LocalDate bookingDate;
        private String bookingType;
        private Double bookingAmount;
        private VehicleDisc vehicleDisc;
        private DrivingTest drivingTest;
        private LearnersTest learnersTest;

        public Builder setBookingId(int bookingId) {
            this.bookingId = bookingId;
            return this;
        }

        public Builder setBookingDate(LocalDate bookingDate) {
            this.bookingDate = bookingDate;
            return this;
        }

        public Builder setBookingType(String bookingType) {
            this.bookingType = bookingType;
            return this;
        }

        public Builder setBookingAmount(Double bookingAmount) {
            this.bookingAmount = bookingAmount;
            return this;
        }


        public Builder setVehicleDisc(VehicleDisc vehicleDisc) {
            this.vehicleDisc = vehicleDisc;
            return this;
        }
        public Builder setDrivingTest(DrivingTest drivingTest) {
            this.drivingTest = drivingTest;
            return this;
        }
        public Builder setLearnersTest(LearnersTest learnersTest) {
            this.learnersTest = learnersTest;
            return this;
        }

        public Builder copy(Bookings bookings) {
            this.bookingId = bookings.bookingId;
            this.bookingDate = bookings.bookingDate;
            this.bookingType = bookings.bookingType;
            this.bookingAmount = bookings.bookingAmount;
            this.vehicleDisc = bookings.vehicleDisc;
            this.drivingTest = bookings.drivingTest;
            this.learnersTest = bookings.learnersTest;
            return this;
        }

        public Bookings build(){
            return new Bookings(this);
        }
    }
}
