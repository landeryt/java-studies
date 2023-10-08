class Solution {

    public static boolean validatePin(String pin) {
        boolean yes = true;
        if (pin.length() == 4 | pin.length() == 6) {
            for (char c : pin.toCharArray()) {
                // Character.isDigit is used to check if the char is a number
                if (Character.isDigit(c)) {
                    System.out.println("a"); // this just does nothing.
                } else {
                    yes = false;
                    break; // break out of the loop
                }
            }
        } else yes = false;
        return yes;
    }
}
public class Main {
    public static void main(String[] args) {

    }
}
