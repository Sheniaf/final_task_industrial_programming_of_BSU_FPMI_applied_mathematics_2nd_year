import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class XMLReader {
public String reader(String filename, String tagname) throws ParserConfigurationException, IOException, SAXException {
    String str = "";
    DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
    DocumentBuilder builder = factory.newDocumentBuilder();
    Document document = builder.parse(new File(filename));
    document.getDocumentElement().normalize();
    NodeList nodeList = document.getElementsByTagName(tagname);
    Node node = nodeList.item(0);
    if(node.getNodeType() == Node.ELEMENT_NODE){
        Element element = (Element) node;
        str = element.getTextContent();
    }
    return str;
}
}
