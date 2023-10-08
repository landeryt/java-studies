class Clock
{
    public static int Past(int h, int m, int s)
    {
        int second = s * 1000;
        int minute = m * 1000 * 60;
        int hour = h * 1000 * 60 * 60;
        return second + minute + hour;
    }
}
public class Main {
    public static void main(String[] args) {

    }
}
