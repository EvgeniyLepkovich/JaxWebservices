package dbunit;

import by.epam.persistance.dao.PersonDao;
import by.epam.persistance.dto.Person;
import com.github.springtestdbunit.DbUnitTestExecutionListener;
import com.github.springtestdbunit.annotation.DatabaseOperation;
import com.github.springtestdbunit.annotation.DatabaseSetup;
import com.github.springtestdbunit.annotation.DatabaseTearDown;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.support.DirtiesContextTestExecutionListener;
import org.springframework.test.context.transaction.TransactionalTestExecutionListener;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/hibernate-test.xml")
@TestExecutionListeners({
        DependencyInjectionTestExecutionListener.class,
        DirtiesContextTestExecutionListener.class,
        TransactionalTestExecutionListener.class,
        DbUnitTestExecutionListener.class
})
@DatabaseTearDown(value = "classpath:testData/tearDown.xml", type = DatabaseOperation.CLEAN_INSERT)
public class PersonDaoTest {
    @Autowired
    private PersonDao personDao;

    @Test
    @DatabaseSetup(value = "classpath:testData/person/person.xml")
    public void findByNameAndSurnameAndSecondnameTest(){
        Person person = personDao.findByNameAndSurnameAndSecondName("Evgeniy", "Lepkovich", "Olegovich");
        Assert.assertNotNull(person);
    }
}
