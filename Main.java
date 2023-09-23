class Kata
{
    public static String reverseWords(final String original)
    {
        /* Gotta get at least 2 placeholders and instead of calling them "null", call them ""

         */
        String result = "";
        String notOriginal = "";
        for (int i = original.length() - 1; i >= 0; i--) {
            if (original.charAt(i) != ' ') {
                notOriginal = notOriginal + original.charAt(i);
            } else {
                result = " " + notOriginal + result;
                notOriginal = "";
            }
        }
        result = notOriginal + result;
        System.out.println(result);
        return result;
    }
}
public class Main {
    public static void main(String[] args) {
        Kata.reverseWords("how dy");
    }
}