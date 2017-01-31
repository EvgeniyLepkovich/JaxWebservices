package by.epam.persistance.dao;

import by.epam.persistance.dto.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonDao extends CrudRepository<Person, Long> {
    Person findByNameAndSurnameAndSecondName(String name, String surname, String secondName);
}
