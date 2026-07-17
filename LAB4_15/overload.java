/* Method Overloading

A software company is developing a calculator application 
that should support addition of different types of inputs:

Two integers
Two floating-point numbers
Three integer

*/
import java.util.Scanner;
class overload{
    void sum(int a, int b){
        System.out.println("Sum of two integers: " + (a + b));
    }
    void sum(float a, float b){
        System.out.println("Sum of two floating-point numbers: " + (a + b));
    }
    void sum(int a, int b, int c){
        System.out.println("Sum of three integers: " + (a + b + c));
    }

    // overload obj = new overload();
    // obj.sum(10, 20); // Calls the first method
    // obj.sum(10.5f, 20.5f); // Calls the second method
    // obj.sum(10, 20, 30); // Calls the third method

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        overload obj = new overload();
        System.out.println("enter two numbers");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        obj.sum(a, b);
    }
}
