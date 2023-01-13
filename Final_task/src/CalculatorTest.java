import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @org.junit.jupiter.api.Test
    void testCALCULATOR() {
        Calculator calculator = new Calculator();
        String str1 = "3";
        String str2 = "+";
        String str3 = "4";
        assertEquals(7,calculator.CALCULATOR(str1,str2,str3));
    }
}
