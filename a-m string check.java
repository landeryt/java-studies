class Printer {
//Inputs a string, checks each digit if it's a letter between a-m, returns number of digits that didn't pass the filter along with the string length
    public static String printerError(String s) {
// return s.replaceAll("[a-m]", "").length() + "/" + s.length(); 
// Literally just one line of code and beats my entire system??? 
        int max = s.length();
        int good = 0;
        int i;
        for (i = 0; i < s.length(); i++) {
            if (s.charAt(i) <= 'm' && s.charAt(i) >= 'a') {
                good = good + 1;
            }
        }
        int bad = max - good;
        String result = bad + "/" + max;
        return result;
    }
}
public class Main {
    public static void main(String[] args) {

    }
}
