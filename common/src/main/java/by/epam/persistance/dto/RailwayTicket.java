package by.epam.persistance.dto;

import by.epam.annotation.RandomUUID;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "RailwayTicket")
@XmlRootElement(name = "railwayTicket")
public class RailwayTicket implements Serializable, Cloneable{
    @Id
    @Column(name = "ticketId", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long railwayTicketId;
    @Column(name = "ticketStatusId", nullable = false)
    private long ticketStatusId;
    @Column(name = "ticketNumber", nullable = false, unique = true)
    @RandomUUID
    private String ticketNumber;
    @Column(name = "cityFrom", nullable = false)
    private String cityFrom;
    @Column(name = "cityTo", nullable = false)
    private String cityTo;
    @Column(name = "oneWay", nullable = false)
    private Date oneWay;
    @Column(name = "roundTrip", nullable = false)
    private Date roundTrip;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name="ticketStatusId", nullable = false, insertable = false, updatable = false)
    private TicketStatus ticketStatus;
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "personId", nullable = false)
    private Person owner;

    public RailwayTicket() {
    }

    @XmlElement
    public long getRailwayTicketId() {
        return railwayTicketId;
    }

    public void setRailwayTicketId(long railwayTicketId) {
        this.railwayTicketId = railwayTicketId;
    }

    public long getTicketStatusId() {
        return ticketStatusId;
    }

    public void setTicketStatusId(long ticketStatusId) {
        this.ticketStatusId = ticketStatusId;
    }

    @XmlElement
    public String getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(String ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    @XmlElement
    public String getCityFrom() {
        return cityFrom;
    }

    public void setCityFrom(String cityFrom) {
        this.cityFrom = cityFrom;
    }

    @XmlElement
    public String getCityTo() {
        return cityTo;
    }

    public void setCityTo(String cityTo) {
        this.cityTo = cityTo;
    }

    @XmlElement
    public Date getOneWay() {
        return oneWay;
    }

    public void setOneWay(Date oneWay) {
        this.oneWay = oneWay;
    }

    @XmlElement
    public Date getRoundTrip() {
        return roundTrip;
    }

    public void setRoundTrip(Date roundTrip) {
        this.roundTrip = roundTrip;
    }

    @XmlElement
    public TicketStatus getTicketStatus() {
        return ticketStatus;
    }

    public void setTicketStatus(TicketStatus ticketStatus) {
        this.ticketStatus = ticketStatus;
    }

    @XmlElement
    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RailwayTicket ticket = (RailwayTicket) o;

        if (railwayTicketId != ticket.railwayTicketId) return false;
        if (ticketStatusId != ticket.ticketStatusId) return false;
        if (!ticketNumber.equals(ticket.ticketNumber)) return false;
        if (!cityFrom.equals(ticket.cityFrom)) return false;
        if (!cityTo.equals(ticket.cityTo)) return false;
        if (!oneWay.equals(ticket.oneWay)) return false;
        if (!roundTrip.equals(ticket.roundTrip)) return false;
        if (!ticketStatus.equals(ticket.ticketStatus)) return false;
        return owner.equals(ticket.owner);

    }

    @Override
    public int hashCode() {
        int result = (int) (railwayTicketId ^ (railwayTicketId >>> 32));
        result = 31 * result + (int) (ticketStatusId ^ (ticketStatusId >>> 32));
        result = 31 * result + ticketNumber.hashCode();
        result = 31 * result + cityFrom.hashCode();
        result = 31 * result + cityTo.hashCode();
        result = 31 * result + oneWay.hashCode();
        result = 31 * result + roundTrip.hashCode();
        result = 31 * result + ticketStatus.hashCode();
        result = 31 * result + owner.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "RailwayTicket{" +
                "railwayTicketId=" + railwayTicketId +
                ", ticketNumber='" + ticketNumber + '\'' +
                ", cityFrom='" + cityFrom + '\'' +
                ", cityTo='" + cityTo + '\'' +
                ", oneWay=" + oneWay +
                ", roundTrip=" + roundTrip +
                ", ticketStatus=[" + ticketStatus +
                "], owner=[" + owner +
                "]}";
    }
}
