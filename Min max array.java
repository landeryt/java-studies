class MinMax {
    public static int[] minMax(int[] arr) {
        int min = arr[0]; int max = arr[0];
        // Not exactly sure how to directly return arrays, so I guess I can do this.
        int result[] = new int[2];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) min = arr[i];
            if (arr[i] > max) max = arr[i];
        }
        result[0] = min;
        result[1] = max;
        return result;
        // return new int[] {min, max};
    }
}
public class Main {
    public static void main(String[] args) {

    }
}
