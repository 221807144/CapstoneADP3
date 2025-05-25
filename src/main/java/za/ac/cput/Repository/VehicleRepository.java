package za.ac.cput.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.Domain.registration.Vehicle;

public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
}
