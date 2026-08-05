import java.util.*;

class Calci {
    static double add (double a, double b) {
        return a + b;
    }

    static double add (double a, double b, double c) {
        return a + b + c;
    }
}

public class Main_1 {
    public static void main (String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enter first number : ");
            int a = in.nextInt();

            System.out.print("Enter second number : ");
            int b = in.nextInt();

            System.out.print("Enter third number : ");
            int c = in.nextInt();

            System.out.println("\nSum of two : " + Calci.add(a, b));
            System.out.println("Sum of three : " + Calci.add(a, b, c));
        }
    }
}

