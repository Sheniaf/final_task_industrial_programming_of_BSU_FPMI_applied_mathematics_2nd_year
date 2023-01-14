import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class TXTWritterTest {

    @Test
    void TXTWRITER() throws IOException {
        String string = "2.0";
        TXTWritter txtWritter = new TXTWritter();
        txtWritter.TXTWRITER(string,"test_output.txt");
        TXTReader txtReader = new TXTReader();
        assertEquals(string,txtReader.TXTREADER("test_output.txt"));
    }
}