import java.lang.Character;
// Failed codewars Kata.
// Turns out it was impossible to quickly change characters in a string. This was different
// from C's strings, where strings were char arrays.

// The following class turns the input string to a char array, which can then easily be modified
// and turned into a string later on.
class JadenCase {

    public String toJadenCase(String phrase) {
        if(phrase == null || phrase.isEmpty()) return null;

        char[] array = phrase.toCharArray();

        for(int x = 0; x < array.length; x++) {
            if(x == 0 || array[x-1] == ' ') {
                array[x] = Character.toUpperCase(array[x]);
            }
        }

        return new String(array);
    }

}
public class Main {
    public static void main(String[] args) {

    }
}
