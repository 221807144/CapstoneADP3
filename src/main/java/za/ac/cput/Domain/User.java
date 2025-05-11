package za.ac.cput.Domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;
@Entity

public class User {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private int UserId;
 private String UserName;
 private String UserSurname;
 private Long IdNumber;
 private LocalDate BirthDate;
    private String PhoneNumber;
 private String Email;

 public User(){}
    public User(Builder builder) {
    this.UserId = builder.UserId;
    this.UserName = builder.UserName;
    this.UserSurname = builder.UserSurname;
    this.IdNumber = builder.IdNumber;
    this.BirthDate = builder.BirthDate;
    this.PhoneNumber = builder.PhoneNumber;
    this.Email = builder.Email;
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

 public String getPhoneNumber() {
  return PhoneNumber;
 }

 public String getEmail() {
  return Email;
 }

 @Override
 public String toString() {
  return "User{" +
          "UserId='" + UserId + '\'' +
          ", UserName='" + UserName + '\'' +
          ", UserSurname='" + UserSurname + '\'' +
          ", IdNumber=" + IdNumber +
          ", BirthDate=" + BirthDate +
          ", PhoneNumber='" + PhoneNumber + '\'' +
          ", Email='" + Email + '\'' +
          '}';
 }
    public static class Builder {
    private int UserId;
    private String UserName;
    private String UserSurname;
    private Long IdNumber;
    private LocalDate BirthDate;
    private String PhoneNumber;
    private String Email;

    public Builder setUserId(int userId) {
    this.UserId = userId;
    return this;
    }

    public Builder setUserName(String userName) {
    this.UserName = userName;
    return this;
    }

    public Builder setUserSurname(String userSurname) {
    this.UserSurname = userSurname;
    return this;
    }

    public Builder setIdNumber(Long idNumber) {
    this.IdNumber = idNumber;
    return this;
    }

    public Builder setBirthDate(LocalDate birthDate) {
    this.BirthDate = birthDate;
    return this;
    }

    public Builder setPhoneNumber(String phoneNumber) {
    this.PhoneNumber = phoneNumber;
    return this;
    }

    public Builder setEmail(String email) {
    this.Email = email;
    return this;
    }

    public User build() {
    return new User(this);
    }
    }
}
