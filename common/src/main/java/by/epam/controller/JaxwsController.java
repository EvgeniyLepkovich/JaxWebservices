package by.epam.controller;

import by.epam.persistance.dto.RailwayTicket;
import by.epam.service.impl.RailwayTicketService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class JaxwsController {
    @Autowired
    private RailwayTicketService railwayTicketService;

    @WebMethod(operationName = "findOne")
    public RailwayTicket findOne(Long id){
        RailwayTicket railwayTicket = railwayTicketService.findOne(id);
        return railwayTicket;
    }
}
