// Surprising that no one has a similar code
class Kata {
    public static boolean feast(String beast, String dish) {
        beast = beast.toLowerCase();
        dish = dish.toLowerCase();
        boolean ok;
        if (beast.charAt(0) == dish.charAt(0) && beast.charAt(beast.length() - 1) == dish.charAt(dish.length() - 1)) {
            ok = true;
        } else ok = false;
        return ok;
    }
}

public class Main {
    public static void main(String[] args) {

    }
}
