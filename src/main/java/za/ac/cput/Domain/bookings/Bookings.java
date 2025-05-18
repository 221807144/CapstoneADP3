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
    private Test test;
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
        this.test = builder.test;
        this.vehicleDisc = builder.vehicleDisc;
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

    public Test getTest() {return test;}
    public VehicleDisc getVehicleDisc() {return vehicleDisc;}

    @Override
    public String toString() {
        return "Bookings{" +
                "bookingId=" + bookingId +
                ", bookingDate=" + bookingDate +
                ", bookingType='" + bookingType + '\'' +
                ", bookingAmount=" + bookingAmount +
                ", test=" + test +
                ", vehicleDisc=" + vehicleDisc +
                '}';
    }

    public static class Builder{

        private int bookingId;
        private LocalDate bookingDate;
        private String bookingType;
        private Double bookingAmount;
        private Test test;
        private VehicleDisc vehicleDisc;

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

        public Builder setTest(Test test) {
            this.test = test;
            return this;
        }
        public Builder setVehicleDisc(VehicleDisc vehicleDisc) {
            this.vehicleDisc = vehicleDisc;
            return this;
        }

        public Builder copy(Bookings bookings) {
            this.bookingId = bookings.bookingId;
            this.bookingDate = bookings.bookingDate;
            this.bookingType = bookings.bookingType;
            this.bookingAmount = bookings.bookingAmount;
            this.test = bookings.test;
            this.vehicleDisc = bookings.vehicleDisc;
            return this;
        }

        public Bookings build(){
            return new Bookings(this);
        }
    }
}
