package by.epam.persistance.dto;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "TicketStatus")
public @Data class TicketStatus implements Serializable, Cloneable {
    @Id
    @Column(name = "ticketStatusId", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long ticketStatusId;
    @Column(name = "ticketStatus", nullable = false)
    private String ticketStatus;

    @Transient
    @OneToMany(mappedBy = "ticketStatus", fetch = FetchType.EAGER)
    private List<RailwayTicket> railwayTickets;
}
