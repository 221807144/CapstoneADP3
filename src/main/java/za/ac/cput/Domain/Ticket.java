package za.ac.cput.Domain;

import java.time.LocalDate;

public class Ticket {

    private int ticketId;
    private double amount;
    private LocalDate issueDate;
    private String status;

    private Ticket(Builder builder) {
        this.ticketId = builder.ticketId;
        this.amount = builder.amount;
        this.issueDate = builder.issueDate;
        this.status = builder.status;
    }

    public int getTicketId() {
        return ticketId;
    }

    public double getAmount() {
        return amount;
    }

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "ticketId=" + ticketId +
                ", amount=" + amount +
                ", issueDate=" + issueDate +
                ", status='" + status + '\'' +
                '}';
    }

    public static class Builder {
        private int ticketId;
        private double amount;
        private LocalDate issueDate;
        private String status;

        public Builder setTicketId(int ticketId) {
            this.ticketId = ticketId;
            return this;
        }

        public Builder setAmount(double amount) {
            this.amount = amount;
            return this;
        }

        public Builder setIssueDate(LocalDate issueDate) {
            this.issueDate = issueDate;
            return this;
        }

        public Builder setStatus(String status) {
            this.status = status;
            return this;
        }

        public Builder copy(Ticket ticket) {
            this.ticketId = ticket.ticketId;
            this.amount = ticket.amount;
            this.issueDate = ticket.issueDate;
            this.status = ticket.status;
            return this;
        }

        public Ticket build() {
            return new Ticket(this);
        }
    }

}
