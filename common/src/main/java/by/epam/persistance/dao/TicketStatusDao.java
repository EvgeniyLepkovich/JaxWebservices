package by.epam.persistance.dao;

import by.epam.persistance.dto.TicketStatus;
import org.springframework.data.repository.CrudRepository;

public interface TicketStatusDao extends CrudRepository<TicketStatus, Long> {
}
