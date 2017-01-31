
package by.epam.persistance.bean;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ticketStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ticketStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="railwayTicket" type="{http://controller.epam.by/}railwayTicket" minOccurs="0"/>
 *         &lt;element name="ticketStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ticketStatusId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ticketStatus", propOrder = {
    "railwayTicket",
    "ticketStatus",
    "ticketStatusId"
})
public class TicketStatus {

    protected RailwayTicket railwayTicket;
    protected String ticketStatus;
    protected long ticketStatusId;

    /**
     * Gets the value of the railwayTicket property.
     * 
     * @return
     *     possible object is
     *     {@link RailwayTicket }
     *     
     */
    public RailwayTicket getRailwayTicket() {
        return railwayTicket;
    }

    /**
     * Sets the value of the railwayTicket property.
     * 
     * @param value
     *     allowed object is
     *     {@link RailwayTicket }
     *     
     */
    public void setRailwayTicket(RailwayTicket value) {
        this.railwayTicket = value;
    }

    /**
     * Gets the value of the ticketStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketStatus() {
        return ticketStatus;
    }

    /**
     * Sets the value of the ticketStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketStatus(String value) {
        this.ticketStatus = value;
    }

    /**
     * Gets the value of the ticketStatusId property.
     * 
     */
    public long getTicketStatusId() {
        return ticketStatusId;
    }

    /**
     * Sets the value of the ticketStatusId property.
     * 
     */
    public void setTicketStatusId(long value) {
        this.ticketStatusId = value;
    }

}
