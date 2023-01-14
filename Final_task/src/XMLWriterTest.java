import org.junit.jupiter.api.Test;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class XMLWriterTest {

    @Test
    void XMLWRITER() throws ParserConfigurationException, IOException, SAXException {
        XMLWriter xmlWriter = new XMLWriter();
        xmlWriter.XMLWRITER("text_output.xml","testResualt","2.0");
        XMLReader xmlReader = new XMLReader();
        assertEquals("2.0",xmlReader.reader("test_output.xml", "testResualt"));
    }
}