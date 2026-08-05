final class College {
    void collegeName() {
        System.out.println("Clg : Symbiosis Institute of Technology");
    }
}

class Person {
    final int id = 29;

    final void displayId() {
        System.out.println("ID : " + id);
    }
}

class Student extends Person {
    String name;

    Student(String name) {
        this.name = name;
    }

    void displayStudent() {
        System.out.println("Name : " + name);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student("Akshit");

        s.displayStudent();
        s.displayId();

        College c = new College();
        c.collegeName();
    }
}
