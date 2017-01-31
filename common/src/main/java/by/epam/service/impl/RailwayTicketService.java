package by.epam.service.impl;

import by.epam.persistance.dao.RailwayTicketDao;
import by.epam.persistance.dto.Person;
import by.epam.persistance.dto.RailwayTicket;
import by.epam.service.IRailwayTicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class RailwayTicketService implements IRailwayTicketService {
    @Autowired
    private RailwayTicketDao railwayTicketDao;
    @Autowired
    private PersonService personService;

    private static final String NO_FREE_TICKETS = "Have no free tickets";
    private static final String CANT_PAY_FOR_TICKET = "Can't accept pay for ticket - ticket with this number does not exist or ticket was not book";
    private static final String SUCCESS_PAY_FOR_TICKET = "Pay was accepted";
    private static final String SUCCESS_REMOVE_TICKET = "Ticket was removed";

    public <S extends RailwayTicket> S save(S entity) {
        return railwayTicketDao.save(entity);
    }

//    @WebMethod
//    public <S extends railwayTicket> Iterable<S> save(Iterable<S> entities) {
//        return railwayTicketDao.save(entities);
//    }

    public RailwayTicket findOne(Long id) {
        return railwayTicketDao.findOne(id);
    }

    public boolean exists(Long id) {
        return railwayTicketDao.exists(id);
    }

//    @WebMethod
//    public Iterable<railwayTicket> findAll() {
//        return railwayTicketDao.findAll();
//    }

    public long count() {
        return railwayTicketDao.count();
    }

    public void delete(Long id) {
        railwayTicketDao.delete(id);
    }

    public void delete(RailwayTicket entity) {
        railwayTicketDao.delete(entity);
    }

//    @WebMethod
//    public void delete(Iterable<? extends railwayTicket> entities) {
//        railwayTicketDao.delete(entities);
//    }

    public void deleteAll() {
        railwayTicketDao.deleteAll();
    }

    public RailwayTicket findByTicketNumber(String ticketNumber) {
        return railwayTicketDao.findByTicketNumber(ticketNumber);
    }

    public String deleteByTicketNumber(String ticketNumber) {
        railwayTicketDao.deleteByTicketNumber(ticketNumber);
        return SUCCESS_REMOVE_TICKET;
    }

    public String bookTicket(Person person) {
        if (personService.findByNameAndSurnameAndSecondname(person) == null) {
            personService.save(person);
        }
        RailwayTicket railwayTicket = railwayTicketDao.findFreeTicket(new Long(1));
        if (railwayTicket == null){
            return NO_FREE_TICKETS;
        }
//        railwayTicketDao.changeTicketStatus(new Long(2), railwayTicket.getTicketNumber());
        return railwayTicket.getTicketNumber();
    }

    public String payForTicket(String ticketNumber) {
        RailwayTicket railwayTicket = railwayTicketDao.findByTicketNumber(ticketNumber);
        if (railwayTicket == null || railwayTicket.getTicketStatusId() == 1) {
            return CANT_PAY_FOR_TICKET;
        }
        railwayTicketDao.changeTicketStatus(new Long(1), railwayTicket.getTicketNumber());
        return SUCCESS_PAY_FOR_TICKET;
    }
}
