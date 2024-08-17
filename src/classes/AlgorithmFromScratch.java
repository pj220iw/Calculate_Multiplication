package classes;

import java.util.Arrays;

public class AlgorithmFromScratch {
    public static void theSlowestAlgorithm(String x, String y){
        int length_x = x.length();
        //System.out.println(length_x);
        int length_y = y.length();
        int length_y_for = y.length();
        //[1234] [1234]
        int result[] = new int[length_x + length_y];
        System.out.println("result: "+ Arrays.toString(result));

        long total = 0;
        long total_2 = 0;
        long multiplier = 1;
        for (int i = 0; i < length_y_for; i++) {
            //System.out.println(y.charAt(length_y-1));
            System.out.println(length_y);
            long x_x = Long.parseUnsignedLong(x);
            long y_y = Long.parseUnsignedLong(String.valueOf(y.charAt(length_y - 1)));
            if (i == 0) {
                total = (long) x_x * y_y;
            } else {
//                System.out.println("Else before total: " + total);
                multiplier = multiplier * 10;
                total_2 = x_x * y_y*multiplier;
//                System.out.println("Else total_2: " + total_2);
                total = total + total_2;
//                System.out.println("final: " + total_2);
            }

            length_y -= 1;
            System.out.println(total);
        }
    }
    public static String trialAndError(String number1, String number2){
        int length_x = number1.length();
        int length_y = number2.length();
        int result[] = new int[length_x + length_y];

        for (int i = length_x - 1; i >= 0; i--) {
            int carry = 0;
            //to swap ASCII to numbers.
            int digit_x = number1.charAt(i) - '0';
            for (int j = length_y - 1; j >= 0; j--) {
                int digit_y = number2.charAt(j) - '0';
                int final_result = digit_x * digit_y;
                //result[i+j+1] = carry
                int sum = final_result + result[i+j+1];
                result[i+j] += sum/10;
                result[i+j+1] = sum%10;

            }
        }
        StringBuilder builder = new StringBuilder();
        for (int result_string : result){
            builder.append(result_string);
        }
        return builder.toString();
    }
}

