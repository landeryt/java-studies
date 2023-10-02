import java.io.*;

public class Main {
    public static void main(String[] args) {

        try {
            InputStreamReader ir = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(ir);
            System.out.println("Please add your input file name: ");
            String inputy = br.readLine();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println("Please add your output file name: ");
            String outputy = br.readLine();
            FileInputStream fin = new FileInputStream(inputy);
            FileOutputStream fout = new FileOutputStream(outputy);
            int input = 0;
            System.out.println("Copying file...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            do {
                input = fin.read();
                if (input != -1) fout.write(input);
            } while (input != -1);
            System.out.println("File has been copied...");
            System.out.println("Would you like to add more information to the output file?");
            System.out.println("Yes/No ");
            String yesNo = br.readLine();
            if (yesNo.equalsIgnoreCase("yes")) {
                System.out.println("Please input your extra information: ");
                do {
                    input = br.read();
                    fout.write(input);
                } while (input != 'X');
            } else System.out.println("System ended.");
            fin.close();
            fout.close();



        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
