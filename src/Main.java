import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        if(args.length == 2){
            BigInteger first_number = new BigInteger(args[0]);
            BigInteger second_number = new BigInteger(args[1]);
            BigInteger result = first_number.multiply(second_number);
            System.out.println(result);
        }
        else {
            System.out.println("No arguments provided or not enough arguments");
        }

    }
}