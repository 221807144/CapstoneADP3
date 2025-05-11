package za.ac.cput.Domain.bookings;

import jakarta.persistence.*;

import java.time.LocalDate;
/*Emihle Thole
  221755349
  */
@Entity
public class Bookings {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)

    private String bookingId;
    private LocalDate bookingDate;
    private String bookingType;
    private Double bookingAmount;
    @ManyToOne
    @JoinColumn(name = "test_id")
    private Test test;

    public Bookings() {
    }

    public Bookings(Builder builder) {
        this.bookingId = builder.bookingId;
        this.bookingDate = builder. bookingDate;
        this.bookingType = builder.bookingType;
        this.bookingAmount = builder.bookingAmount;
        this.test = builder.test;
    }

    public String getBookingId() {
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

    @Override
    public String toString() {
        return "Bookings{" +
                "bookingAmount=" + bookingAmount +
                ", bookingId='" + bookingId + '\'' +
                ", bookingDate=" + bookingDate +
                ", bookingType='" + bookingType + '\'' +
                ", test=" + test +
                '}';

}

    public static class Builder{

        private String bookingId;
        private LocalDate bookingDate;
        private String bookingType;
        private Double bookingAmount;
        private Test test;

        public Builder setBookingId(String bookingId) {
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

        public Builder copy(Bookings bookings) {
            this.bookingId = bookings.bookingId;
            this.bookingDate = bookings.bookingDate;
            this.bookingType = bookings.bookingType;
            this.bookingAmount = bookings.bookingAmount;
            this.test = bookings.test;
            return this;
        }

        public Bookings build(){
            return new Bookings(this);
        }
    }
}
