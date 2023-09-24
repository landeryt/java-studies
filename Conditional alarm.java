class Alarm {

    public static boolean setAlarm(boolean employed, boolean vacation) {
        boolean result;
        if (employed == true && vacation == false) {
            result = true;
        } else result = false;
        return result;
    }

}
public class Main {
    public static void main(String[] args) {

    }
}
