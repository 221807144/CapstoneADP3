package za.ac.cput.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.Domain.bookings.LearnersTest;
@Repository
public interface LearnersTestRepository extends JpaRepository<LearnersTest,Integer> {
    Object findByLearnerId(Integer learnerId);
}
