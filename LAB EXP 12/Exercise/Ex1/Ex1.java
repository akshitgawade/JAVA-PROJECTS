package Exercise.Ex1;

import Exercise.Ex1.student.Student;
import Exercise.Ex1.faculty.Faculty;

public class Ex1 {
    public static void main(String[] args) {
        Student s = new Student(101, "Akshit", "Computer Science and Engineering");
        Faculty f = new Faculty(201, "Dr. Dutta", "CSE");

        s.display();
        f.display();
    }
}
