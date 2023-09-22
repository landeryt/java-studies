import java.util.Arrays;

class Kata
{
    public static int sum(int[] numbers) {
        if (numbers == null || numbers.length == 0 || numbers.length == 1) return 0;
        int min = numbers[0];
        int max = numbers[0];
        int sum1 = 0;
        for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] > max) {
                    max = numbers[i];
                }

                if (numbers[i] < min) {
                    min = numbers[i];
                }
                sum1 = sum1 + numbers[i];

            }
        sum1 = sum1 - min - max;
        return sum1;
        }

    }


}

public class Main {
    public static void main(String[] args) {

    }
}