package za.ac.cput.Domain.licence;

import jakarta.persistence.*;
import za.ac.cput.Domain.user.User;

/*Emihle Thole
  221755349
  18/05/18*/
@Entity
public class License {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int licenseId; // Changed to Long
    private String licenseType;
    private String issueDate;
    private String expiryDate;
    @OneToOne
    @JoinColumn(name = "user_user_id")
    private User user;

    public void setUser(User user) {
        this.user = user;
    }

    public License() {
    }



    public License(Builder builder) {
        this.licenseId = builder.licenseId;
        this.licenseType = builder.licenseType;
        this.issueDate = builder.issueDate;
        this.expiryDate = builder.expiryDate;
        this.user = builder.user;
    }

    public int getLicenseId() {
        return licenseId;
    }

    public String getLicenseType() {
        return licenseType;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public User getUser() {
        return user;
    }

    @Override
    public String toString() {
        return "License{" +
                "licenseId=" + licenseId +
                ", licenseType='" + licenseType + '\'' +
                ", issueDate='" + issueDate + '\'' +
                ", expiryDate='" + expiryDate + '\'' +
                ", user=" + user +
                '}';
    }

    public static class Builder {

        private int licenseId; // Changed to Long
        private String licenseType;
        private String issueDate;
        private String expiryDate;
        private User user;

        public Builder setLicenseId(int licenseId) {
            this.licenseId = licenseId;
            return this;
        }
        public Builder setLicenseType(String licenseType) {
            this.licenseType = licenseType;
            return this;
        }


        public Builder setIssueDate(String issueDate) {
            this.issueDate = issueDate;
            return this;
        }

        public Builder setExpiryDate(String expiryDate) {
            this.expiryDate = expiryDate;
            return this;
        }

        public Builder setUser(User user) {
            this.user = user;
            return this;
        }

        public Builder copy(License license) {
            this.licenseId = license.licenseId;
            this.licenseType = license.licenseType;
            this.issueDate = license.issueDate;
            this.expiryDate = license.expiryDate;
            this.user = license.user;
            return this;
        }

        public License build() {
            return new License(this);
        }
    }
}