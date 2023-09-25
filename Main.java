class Codewars {
    public static String oddOrEven (int[] array) {
        if (array.length == 0) return "even";
        int sum = 0;
        String result = "";
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        if (sum % 2 == 0) result = "even";
        if (sum % 2 == 1) result = "odd";
        return result;
    }

}
public class Main {
    public static void main(String[] args) {

    }
}