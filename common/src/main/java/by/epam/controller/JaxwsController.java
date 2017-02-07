package by.epam.controller;

import by.epam.persistance.dto.Person;
import by.epam.persistance.dto.RailwayTicket;
import by.epam.service.IRailwayTicketService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.ws.rs.PathParam;
import java.util.Date;

@WebService
public class JaxwsController {
    @Autowired
    private IRailwayTicketService railwayTicketService;

    @WebMethod
    public RailwayTicket getTicketByNumber(String ticketNumber){
        return railwayTicketService.findByTicketNumber(ticketNumber);
    }

    @WebMethod
    public String removeTicket(String ticketNumber) throws Exception{
        return railwayTicketService.deleteByTicketNumber(ticketNumber);
    }

    @WebMethod
    public String payForTicket(String ticketNumber) throws Exception {
        return railwayTicketService.payForTicket(ticketNumber);
    }

    @WebMethod
    public String bookTicket(String name, String surname, String secondName) throws Exception {
        Person person = new Person();
        person.setName(name);
        person.setSurname(surname);
        person.setSecondName(secondName);
        person.setBirthday(new Date());

        return railwayTicketService.bookTicket(person);
    }
}
