class Outer1 {
    class Inner1{
        void display(){
            System.out.println("This is an inner class.");
        }
    }
    
}

public static void main(String[] args) {
        Outer1.Inner1 obj = new Outer1().new Inner1();
        obj.display();
}

