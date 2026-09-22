import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("data.txt");
            fw.write("Hello, this is a Java file handling program.");
            fw.close();

            FileReader fr = new FileReader("data.txt");
            BufferedReader br = new BufferedReader(fr);

            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();
            fr.close();

        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }
    }
}   