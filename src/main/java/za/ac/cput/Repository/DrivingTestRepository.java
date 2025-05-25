package za.ac.cput.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.Domain.bookings.DrivingTest;

public interface DrivingTestRepository extends JpaRepository<DrivingTest, Integer> {
    // Additional methods specific to DrivingTest can be defined here if needed
}
