
import java.util.ArrayList;

public class Ex2 {
    public static void main(String[] args) {
        ArrayList<String> courses = new ArrayList<>();

        courses.add("Computer Science");
        courses.add("Artificial Intelligence");
        courses.add("Data Science");
        courses.add("Cyber Security");

        courses.remove("Java");

        StringBuffer sb = new StringBuffer();

        sb.append("Registered Courses\n");
        sb.append("------------------\n");

        for (int i = 0; i < courses.size(); i++) {
            sb.append((i + 1) + ". " + courses.get(i) + "\n");
        }

        System.out.println(sb);
    }
}