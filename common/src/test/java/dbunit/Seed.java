//package dbunit;
//
//import by.epam.config.ProductionDataBaseConfig;
//import by.epam.persistance.dto.Person;
//import by.epam.persistance.dto.railwayTicket;
//import by.epam.persistance.dto.TicketStatus;
//import by.epam.service.impl.PersonService;
//import by.epam.service.impl.RailwayTicketService;
//import by.epam.service.impl.TicketStatusService;
//import com.github.springtestdbunit.DbUnitTestExecutionListener;
//import org.junit.Assert;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.TestExecutionListeners;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//import org.springframework.test.context.support.AnnotationConfigContextLoader;
//import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
//import org.springframework.test.context.support.DirtiesContextTestExecutionListener;
//import org.springframework.test.context.transaction.TransactionalTestExecutionListener;
//
//import java.util.Calendar;
//import java.util.Date;
//import java.util.UUID;
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes = {ProductionDataBaseConfig.class}, loader = AnnotationConfigContextLoader.class)
//@TestExecutionListeners({
//        DependencyInjectionTestExecutionListener.class,
//        DirtiesContextTestExecutionListener.class,
//        TransactionalTestExecutionListener.class,
//        DbUnitTestExecutionListener.class
//})
//public class Seed {
//    @Autowired
//    private TicketStatusService ticketStatusService;
//    @Autowired
//    private PersonService personService;
////    @Autowired
////    private RailwayTicketService railwayTicketService;
//
//    @Test
//    public void initTicketStatus(){
////        TicketStatus ticketStatus = new TicketStatus();
////        ticketStatus.setTicketStatus("Booking");
////        ticketStatusService.save(ticketStatus);
////        ticketStatus = new TicketStatus();
////        ticketStatus.setTicketStatus("Pay");
////        ticketStatusService.save(ticketStatus);
//
//
//    }
//
//    @Test
//    public void initPerson(){
////        Person person = new Person();
////        person.setName("Evgeniy");
////        person.setSecondName("Olegovich");
////        person.setSurname("Lepkovich");
////        person.setBirthday(new Date());
////        personService.save(person);
//    }
//
//    @Test
//    public void initRailwayTicket(){
////        railwayTicket ticket = new railwayTicket();
////        ticket.setTicketNumber(UUID.randomUUID().toString());
////        ticket.setCityFrom("minsk");
////        ticket.setCityTo("mogilev");
////        ticket.setOneWay(new Date());
////        Calendar cal = Calendar.getInstance();
////        cal.setTime(new Date());
////        cal.add(cal.DATE, 1);
////        ticket.setRoundTrip(cal.getTime());
////
////        TicketStatus ticketStatus = ticketStatusService.findOne(new Long(1)); // change id
////        Person person = personService.findOne(new Long(3)); //change id
////        ticket.setOwner(person);
////        ticket.setTicketStatus(ticketStatus);
////
////        railwayTicketService.save(ticket);
//    }
//
//    @Test
//    public void testConnection(){
////        railwayTicket ticket = railwayTicketService.findOne(new Long(4));
////        Assert.assertNotNull(ticket);
//    }
//}
