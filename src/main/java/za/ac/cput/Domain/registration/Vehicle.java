package za.ac.cput.Domain.registration;

import jakarta.persistence.*;
import za.ac.cput.Domain.bookings.VehicleDisc;

import java.time.LocalDate;
/* Vehicle.java
     Vehicle POJO class
     Author: Sibahle shange (222529571)
     Date: 11 May 2025 */
@Entity
public class Vehicle {
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int VehicleID;
    private String VehicleType;
    private String VehicleModel;
    private LocalDate VehicleYear;
    private  String VehicleColor;
    @OneToOne (cascade = CascadeType.ALL)
    @JoinColumn(name = "vehicle_disc_disc_id")
    private VehicleDisc VehicleDisc;


    public Vehicle() {
    }
    public Vehicle(Builder builder) {
        this.VehicleID = builder.VehicleID;
        this.VehicleType = builder.VehicleType;
        this.VehicleModel = builder.VehicleModel;
        this.VehicleYear = builder.VehicleYear;
        this.VehicleColor = builder.VehicleColor;
        this.VehicleDisc = builder.VehicleDisc;

    }

    public int getVehicleID() {
        return VehicleID;
    }

    public String getVehicleType() {
        return VehicleType;
    }

    public String getVehicleModel() {
        return VehicleModel;
    }

    public String getVehicleColor() {
        return VehicleColor;
    }

    public LocalDate getVehicleYear() {
        return VehicleYear;
    }

    public VehicleDisc getVehicleDisc() {
        return VehicleDisc;
    }


    @Override
    public String toString() {
        return "Vehicle{" +
                "VehicleID=" + VehicleID +
                ", VehicleType='" + VehicleType + '\'' +
                ", VehicleModel='" + VehicleModel + '\'' +
                ", VehicleYear=" + VehicleYear +
                ", VehicleColor='" + VehicleColor + '\'' +
                ", VehicleDisc=" + VehicleDisc +
                '}';
    }

    public static class Builder{
        private int VehicleID;
        private String VehicleType;
        private String VehicleModel;
        private LocalDate VehicleYear;
        private String VehicleColor;
        private VehicleDisc VehicleDisc;


        public Builder setVehicleID(int vehicleID) {
            VehicleID = vehicleID;
            return this;
        }

        public Builder setVehicleType(String vehicleType) {
            VehicleType = vehicleType;
            return this;
        }

        public Builder setVehicleModel(String vehicleModel) {
            VehicleModel = vehicleModel;
            return this;
        }

        public Builder setVehicleYear(LocalDate vehicleYear) {
            VehicleYear = vehicleYear;
            return this;
        }
        public Builder setVehicleColor(String vehicleColor) {
            VehicleColor = vehicleColor;
            return this;
        }
        public Builder setVehicleDisc(VehicleDisc VehicleDisc) {
            this.VehicleDisc = VehicleDisc;
            return this;
        }


        public Builder Copy(Vehicle vehicle) {
            this.VehicleID = vehicle.VehicleID;
            this.VehicleType = vehicle.VehicleType;
            this.VehicleModel = vehicle.VehicleModel;
            this.VehicleYear = vehicle.VehicleYear;
            this.VehicleColor = vehicle.VehicleColor;
            this.VehicleDisc = vehicle.VehicleDisc;
            return this;
        }

        public Vehicle build(){
            return new Vehicle(this);
        }
    }
}
