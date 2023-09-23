class Arge {
    public static int nbYear(int p0, double percent, int aug, int p) {
        int y = 0;
        // Always remember to divide by 100 before going into a loop, and that it's a percentage.
        percent = percent / 100;
        while (p0 < p) {
            p0 += p0 * percent + aug;
            y++;
        }
        System.out.println(y);
        return y;
    }
}
public class Main {
    public static void main(String[] args) {
        Arge.nbYear(1000, 0.1, 50, 1300);
    }
}