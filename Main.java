class Kata {
    // Just remember to add result on both sides of the equation.
    public static String countingSheep(int num) {
        String result = "";
        if (num > 0) {
            for (int i = 1; i <= num; i++) {
                result = result + i + " sheep...";
            }
        } else result = "";
        return result;
    }
}
public class Main {
    public static void main(String[] args) {

    }
}