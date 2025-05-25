package za.ac.cput.Service;

import za.ac.cput.Domain.bookings.VehicleDisc;
import za.ac.cput.Domain.registration.Vehicle;

import java.util.List;

public interface IVehicleDiscService extends IService<VehicleDisc,String> {
    List<VehicleDisc> getAll();
    void Delete(String id);

}
