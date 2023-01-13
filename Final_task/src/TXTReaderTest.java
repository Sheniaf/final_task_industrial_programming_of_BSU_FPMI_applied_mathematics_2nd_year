import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class TXTReaderTest {

    @Test
    void TXTREADER() throws IOException {
        TXTReader txtReader = new TXTReader();
        assertEquals("3 + 4",txtReader.TXTREADER("src/input_test.txt"));
    }
}