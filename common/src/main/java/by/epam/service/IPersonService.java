package by.epam.service;

import by.epam.persistance.dto.Person;

public interface IPersonService extends IJpaService<Person, Long> {
    Person findByNameAndSurnameAndSecondname(Person person);
}
