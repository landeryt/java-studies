class ASum {

    public static long findNb(long m) {
        long i = 1;
        for (i = 1; m > 0; i++) {
            m -= i*i*i; // This still minuses even though m < 0 happens -> One extra i
            // Which is why we have to minus i by 1 at the end.
            if (m < 0) i = -1; // Even though i = -1, at the end of the loop, it gets +1 to 0.
        }
        return i-1;
    }
}
public class Main {
    public static void main(String[] args) {

    }
}