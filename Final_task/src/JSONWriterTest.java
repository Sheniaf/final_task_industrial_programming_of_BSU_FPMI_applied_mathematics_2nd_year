import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JSONWriterTest {

    @Test
    void JSONWRITER() {
        JSONWriter jsonWriter = new JSONWriter();
        jsonWriter.JSONWRITER("test_output.json", "3", "2.0");
        JSONReader jsonReader = new JSONReader();
        assertEquals("2.0", jsonReader.JSONREADER("test_output.json", "3"));
    }
}