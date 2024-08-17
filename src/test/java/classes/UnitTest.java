package classes;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.*;

class UnitTest {

    @Test
    void multiplyTwoNumbers() {
        String result_alg = AlgorithmFromScratch.multiplyTwoNumbers("12345678901234567890", "11111111111111111111");
        assertEquals("137174210013717420998628257899862825790",result_alg);
        // Test numbers with zeros
        assertEquals("0", AlgorithmFromScratch.multiplyTwoNumbers("0", "123456789"));
        assertEquals("0", AlgorithmFromScratch.multiplyTwoNumbers("123456789", "0"));
        assertEquals("0", AlgorithmFromScratch.multiplyTwoNumbers("0", "0"));
        assertEquals("1", AlgorithmFromScratch.multiplyTwoNumbers("1", "1"));
    }
    @Test
    void bigIntegerTest(){
        String result_bigInt = String.valueOf(BigIntFunc.bigInt_Mult("12345678901234567890", "11111111111111111111"));
        assertEquals("137174210013717420998628257899862825790", result_bigInt);
        assertEquals(BigInteger.ZERO, BigIntFunc.bigInt_Mult("0", "123456789"));
        assertEquals(BigInteger.ZERO, BigIntFunc.bigInt_Mult("123456789", "0"));
        assertEquals(BigInteger.ZERO, BigIntFunc.bigInt_Mult("0", "0"));
        assertEquals(BigInteger.ONE, BigIntFunc.bigInt_Mult("1", "1"));
        assertEquals(BigInteger.TEN, BigIntFunc.bigInt_Mult("1", "10"));
    }
    @Test
    void Alg_vs_BigInt(){
        String result_alg = AlgorithmFromScratch.multiplyTwoNumbers("12345678901234567890", "11111111111111111111");
        String result_bigInt = String.valueOf(BigIntFunc.bigInt_Mult("12345678901234567890", "11111111111111111111"));
        assertEquals(result_alg, result_bigInt);
    }

}