package za.ac.cput.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.Domain.user.User;
@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
}
