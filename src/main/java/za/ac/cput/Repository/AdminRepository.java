package za.ac.cput.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.Domain.user.Admin;
@Repository
public interface AdminRepository extends JpaRepository<Admin,Integer> {
}
