package by.epam.service;

import by.epam.persistance.dto.Person;
import by.epam.persistance.dto.RailwayTicket;

public interface IRailwayTicketService extends IJpaService<RailwayTicket, Long> {
//    void setTicketStatusIdByTicketId(Long ticketStatusId, Long ticketId);
    RailwayTicket findByTicketNumber(String ticketNumber);
    String deleteByTicketNumber(String ticketNumber);
    String bookTicket(Person person);
    String payForTicket(String ticketNumber);
}
