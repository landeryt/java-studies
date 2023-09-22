class TrafficLights {

    public static String updateLight(String current) {
        switch(current) {
            case "green":
                current = "yellow";
                break;
            case "yellow":
                current = "red";
                break;
            case "red":
                current = "green";
                break;


        }
        return current;

    }

}
public class Main {
    public static void main(String[] args) {
        TrafficLights.updateLight("green");
    }
}