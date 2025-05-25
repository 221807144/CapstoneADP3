package za.ac.cput.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.Domain.bookings.VehicleDisc;
import za.ac.cput.Repository.VehicleDiscRepository;

import java.util.List;
@Service
public class VehicleDiscService implements IVehicleDiscService {
    @Autowired
private VehicleDiscRepository repository;
   @Autowired
    public VehicleDiscService(VehicleDiscRepository repository) {
        this.repository = repository;
    }

    @Override
    public VehicleDisc create(VehicleDisc vehicleDisc) {
        return this.repository.save(vehicleDisc);
    }

    @Override
    public VehicleDisc read(String s) {
        return this.repository.findById(s).orElse(null);
    }

    @Override
    public VehicleDisc update(VehicleDisc vehicleDisc) {
        return this.repository.save(vehicleDisc);
    }
    @Override
    public void Delete(String id) {
 this.repository.deleteById(id);
    }
    @Override
    public List<VehicleDisc> getAll() {
        return this.repository.findAll();
    }



}
