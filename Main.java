class Kata {

    public static String solution(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }

}
public class Main {
    public static void main(String[] args) {

    }
}