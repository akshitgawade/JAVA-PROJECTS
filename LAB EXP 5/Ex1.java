
import java.util.ArrayList;

public class Ex1 {
    public static void main (String[] args) {
        ArrayList<String> arr = new ArrayList<>();
    
        arr.add("Nap");
        arr.add("Build a project");
        arr.add("Study");
        arr.add("Practice problems");
        arr.add("Coding");
        arr.add("Review notes");
        arr.add("Play a sport");
        String temp = arr.get(1);
        arr.set(1, arr.get(3));
        arr.set(3, temp);

    
        StringBuffer str = new StringBuffer();

        for (int i = 0; i < arr.size(); i++) {
            str.append((i + 1) + "." + arr.get(i) + "\n");
        }

        System.out.println("------ TO DO List ------");
        System.out.println(str);
    }
}