class Solution {

    public static boolean validatePin(String pin) {
        boolean yes = true;
        if (pin.length() == 4 | pin.length() == 6) {
            for (char c : pin.toCharArray()) {
                if (Character.isDigit(c)) {
                    System.out.println("a");
                } else {
                    yes = false;
                    break;
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