// Turns out 5 x 5 = 25, will make 2 zeroes instead of 1.
// I did not manage to do this.
class Solution {
    public static int zeros(int n) {
        int res = 0;
        for (int i = 5; i <= n; i *= 5) {
            res += n / i;
        }
        System.out.println(res);
        return res;
    }
}
public class Main {
    public static void main(String[] args) {
        Solution.zeros(50);

    }
}