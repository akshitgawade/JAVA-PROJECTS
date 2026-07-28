
import java.util.StringTokenizer;

public class Main4 {
    public static void main(String[] args) {
        String data = "R,C++,Python,SQL,Java";

        StringTokenizer st = new StringTokenizer(data, ",");

        System.out.println("Tokens are : ");

        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}