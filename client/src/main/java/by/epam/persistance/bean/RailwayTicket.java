
package by.epam.persistance.bean;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for railwayTicket complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="railwayTicket">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cityFrom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cityTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="oneWay" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="owner" type="{http://controller.epam.by/}person" minOccurs="0"/>
 *         &lt;element name="railwayTicketId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="roundTrip" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ticketNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ticketStatus" type="{http://controller.epam.by/}ticketStatus" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "railwayTicket", propOrder = {
    "cityFrom",
    "cityTo",
    "oneWay",
    "owner",
    "railwayTicketId",
    "roundTrip",
    "ticketNumber",
    "ticketStatus"
})
public class RailwayTicket {

    protected String cityFrom;
    protected String cityTo;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar oneWay;
    protected Person owner;
    protected long railwayTicketId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar roundTrip;
    protected String ticketNumber;
    protected TicketStatus ticketStatus;

    /**
     * Gets the value of the cityFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityFrom() {
        return cityFrom;
    }

    /**
     * Sets the value of the cityFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityFrom(String value) {
        this.cityFrom = value;
    }

    /**
     * Gets the value of the cityTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityTo() {
        return cityTo;
    }

    /**
     * Sets the value of the cityTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityTo(String value) {
        this.cityTo = value;
    }

    /**
     * Gets the value of the oneWay property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOneWay() {
        return oneWay;
    }

    /**
     * Sets the value of the oneWay property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOneWay(XMLGregorianCalendar value) {
        this.oneWay = value;
    }

    /**
     * Gets the value of the owner property.
     * 
     * @return
     *     possible object is
     *     {@link Person }
     *     
     */
    public Person getOwner() {
        return owner;
    }

    /**
     * Sets the value of the owner property.
     * 
     * @param value
     *     allowed object is
     *     {@link Person }
     *     
     */
    public void setOwner(Person value) {
        this.owner = value;
    }

    /**
     * Gets the value of the railwayTicketId property.
     * 
     */
    public long getRailwayTicketId() {
        return railwayTicketId;
    }

    /**
     * Sets the value of the railwayTicketId property.
     * 
     */
    public void setRailwayTicketId(long value) {
        this.railwayTicketId = value;
    }

    /**
     * Gets the value of the roundTrip property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRoundTrip() {
        return roundTrip;
    }

    /**
     * Sets the value of the roundTrip property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRoundTrip(XMLGregorianCalendar value) {
        this.roundTrip = value;
    }

    /**
     * Gets the value of the ticketNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketNumber() {
        return ticketNumber;
    }

    /**
     * Sets the value of the ticketNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketNumber(String value) {
        this.ticketNumber = value;
    }

    /**
     * Gets the value of the ticketStatus property.
     * 
     * @return
     *     possible object is
     *     {@link TicketStatus }
     *     
     */
    public TicketStatus getTicketStatus() {
        return ticketStatus;
    }

    /**
     * Sets the value of the ticketStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link TicketStatus }
     *     
     */
    public void setTicketStatus(TicketStatus value) {
        this.ticketStatus = value;
    }

}
