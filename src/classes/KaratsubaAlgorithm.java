package classes;

public class KaratsubaAlgorithm {
    public static int karatsuba_alg(int x, int y){
        if(x < 10 || y < 10){
            return x * y;
        }
        //x=[1234] y[45674566]
        int length = Math.max(Long.toString(x).length(), Long.toString(y).length());
        int half_length = length/2;
        System.out.println("Half_length: "+ half_length);
        // 12 ... 34

        //for now the program can run
        return length;
    }
}
