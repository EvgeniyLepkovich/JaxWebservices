package by.epam.service.impl;

import by.epam.persistance.dao.TicketStatusDao;
import by.epam.persistance.dto.TicketStatus;
import by.epam.service.ITicketStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class TicketStatusService implements ITicketStatusService {
    @Autowired
    private TicketStatusDao ticketStatusDao;

    public <S extends TicketStatus> S save(S entity) {
        return ticketStatusDao.save(entity);
    }

    public <S extends TicketStatus> Iterable<S> save(Iterable<S> entities) {
        return ticketStatusDao.save(entities);
    }

    public TicketStatus findOne(Long id) {
        return ticketStatusDao.findOne(id);
    }

    public boolean exists(Long id) {
        return ticketStatusDao.exists(id);
    }

    public Iterable<TicketStatus> findAll() {
        return ticketStatusDao.findAll();
    }

    public long count() {
        return ticketStatusDao.count();
    }

    public void delete(Long id) {
        ticketStatusDao.delete(id);
    }

    public void delete(TicketStatus entity) {
        ticketStatusDao.delete(entity);
    }

    public void delete(Iterable<? extends TicketStatus> entities) {
        ticketStatusDao.delete(entities);
    }

    public void deleteAll() {
        ticketStatusDao.deleteAll();
    }
}
