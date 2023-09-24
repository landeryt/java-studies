class Kata{
    public static double find_average(int[] array){
        if (array.length == 0) {
            return 0;
        }
        double sum = 0;
        int i;
        for (i = 0; i < array.length; i++ ) {
            sum = sum + array[i];
        }
        /* You have to re-cast the return value to double, otherwise sometimes when the
        result is an integer, it just turns itself to an int instead?

        Oh my god, I just realised I should have just made sum into a double...
        Disregard what I just said up there.
         */
        return sum / array.length;
    }
}
public class Main {
    public static void main(String[] args) {

    }
}