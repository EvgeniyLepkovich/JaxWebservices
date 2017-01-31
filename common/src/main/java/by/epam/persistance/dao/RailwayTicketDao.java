package by.epam.persistance.dao;

import by.epam.persistance.dto.RailwayTicket;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

public interface RailwayTicketDao extends CrudRepository<RailwayTicket, Long> {
    RailwayTicket findByTicketNumber(String ticketNumber);

    @Modifying
    @Query("delete from RailwayTicket r where r.ticketNumber = ?1")
    void deleteByTicketNumber(String ticketNumber);

    @Query("select r from RailwayTicket r where r.ticketStatusId = ?1")
    RailwayTicket findFreeTicket(Long ticketStatusId);

    @Modifying
    @Query("update RailwayTicket r set r.ticketStatusId = ?1 where r.ticketNumber = ?2")
    void changeTicketStatus(Long ticketStatusId, String ticketNumber);
}
