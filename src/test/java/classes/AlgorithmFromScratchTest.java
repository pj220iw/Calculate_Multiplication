package classes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlgorithmFromScratchTest {

    @Test
    void multiplyTwoNumbers() {
        String result_alg = AlgorithmFromScratch.multiplyTwoNumbers("8941561498", "98456118965");
        assertEquals("880351442579951609570",result_alg);
    }
    @Test
    void bigIntegerTest(){
        String result_bigInt = String.valueOf(BigIntFunc.bigInt_Mult("8941561498", "98456118965"));
        assertEquals("880351442579951609570", result_bigInt);
    }
    @Test
    void Alg_vs_BigInt(){
        String result_alg = AlgorithmFromScratch.multiplyTwoNumbers("8941561498", "98456118965");
        String result_bigInt = String.valueOf(BigIntFunc.bigInt_Mult("8941561498", "98456118965"));
        assertEquals(result_alg, result_bigInt);
    }

}