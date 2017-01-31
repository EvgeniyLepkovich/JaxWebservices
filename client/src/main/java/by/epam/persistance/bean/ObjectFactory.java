
package by.epam.persistance.bean;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the by.epam.persistance.bean package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _FindOneResponse_QNAME = new QName("http://controller.epam.by/", "findOneResponse");
    private final static QName _FindOne_QNAME = new QName("http://controller.epam.by/", "findOne");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: by.epam.persistance.bean
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FindOneResponse }
     * 
     */
    public FindOneResponse createFindOneResponse() {
        return new FindOneResponse();
    }

    /**
     * Create an instance of {@link FindOne }
     * 
     */
    public FindOne createFindOne() {
        return new FindOne();
    }

    /**
     * Create an instance of {@link Person }
     * 
     */
    public Person createPerson() {
        return new Person();
    }

    /**
     * Create an instance of {@link TicketStatus }
     * 
     */
    public TicketStatus createTicketStatus() {
        return new TicketStatus();
    }

    /**
     * Create an instance of {@link RailwayTicket }
     * 
     */
    public RailwayTicket createRailwayTicket() {
        return new RailwayTicket();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindOneResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controller.epam.by/", name = "findOneResponse")
    public JAXBElement<FindOneResponse> createFindOneResponse(FindOneResponse value) {
        return new JAXBElement<FindOneResponse>(_FindOneResponse_QNAME, FindOneResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindOne }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controller.epam.by/", name = "findOne")
    public JAXBElement<FindOne> createFindOne(FindOne value) {
        return new JAXBElement<FindOne>(_FindOne_QNAME, FindOne.class, null, value);
    }

}
