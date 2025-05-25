package za.ac.cput.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.Domain.bookings.VehicleDisc;

public interface VehicleDiscRepository extends JpaRepository<VehicleDisc, Long> {
}
