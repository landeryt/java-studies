class DescendingOrder {
    public static int sortDesc(final int num) {
        int[] digitsCount = new int[10]; //contains all digits from 0..9 to increment their count
        int number = num;
        while (number != 0) { //makes an array that counts how many digits of each there are, in the number
            int digit = number % 10; //if this here gets a 4
            digitsCount[digit]++; //the location that represents "4" (5th) will now have a counter of 1
            number /= 10;
        }
        int result = 0;
        for (int digit = 9; digit >= 0; --digit) {
            int count = digitsCount[digit]; // from 0 to 9, we are at number 9, but 10th position
            for (int i = 0; i < count; ++i) // if there are no digits of a number, this won't run
                result = result * 10 + digit; //even if it's plus 0, it will still be multiplied by 0, adding a 0 digit
        }
        System.out.println(result);
        return result;
    }
}
public class Main {
    public static void main(String[] args) {
        DescendingOrder.sortDesc(1240);
    }
}
