class Kata {
    // You call this a 7 kyu question? 
    public static int lostSheep(int[] fridayNightCounting, int[] saturdayNightCounting, int sheepTotal) {
        int sum1 = 0, sum2 = 0;
        for (int i = 0; i < fridayNightCounting.length; i++) {
            sum1 += fridayNightCounting[i];
        }
        for (int j = 0; j < saturdayNightCounting.length; j++) {
            sum2 += saturdayNightCounting[j];
        }
        return sheepTotal - sum1 - sum2;
    }
}
public class Main {
    public static void main(String[] args) {

    }
}