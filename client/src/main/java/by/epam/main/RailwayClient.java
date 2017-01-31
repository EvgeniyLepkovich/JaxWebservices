package by.epam.main;

import by.epam.persistance.bean.JaxwsController;
import by.epam.persistance.bean.JaxwsControllerService;
import by.epam.persistance.bean.RailwayTicket;

import javax.xml.namespace.QName;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by Fene4ka_ on 26.01.2017.
 */
public class RailwayClient {

    private final QName qName = new QName(
            "http://controller.epam.by/", "JaxwsControllerService");
    private final static String WSDL_URL = "http://localhost:8070/common_war_exploded/JaxwsTicket?wsdl";
    private static final Long ID = new Long(9);

    public static void main(String[] args){
        URL url = getWSDLURL(WSDL_URL);
        RailwayClient client = new RailwayClient();
        client.findOne(url, ID);
    }

    private static URL getWSDLURL(String urlStr) {
        URL url = null;
        try {
            url = new URL(urlStr);
        } catch (MalformedURLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        return url;
    }

    public void findOne(URL url, Long id) {

        JaxwsControllerService jaxwsControllerService = new JaxwsControllerService(url, qName);
        JaxwsController port = jaxwsControllerService.getJaxwsControllerPort();
        RailwayTicket orderResponse = port.findOne(id);

        System.out.println(orderResponse == null);

    }


}
