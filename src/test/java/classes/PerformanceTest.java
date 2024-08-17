package classes;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;
import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class PerformanceTest {

    @Test
    void bigInt_Mult() {
        String num1 = "12345678901234567890123456789012345678901234567890";
        String num2 = "98765432109876543210987654321098765432109876543210";

        assertTimeout(Duration.ofSeconds(1), () -> {BigInteger result = BigIntFunc.bigInt_Mult(num1, num2);});
    }
}