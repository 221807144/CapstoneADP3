package za.ac.cput.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.Domain.bookings.Bookings;

@Repository
public interface BookingsRepository extends JpaRepository<Bookings, Integer> {
}
