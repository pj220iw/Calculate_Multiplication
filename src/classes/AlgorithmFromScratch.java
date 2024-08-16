package classes;

public class AlgorithmFromScratch {
    public static void theSlowestAlgorithm(String x, String y){
        int length_x = x.length();
        //System.out.println(length_x);
        int length_y = y.length();
        int length_y_for = y.length();
        //[1234] [1234]
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
}

