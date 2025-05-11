package za.ac.cput.Domain;

import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
public class VehicleDisc {
    @Id
    private String discId;
    private LocalDate issueDate;
    private LocalDate expiryDate;
    @OneToOne
    @JoinColumn(name = "vehicle_vehicle_id")
    private Vehicle vehicle;
    @ManyToOne
    @JoinColumn(name = "bookings_booking_id")
    private Bookings bookings;

    public VehicleDisc() {

    }
    public VehicleDisc(Builder builder) {
        this.discId = builder.discId;
        this.issueDate = builder.issueDate;
        this.expiryDate = builder.expiryDate;
        this.vehicle = builder.vehicle;
        this.bookings = builder.bookings;
    }

    public String getDiscId() {
        return discId;
    }

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public Bookings getBookings() {
        return bookings;
    }

    @Override
    public String toString() {
        return "VehicleDisc{" +
                "discId='" + discId + '\'' +
                ", issueDate=" + issueDate +
                ", expiryDate=" + expiryDate +
                ", vehicle=" + vehicle +
                ", bookings=" + bookings +
                '}';
    }

    public static class Builder{
        private String discId;
        private LocalDate issueDate;
        private LocalDate expiryDate;
        private Vehicle vehicle;
        private Bookings bookings;

        public Builder setDiscId(String discId) {
            this.discId = discId;
            return this;
        }

        public Builder setIssueDate(LocalDate issueDate) {
            this.issueDate = issueDate;
            return this;
        }

        public Builder setExpiryDate(LocalDate expiryDate) {
            this.expiryDate = expiryDate;
            return this;
        }

        public Builder setVehicle(Vehicle vehicle) {
            this.vehicle = vehicle;
            return this;
        }

        public Builder setBookings(Bookings bookings) {
            this.bookings = bookings;
            return this;
        }

        public VehicleDisc build() {
            return new VehicleDisc(this);
        }
    }
}
