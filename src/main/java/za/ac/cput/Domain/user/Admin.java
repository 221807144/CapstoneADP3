package za.ac.cput.Domain.user;

import jakarta.persistence.*;
import za.ac.cput.Domain.bookings.Bookings;
import za.ac.cput.Domain.contact.Contact;
import za.ac.cput.Domain.payment.Payments;
import za.ac.cput.Domain.bookings.Test;

/*Masibuve Sikhulume
221807144
 */
@Entity
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int adminId;
    private String adminName;
    private String adminSurname;
    private String idNumber;

    @OneToOne
    @JoinColumn(name = "contact_id")
    private Contact contact;
       @ManyToOne
    @JoinColumn(name = "admin_bookings_booking_id")
    private Bookings adminBookings;
    @OneToOne
    @JoinColumn(name = "admin_test_test_id")
    private Test test;
    @OneToOne
    @JoinColumn(name = "admin_payments_payment_id")
    private Payments payments;




    public Admin() {
    }

    public Admin(Builder builder) {
        this.adminId = builder.adminId;
        this.adminName = builder.adminName;
        this.adminSurname = builder.adminSurname;
        this.idNumber = builder.idNumber;
        this.contact = builder.contact;
        this.adminBookings = builder.adminBookings;
        this.test = builder.test;
        this.payments = builder.payments;

    }

    public int getAdminId() {
        return adminId;
    }

    public String getAdminName() {
        return adminName;
    }

    public String getAdminSurname() {
        return adminSurname;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public Contact getContact() {
        return contact;
    }

    public Bookings getAdminBookings() {
        return adminBookings;
    }

    public Test getTest() {
        return test;
    }

    public Payments getPayments() {
        return payments;
    }


    @Override
    public String toString() {
        return "Admin{" +
                "adminId=" + adminId +
                ", adminName='" + adminName + '\'' +
                ", adminSurname='" + adminSurname + '\'' +
                ", idNumber=" + idNumber +
                ", contact=" + contact +
                ", adminBookings=" + adminBookings +
                ", test=" + test +
                ", payments=" + payments +
                '}';
    }

    public static class Builder {
        private int adminId;
        private String adminName;
        private String adminSurname;
        private String idNumber;
        private Contact contact;
        private Bookings adminBookings;
        private Test test;
        private Payments payments;

        public Builder setAdminId(int adminId) {
            this.adminId = adminId;
            return this;
        }

        public Builder setAdminName(String adminName) {
            this.adminName = adminName;
            return this;
        }

        public Builder setAdminSurname(String adminSurname) {
            this.adminSurname = adminSurname;
            return this;
        }

        public Builder setIdNumber(String idNumber) {
            this.idNumber = idNumber;
            return this;
        }

        public Builder setContact(Contact contact) {
            this.contact = contact;
            return this;
        }

        public Builder setAdminBookings(Bookings adminBookings) {
            this.adminBookings = adminBookings;
            return this;
        }

        public Builder setTest(Test test) {
            this.test = test;
            return this;
        }
        public Builder setPayments(Payments payments) {
            this.payments = payments;
            return this;

        }

        public Admin build() {
            return new Admin(this);
        }
    }
}