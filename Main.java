class RgbToHex {

    public static String rgb(int r, int g, int b) {
        if (r>255) r = 255;
        if (r<0) r = 0;
        if (g > 255) g = 255;
        if (g < 0) g = 0;
        if (b > 255) b = 255;
        if (b < 0) b = 0;
        // Got this string.format from stackoverflow, still got no idea how this works at the moment
        String hex = String.format("%02X%02X%02X", r, g, b);
        System.out.println(hex);
        return hex;

    }
}

public class Main {
    public static void main(String[] args) {
        RgbToHex.rgb(-20,45,200);
    }
}