 class Students {
    int id;
    String name;

    public static void main(String[] args) {
        Students s1 = new Students();
        s1.id = 1;
        s1.name = "John Doe";
        Students s2 = new Students();
        s2.id =2;
        s2.name = "Alice";
        System.out.println("Student ID: " + s1.id + ", Name: " + s1.name);
        System.out.println("Student ID: " + s2.id + ", Name: " + s2.name);
    
    }
}