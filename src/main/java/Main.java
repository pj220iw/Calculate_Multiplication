import java.math.BigInteger;

import static classes.AlgorithmFromScratch.*;

public class Main {
    public static void main(String[] args) {
        if (args[0].equals("--alg1") && args.length == 3) {
                BigInteger first_number = new BigInteger(args[1]);
                BigInteger second_number = new BigInteger(args[2]);
                BigInteger result_alg1 = first_number.multiply(second_number);
                System.out.printf(String.valueOf(result_alg1));
            } else if (args[0].equals("--alg2") && args.length == 3) {
            String result_alg2 = multiplyTwoNumbers(args[1], args[2]);
            System.out.printf(result_alg2);
        }else System.out.println("No arguments provided or not enough arguments");
    }
}