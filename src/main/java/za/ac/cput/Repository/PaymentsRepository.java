package za.ac.cput.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.Domain.payment.Payments;

public interface PaymentsRepository extends JpaRepository<Payments,Integer> {
}
