package za.ac.cput.Service;

import za.ac.cput.Domain.registration.Registration;
import za.ac.cput.Domain.registration.Vehicle;

import java.util.List;

public interface IVehicleService extends IService<Vehicle,Integer> {
    List<Vehicle> getAll();
    void Delete(Integer id);
}
