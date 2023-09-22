import java.util.Locale;

class XOXO {
    public static boolean getXO (String str) {
        str = str.toLowerCase();

        // return str.replace("o","").length() == str.replace("x","").length();
        /* Basically deletes the x and o characters, if the string is still equal in
        length after that, then the number of x and o are the same.
         */
        int countX = 0;
        int countO = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'x') {
                countX = countX + 1;
            }
            if (str.charAt(i) == 'o') {
                countO = countO + 1;
            }
        }
        if (countX == countO) {
        return true;
        } else return false;
    }
}
public class Main {
    public static void main(String[] args) {

    }
}