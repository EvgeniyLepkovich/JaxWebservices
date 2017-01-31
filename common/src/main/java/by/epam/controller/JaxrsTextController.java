package by.epam.controller;

import by.epam.persistance.dto.Person;
import by.epam.service.IRailwayTicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import java.util.Date;

@Path("/text/railwayTickets")
@Produces("text/plain")
@Component
public class JaxrsTextController{
    @Autowired
    private IRailwayTicketService railwayTicketService;

    @GET
    @Path("/getTicketByNumber/{ticketNumber}")
    public String getTicketByNumber(@PathParam("ticketNumber") String ticketNumber){
        return railwayTicketService.findByTicketNumber(ticketNumber).toString();
    }

    @DELETE
    @Path("/removeTicket/{ticketNumber}")
    public String removeTicket(@PathParam("ticketNumber") String ticketNumber){
        return railwayTicketService.deleteByTicketNumber(ticketNumber);
    }

    @POST
    @Path("/payForTicket/{ticketNumber}")
    public String payForTicket(@PathParam("ticketNumber") String ticketNumber){
        return railwayTicketService.payForTicket(ticketNumber);
    }

    @POST
    @Path("/bookTicket/{name}/{surname}/{secondName}")
    public String bookTicket(@PathParam("name") String name, @PathParam("surname") String surname, @PathParam("secondName") String secondName){
        Person person = new Person();
        person.setName(name);
        person.setSurname(surname);
        person.setSecondName(secondName);
        person.setBirthday(new Date());

        String ticketNumber = railwayTicketService.bookTicket(person);
        return ticketNumber;
    }
}
