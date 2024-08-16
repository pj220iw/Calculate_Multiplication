package classes;

public class AlgorithmFromScratch {
    public static void theSlowestAlgorithm(String x, String y){
        int length_x = x.length();
        //System.out.println(length_x);
        int length_y = y.length();
        //[1234] [1234]
        int total = 0;
        int total_2 = 0;
        int multiplier = 1;
        for (int i = 0; i < length_x; i++) {
            //System.out.println(y.charAt(length_y-1));
            int x_x = Integer.parseInt(x);
            int y_y = Integer.parseInt(String.valueOf(y.charAt(length_y - 1)));
            if (i == 0) {
                total = x_x * y_y;
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
}

