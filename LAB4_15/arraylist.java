import java.util.ArrayList;
class arraylist{
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("apple");
        fruits.add("banana");
        fruits.add("mango");

        System.out.println("fruits list = " + fruits);
        fruits.remove("banana");
        System.out.println("fruits list = " + fruits);


    }
}