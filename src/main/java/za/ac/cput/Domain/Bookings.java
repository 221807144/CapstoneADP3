package za.ac.cput.Domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class Bookings {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)

    private String bookingId;
    private LocalDate bookingDate;
    private String bookingType;
    private Double bookingAmount;

    public Bookings() {
    }

    public Bookings(Builder builder) {
        this.bookingId = builder.bookingId;
        this.bookingDate = builder. bookingDate;
        this.bookingType = builder.bookingType;
        this.bookingAmount = builder.bookingAmount;
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

    @Override
    public String toString() {
        return "Bookings{" +
                "bookingId='" + bookingId + '\'' +
                ", bookingDate=" + bookingDate +
                ", bookingType='" + bookingType + '\'' +
                ", bookingAmount=" + bookingAmount +
                '}';
    }

    public static class Builder{

        private String bookingId;
        private LocalDate bookingDate;
        private String bookingType;
        private Double bookingAmount;

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

        public Builder copy(Bookings bookings) {
            this.bookingId = bookings.bookingId;
            this.bookingDate = bookings.bookingDate;
            this.bookingType = bookings.bookingType;
            this.bookingAmount = bookings.bookingAmount;
            return this;
        }

        public Bookings build(){
            return new Bookings(this);
        }
    }
}
