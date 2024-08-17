package classes;

import java.math.BigInteger;

public class BigIntFunc {
    public static BigInteger bigInt_Mult(String number1, String number2){
        BigInteger first_number = new BigInteger(number1);
        BigInteger second_number = new BigInteger(number2);
        BigInteger result_alg1 = first_number.multiply(second_number);
        return result_alg1;
    }
}
