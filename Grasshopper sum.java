class GrassHopper {

    public static int summation(int n) {
        // Here's a one-liner
        // return  n*(n+1)/2;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            //The sum always need to be bigger than 0, dummy
            //i also needs to be equal to n in order to get the full result
            sum += i;
        }
        return sum;

    }
}
public class Main {
    public static void main(String[] args) {

    }
}
