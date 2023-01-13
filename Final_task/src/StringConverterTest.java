import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringConverterTest {

    @Test
    void stringConverter() {
        StringConverter stringConverter = new StringConverter();
        String str = "3 + 4";
        String[] str_array = new String[3];
        str_array[0] = "3";
        str_array[1] = "+";
        str_array[2] = "4";
        assertEquals(str_array,stringConverter.StringConverter(str));
    }
}