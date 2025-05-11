package za.ac.cput.Domain.payment;

import jakarta.persistence.*;
import za.ac.cput.Domain.bookings.Bookings;

import java.time.LocalDate;
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
    @OneToOne
    private Payments payments;

    public Payments() {
    }

    private Payments(Builder builder) {
        this.paymentId = builder.paymentId;
        this.paymentMethod = builder.paymentMethod;
        this.paymentDetails = builder.paymentDetails;
        this.paymentAmount = builder.paymentAmount;
        this.paymentDate = builder.paymentDate;
        this.bookings = builder.bookings;
        this.ticket = builder.ticket;
        this.payments = builder.payments;

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

    public Bookings getBookings() {
        return bookings;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public Payments getPayments() {
        return payments;
    }

    @Override
    public String toString() {
        return "Payments{" +
                "paymentId=" + paymentId +
                ", paymentMethod='" + paymentMethod + '\'' +
                ", paymentDetails='" + paymentDetails + '\'' +
                ", paymentAmount=" + paymentAmount +
                ", paymentDate=" + paymentDate +
                ", bookings=" + bookings +
                ", ticket=" + ticket +
                ", payments=" + payments +
                '}';
    }

    public static class Builder {
        private int paymentId;
        private String paymentMethod, paymentDetails;
        private double paymentAmount;
        private LocalDate paymentDate;
        private Payments payments;
        private Ticket ticket;
        private Bookings bookings;



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
        public Builder setBookings(Bookings bookings) {
            this.bookings = bookings;
            return this;
        }
        public Builder setTicket(Ticket ticket) {
            this.ticket = ticket;
            return this;
        }
        public Builder setPayments(Payments payments) {
            this.payments = payments;
            return this;
        }

        public Builder copy(Payments payments) {
            this.paymentId = payments.paymentId;
            this.paymentMethod = payments.paymentMethod;
            this.paymentDetails = payments.paymentDetails;
            this.paymentAmount = payments.paymentAmount;
            this.paymentDate = payments.paymentDate;
            this.bookings = payments.bookings;
            this.ticket = payments.ticket;
            this.payments = payments.payments;
            return this;
        }

        public Payments build() {
            return new Payments(this);
        }

    }

}
