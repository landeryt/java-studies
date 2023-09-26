class Solution {

    public static String rot13(String message) {
        String result = "";
        for (int i = 0; i < message.length(); i++) {
            if ((message.charAt(i) >= 'a' && message.charAt(i) <= 'm') || (message.charAt(i) >= 'A' && message.charAt(i) <= 'M')) {
                result = result + (char)(message.charAt(i) + 13);
            } else if ((message.charAt(i) >= 'n' && message.charAt(i) <= 'z') || (message.charAt(i) >= 'N' && message.charAt(i) <= 'Z')) {
                result = result + (char)(message.charAt(i) - 13);
            } else result += message.charAt(i);
        }
        return result;
    }
}
public class Main {
    public static void main(String[] args) {
        String a = "subscribe";
        char b = (char)(a.charAt(2) + 3);
        System.out.println(b);
    }
}
