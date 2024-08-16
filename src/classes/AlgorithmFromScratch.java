package classes;

public class AlgorithmFromScratch {
    public static void theSlowestAlgorithm(String x, String y){
        int length_x = x.length();
        //System.out.println(length_x);
        int length_y = y.length();
        //[1234] [1234]
        int total = 0;
        for (int i = 0; i < length_x; i++){
            //System.out.println(y.charAt(length_y-1));
            if(i==0) {
                int x_x = Integer.parseInt(x);
                int y_y = Integer.parseInt(String.valueOf(y.charAt(length_y - 1)));
                System.out.println(y_y);
                total = x_x * y_y;
            } else if (i>1) {

            }

            length_y -= 1;
            System.out.println(total);
            //System.out.println(length_x);
        }
    }
}

