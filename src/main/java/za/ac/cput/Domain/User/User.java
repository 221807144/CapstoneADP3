package za.ac.cput.Domain.User;

import jakarta.persistence.*;
import za.ac.cput.Domain.Bookings.Bookings;
import za.ac.cput.Domain.Contact.Address;
import za.ac.cput.Domain.Contact.Contact;

import java.time.LocalDate;

/*Masibuve Sikhulume
221807144
 */
@Entity

public class User {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private int UserId;
 private String UserName;
 private String UserSurname;
 private Long IdNumber;
 private LocalDate BirthDate;
 @OneToOne
    @JoinColumn(name = "contact_id")
 private Contact Contact;
@OneToOne
@JoinColumn(name = "address_id")
 private Address address;

 @ManyToOne
 @JoinColumn(name = "user_books_booking_id")
 private Bookings UserBooks;



    public User(){}
    public User(Builder builder) {
    this.UserId = builder.UserId;
    this.UserName = builder.UserName;
    this.UserSurname = builder.UserSurname;
    this.IdNumber = builder.IdNumber;
    this.BirthDate = builder.BirthDate;

    }

 public int getUserId() {
  return UserId;
 }

 public String getUserName() {
  return UserName;
 }

 public String getUserSurname() {
  return UserSurname;
 }

 public Long getIdNumber() {
  return IdNumber;
 }

 public LocalDate getBirthDate() {
  return BirthDate;
 }


    public Bookings getUserBooks() {
    return UserBooks;
    }

    @Override
    public String toString() {
        return "User{" +
                "UserId=" + UserId +
                ", UserName='" + UserName + '\'' +
                ", UserSurname='" + UserSurname + '\'' +
                ", IdNumber=" + IdNumber +
                ", BirthDate=" + BirthDate +
                ", Contact=" + Contact +
                ", address=" + address +
                ", UserBooks=" + UserBooks +
                '}';
    }

    public static class Builder {
        private int UserId;
        private String UserName;
        private String UserSurname;
        private Long IdNumber;
        private LocalDate BirthDate;
        private Contact Contact;
        private Address address;
        private Bookings UserBooks;

        public Builder setUserId(int UserId) {
            this.UserId = UserId;
            return this;
        }

        public Builder setUserName(String UserName) {
            this.UserName = UserName;
            return this;
        }

        public Builder setUserSurname(String UserSurname) {
            this.UserSurname = UserSurname;
            return this;
        }

        public Builder setIdNumber(Long IdNumber) {
            this.IdNumber = IdNumber;
            return this;
        }

        public Builder setBirthDate(LocalDate BirthDate) {
            this.BirthDate = BirthDate;
            return this;
        }

    public Builder setContact(Contact contact) {
        Contact = contact;
        return this;
    }

    public Builder setAddress(Address address) {
        this.address = address;
        return this;
    }

    public Builder setUserBooks(Bookings userBooks) {
        UserBooks = userBooks;
        return this;
    }


        public Builder copy(User user) {
            this.UserId = user.UserId;
            this.UserName = user.UserName;
            this.UserSurname = user.UserSurname;
            this.IdNumber = user.IdNumber;
            this.BirthDate = user.BirthDate;
            this.Contact = user.Contact;
            this.address = user.address;
            this.UserBooks = user.UserBooks;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }}