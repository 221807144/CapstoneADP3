package za.ac.cput.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.Domain.registration.Registration;
@Repository
public interface RegistrationRepository extends JpaRepository <Registration, Integer> {
}
