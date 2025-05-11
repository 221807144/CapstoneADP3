package za.ac.cput.Domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int adminId;
    private String adminName;
    private String adminSurname;
    private Long idNumber;
    private String phoneNumber;
    private String email;

    public Admin() {
    }

    public Admin(Builder builder) {
        this.adminId = builder.adminId;
        this.adminName = builder.adminName;
        this.adminSurname = builder.adminSurname;
        this.idNumber = builder.idNumber;
        this.phoneNumber = builder.phoneNumber;
        this.email = builder.email;
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

    public Long getIdNumber() {
        return idNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "adminId='" + adminId + '\'' +
                ", adminName='" + adminName + '\'' +
                ", adminSurname='" + adminSurname + '\'' +
                ", idNumber=" + idNumber +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public static class Builder {
        private int adminId;
        private String adminName;
        private String adminSurname;
        private Long idNumber;
        private String phoneNumber;
        private String email;

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

        public Builder setIdNumber(Long idNumber) {
            this.idNumber = idNumber;
            return this;
        }

        public Builder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder copy(Admin admin) {
            this.adminId = admin.adminId;
            this.adminName = admin.adminName;
            this.adminSurname = admin.adminSurname;
            this.idNumber = admin.idNumber;
            this.phoneNumber = admin.phoneNumber;
            this.email = admin.email;
            return this;
        }

        public Admin build() {
            return new Admin(this);
        }
    }
}