class Kata {
    // Self-explanatory, returns the min and max value of an array.
    public int min(int[] list) {
        int min = list[0];
        for (int i = 0; i < list.length; i++) {
            if (list[i] < min) min = list[i];
        }
        return min;
    }
    public int max(int[] list) {
        int max = list[0];
        for (int i = 0; i < list.length; i++) {
            if (list[i] > max) max = list[i];
        }
        return max;
    }
}
public class Main {
    public static void main(String[] args) {

    }
}
