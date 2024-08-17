package classes;

public class AlgorithmFromScratch {
    public static String trialAndError(String number1, String number2){
        int length_x = number1.length();
        int length_y = number2.length();
        int result[] = new int[length_x + length_y];

        for (int i = length_x - 1; i >= 0; i--) {
            //to swap ASCII to numbers.
            int digit_x = number1.charAt(i) - '0';
            for (int j = length_y - 1; j >= 0; j--) {
                int digit_y = number2.charAt(j) - '0';
                //result[i+j+1] = carry
                //4*4+0 = 16 % 10 = 1, 4*3+1 = 12 + 1 % 10 = 1, 4*2+1
                //
                int sum = (digit_x * digit_y) + result[i+j+1];
                System.out.println(result[i+j+1]);
                result[i+j+1] = sum%10;
                result[i+j] += sum/10;
            }

        }
        StringBuilder strbuilder = new StringBuilder();
        for (int result_string : result){
            strbuilder.append(result_string);
        }
        return strbuilder.toString();
    }
}

