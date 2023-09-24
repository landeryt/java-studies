class KataAnswer {
// Turns out "Object" is a valid variable. Object can include everything, while I only worked with int.
    public static Object[] removeEveryOther(Object[] arr) {
        // Length of arrays are automatically forced into integers anyway. Takes the pre-decimal digit.
        Object[] output = new Object[(arr.length + 1) / 2];

        for (int i = 0; i < output.length; i++) {
            //  0 -> 1 x 2 -> 2 x 2 -> ...
            output[i] = arr[i * 2];
        }

        return output;
    }
}
public class Main {
    public static void main(String[] args) {

    }
}
