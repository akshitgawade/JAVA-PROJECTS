interface Print {
    void print();
}

class Student implements Print {
    String name;
    int prn;

    Student(String name, int prn) {
        this.name = name;
        this.prn = prn;
    }

    public void print() {
        System.out.println("Name of Student: " + name);
        System.out.println("PRN: " + prn);
    }
}

class Employee implements Print {
    String name;
    int empId;

    Employee(String name, int empId) {
        this.name = name;
        this.empId = empId;
    }

    public void print() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + empId);
    }
}

public class Exmp1 {
    public static void main(String[] args) {
        Print s = new Student("Akshit", 29);
        Print e = new Employee("Agam", 25);

        s.print();
        System.out.println();
        e.print();
    }
}