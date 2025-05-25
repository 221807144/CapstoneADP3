package za.ac.cput.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.Domain.bookings.DrivingTest;

@Repository
public interface DrivingTestRepository extends JpaRepository<DrivingTest, Integer> {
    DrivingTest findByTestId(Integer testId);

    Object findByLearnerId(Integer learnerId);
    // Additional methods specific to DrivingTest can be defined here if needed
}
