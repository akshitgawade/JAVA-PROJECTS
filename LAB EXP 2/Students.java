class Students {
    int id;
    String name;

    Students() {
        this.id = 0;
        this.name = "Unknown";
    }

    Students(int id, String name) {
        this.id = id;
        this.name = name;
    }

    Students(Students other) {
        this.id = other.id;
        this.name = other.name;
    }

    void display() {
        System.out.println("Student ID: " + id + ", Name: " + name);
    }

    public static void main(String[] args) {
        Students s1 = new Students();
        Students s2 = new Students(2, "Alice");
        Students s3 = new Students(s2);

        s1.display();
        s2.display();
        s3.display();
    }
}