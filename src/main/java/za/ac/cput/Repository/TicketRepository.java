package za.ac.cput.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.Domain.payment.Ticket;

public interface TicketRepository extends JpaRepository<Ticket, Integer> {
}
