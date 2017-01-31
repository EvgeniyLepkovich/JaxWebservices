package by.epam.util;

import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.io.StringReader;

public class XmlConverter {
    private static final String XML_VERSION = "<?xml version='1.0' encoding='utf-8'?>";

    public static Document stringToXml(String xml) throws ParserConfigurationException, IOException, SAXException {
        xml = XML_VERSION + xml;
        DocumentBuilderFactory fctr = DocumentBuilderFactory.newInstance();
        DocumentBuilder bldr = fctr.newDocumentBuilder();
        InputSource insrc = new InputSource(new StringReader(xml));
        return bldr.parse(insrc);
    }
}
