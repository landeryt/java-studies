class PrimeDecomp {
// I'm proud of you.
    public static String factors(int n) {
        String num1 = ""; // 2 decom
        String num = ""; // result
        String cache = ""; // temp
        int i;
        int times = 1;
        for (i = 1; n % 2 == 0; i++ ) {
            if (i == 1) {
                num1 = "(" + 2 + ")";
            } else if (i ==2 ) {
                num1 = "(" + 2 + "**" + 2 + ")";
            } else num1 = "(" + 2 + "**" + i + ")";
            n /= 2;
        }
        for (int j = 3; j <= Math.sqrt(n); j += 2) {
            times = 1;
            while (n % j == 0) {
                if (times == 1) {
                    cache = "(" + j + ")";
                } else if (times > 1) {
                    cache = "(" + j + "**" + times + ")";
                }
                times++;
                n /= j;
            }
            num1 += cache;
            cache = "";
        }
        num = num1 + "(" + n + ")";
        System.out.println(num);
        return num;
    }

}
public class Main {
    public static void main(String[] args) {
        PrimeDecomp.factors(6969696);
    }
}