import org.junit.jupiter.api.Test;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class XMLReaderTest {

    @Test
    void reader() throws ParserConfigurationException, IOException, SAXException {
        XMLReader xmlReader = new XMLReader();
        assertEquals("3 + 4", xmlReader.reader("src/input_test.xml","String"));
    }
}