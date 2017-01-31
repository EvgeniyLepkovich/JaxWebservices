package by.epam.service.impl;

import by.epam.persistance.dao.PersonDao;
import by.epam.persistance.dto.Person;
import by.epam.service.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class PersonService implements IPersonService {
    @Autowired
    private PersonDao personDao;

    public <S extends Person> S save(S entity) {
        return personDao.save(entity);
    }

    public <S extends Person> Iterable<S> save(Iterable<S> entities) {
        return personDao.save(entities);
    }

    public Person findOne(Long id) {
        return personDao.findOne(id);
    }

    public boolean exists(Long id) {
        return personDao.exists(id);
    }

    public Iterable<Person> findAll() {
        return personDao.findAll();
    }

    public long count() {
        return personDao.count();
    }

    public void delete(Long id) {
        personDao.delete(id);
    }

    public void delete(Person entity) {
        personDao.delete(entity);
    }

    public void delete(Iterable<? extends Person> entities) {
        personDao.delete(entities);
    }

    public void deleteAll() {
        personDao.deleteAll();
    }

    public Person findByNameAndSurnameAndSecondname(Person person) {
        return personDao.findByNameAndSurnameAndSecondName(person.getName(), person.getSurname(), person.getSecondName());
    }
}
