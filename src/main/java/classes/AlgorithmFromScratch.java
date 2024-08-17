package classes;

public class AlgorithmFromScratch {
    public static String multiplyTwoNumbers(String number1, String number2){
        int length_x = number1.length();
        int length_y = number2.length();
        int result[] = new int[length_x + length_y];

        for (int i = length_x - 1; i >= 0; i--) {
            //to swap ASCII to numbers.
            int digit_x = number1.charAt(i) - '0';
            for (int j = length_y - 1; j >= 0; j--) {
                int digit_y = number2.charAt(j) - '0';
                //multiply x*y and add a carry
                int sum = (digit_x * digit_y) + result[i+j+1];
                //to know if theres a carry
                result[i+j+1] = sum%10;
                //if there is put it to the next position
                result[i+j] += sum/10;
            }
        }
        //reconstruct string
        StringBuilder strbuilder = new StringBuilder();
        for (int result_string : result){
            strbuilder.append(result_string);
        }
        //to shift the string so it doesnt have 0s at the start
        int i = 0;
        while(i < strbuilder.length() && strbuilder.charAt(i) == '0'){
            i++;
        }
        //if the result are 0s
        if (i == strbuilder.length()) {
            return "0";
        }
        return strbuilder.substring(i);
    }
}
