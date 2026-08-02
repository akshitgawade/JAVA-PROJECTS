class Student{
    String name;
    int age;

    Student(){
        name = "John Doe";
        age = 20;
    }
    Student(String n, int a){
        this.name = n;
        this.age = a;
    }
    Student(Student obj2)
    {
        this.name = obj2.name;
        this.age = obj2.age;
    }

    void display(){
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
public class Main{
    public static void main(String[] args) {
        Student student1 = new Student("Alice", 20);
        student1.display();
        Student student2 = new Student(student1);
        student2.display();
        Student student3 = new Student();
        student3.display();
    }
}

