package za.ac.cput.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.Domain.registration.Vehicle;
import za.ac.cput.Repository.VehicleRepository;

import java.util.List;
@Service
public class VehicleService implements IVehicleService{
 @Autowired
    private VehicleRepository repository;
 @Autowired

    public VehicleService(VehicleRepository repository) {
        this.repository = repository;
    }

    @Override
    public Vehicle create(Vehicle vehicle) {
        return this.repository.save(vehicle);
    }

    @Override
    public Vehicle read(Integer integer) {
        return this.repository.findById(integer).orElse(null);
    }

    @Override
    public Vehicle update(Vehicle vehicle) {
        return this.repository.save(vehicle);
    }
    @Override
    public void Delete(Integer id) {
    this.repository.deleteById(id);
    }

    @Override
    public List<Vehicle> getAll() {
        return this.repository.findAll();
    }


}
