interface Animal {
    void sound();
}

class Owl implements Animal {
    public void sound() {
        System.out.println("Owl hoots.");
    }
}

public class Main {
    public static void main (String[] args) {
        Animal a = new Owl();
        a.sound();
    }
}