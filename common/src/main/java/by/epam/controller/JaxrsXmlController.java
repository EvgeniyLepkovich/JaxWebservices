package by.epam.controller;

import by.epam.persistance.dto.Person;
import by.epam.persistance.dto.RailwayTicket;
import by.epam.service.IRailwayTicketService;
import by.epam.util.XmlConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Date;

@Path("/xml/railwayTickets")
@Produces({"application/xml"})
@Component
public class JaxrsXmlController{
    @Autowired
    private IRailwayTicketService railwayTicketService;

    @GET
    @Path("/getTicketByNumber/{ticketNumber}")
    public RailwayTicket getTicketByNumber(@PathParam("ticketNumber") String ticketNumber){
        return railwayTicketService.findByTicketNumber(ticketNumber);
    }

    @DELETE
    @Path("/removeTicket/{ticketNumber}")
    public Response removeTicket(@PathParam("ticketNumber") String ticketNumber) throws Exception{
        String status = railwayTicketService.deleteByTicketNumber(ticketNumber);
        String xmlStr = "<RailwayTicketOperation><status>" + status + "</status></RailwayTicketOperation>";
        return Response.ok(XmlConverter.stringToXml(xmlStr), MediaType.APPLICATION_XML).build();
    }

    @POST
    @Path("/payForTicket/{ticketNumber}")
    public Response payForTicket(@PathParam("ticketNumber") String ticketNumber) throws Exception {
        String status = railwayTicketService.payForTicket(ticketNumber);
        String xmlStr = "<RailwayTicketOperation><status>" + status + "</status></RailwayTicketOperation>";
        return Response.ok(XmlConverter.stringToXml(xmlStr), MediaType.APPLICATION_XML).build();
    }

    @POST
    @Path("/bookTicket/{name}/{surname}/{secondName}")
    public Response bookTicket(@PathParam("name") String name, @PathParam("surname") String surname, @PathParam("secondName") String secondName) throws Exception {
        Person person = new Person();
        person.setName(name);
        person.setSurname(surname);
        person.setSecondName(secondName);
        person.setBirthday(new Date());

        String ticketNumber = railwayTicketService.bookTicket(person);
        String xmlStr = "<RailwayTicket><ticketNumber>" + ticketNumber + "</ticketNumber></RailwayTicket>";
        return Response.ok(XmlConverter.stringToXml(xmlStr), MediaType.APPLICATION_XML).build();
    }
}
