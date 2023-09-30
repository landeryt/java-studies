import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        String message[] = new String[100];
        try {
            for (int i = 0; i < message.length; i++) {
                message[i] = br.readLine();
                if (message[i].equalsIgnoreCase("stop")) break;
            }
            for (int i = 0; i < message.length; i++) {
                if (message[i].equalsIgnoreCase("stop")) break;
                System.out.println(message[i]);
            }
        }catch (IOException e) {
            System.out.println(e);
        }
        System.out.println(Arrays.toString(message));
    }
}