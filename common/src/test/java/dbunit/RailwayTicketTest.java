package dbunit;


import by.epam.persistance.dao.RailwayTicketDao;
import by.epam.persistance.dto.RailwayTicket;
import com.github.springtestdbunit.DbUnitTestExecutionListener;
import com.github.springtestdbunit.annotation.DatabaseOperation;
import com.github.springtestdbunit.annotation.DatabaseSetup;
import com.github.springtestdbunit.annotation.DatabaseTearDown;
import com.github.springtestdbunit.annotation.ExpectedDatabase;
import com.github.springtestdbunit.assertion.DatabaseAssertionMode;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.support.DirtiesContextTestExecutionListener;
import org.springframework.test.context.transaction.TransactionalTestExecutionListener;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/hibernate-test.xml")
@TestExecutionListeners({
        DependencyInjectionTestExecutionListener.class,
        DirtiesContextTestExecutionListener.class,
        TransactionalTestExecutionListener.class,
        DbUnitTestExecutionListener.class
})
@DatabaseTearDown(value = "classpath:testData/tearDown.xml", type = DatabaseOperation.CLEAN_INSERT)
public class RailwayTicketTest {
    @Autowired
    private RailwayTicketDao railwayTicketDao;

    @Test
    @DatabaseSetup(value = "classpath:testData/railwayTicket/railwayTicket.xml")
    public void findFreeTicketTest(){
        RailwayTicket railwayTicket = railwayTicketDao.findFreeTicket(new Long(1));
        Assert.assertNotNull(railwayTicket);
    }

    @Test
    @Transactional
    @Rollback(false)
    @DatabaseSetup(value = "classpath:testData/railwayTicket/railwayTicket.xml")
    @ExpectedDatabase(value = "classpath:testData/railwayTicket/railwayTicketUpdate.xml", assertionMode = DatabaseAssertionMode.NON_STRICT)
    public void setTicketStatusIdByTicketIdTest(){
        railwayTicketDao.changeTicketStatus(new Long(2), "wqeq-214-qerqw-cxz");
    }

    @Test
    @Transactional
    @Rollback(false)
    @DatabaseSetup(value = "classpath:testData/railwayTicket/railwayTicket.xml")
    @ExpectedDatabase(value = "classpath:testData/railwayTicket/railwayTicketDelete.xml", assertionMode = DatabaseAssertionMode.NON_STRICT)
    public void deleteByTicketNumberTest(){
        railwayTicketDao.deleteByTicketNumber("wqeq-215-qerqw-cxz");
        List<RailwayTicket> myList = new ArrayList<RailwayTicket>();
    }
}
