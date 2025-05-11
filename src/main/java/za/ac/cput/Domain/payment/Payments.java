package za.ac.cput.Domain.payment;

import jakarta.persistence.*;
import za.ac.cput.Domain.bookings.Bookings;

import java.time.LocalDate;

/*
Thando Tinto
221482210
*/

@Entity
public class Payments {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int paymentId;
    private String paymentMethod, paymentDetails;
    private double paymentAmount;
    private LocalDate paymentDate;
    @ManyToOne
    @JoinColumn(name = "booking_id")
    private Bookings bookings;
    @OneToOne
    @JoinColumn(name = "ticket_id")
    private Ticket ticket;

    public Payments() {
    }

    private Payments(Builder builder) {
        this.paymentId = builder.paymentId;
        this.paymentMethod = builder.paymentMethod;
        this.paymentDetails = builder.paymentDetails;
        this.paymentAmount = builder.paymentAmount;
        this.paymentDate = builder.paymentDate;
    }

    public int getPaymentId() {
        return paymentId;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public String getPaymentDetails() {
        return paymentDetails;
    }

    public double getPaymentAmount() {
        return paymentAmount;
    }

    public LocalDate getPaymentDate() {
        return paymentDate;
    }

    @Override
    public String toString() {
        return "Payments{" +
                "paymentId='" + paymentId + '\'' +
                ", paymentMethod='" + paymentMethod + '\'' +
                ", paymentDetails='" + paymentDetails + '\'' +
                ", paymentAmount=" + paymentAmount +
                ", paymentDate=" + paymentDate +
                '}';
    }

    public static class Builder {
        private int paymentId;
        private String paymentMethod, paymentDetails;
        private double paymentAmount;
        private LocalDate paymentDate;

        public Builder setPaymentId(int paymentId) {
            this.paymentId = paymentId;
            return this;
        }

        public Builder setPaymentMethod(String paymentMethod) {
            this.paymentMethod = paymentMethod;
            return this;
        }

        public Builder setPaymentDetails(String paymentDetails) {
            this.paymentDetails = paymentDetails;
            return this;
        }

        public Builder setPaymentAmount(double paymentAmount) {
            this.paymentAmount = paymentAmount;
            return this;
        }

        public Builder setPaymentDate(LocalDate paymentDate) {
            this.paymentDate = paymentDate;
            return this;
        }

        public Builder copy(Payments payments) {
            this.paymentId = payments.paymentId;
            this.paymentMethod = payments.paymentMethod;
            this.paymentDetails = payments.paymentDetails;
            this.paymentAmount = payments.paymentAmount;
            this.paymentDate = payments.paymentDate;
            return this;
        }

        public Payments build() {
            return new Payments(this);
        }

    }

}
