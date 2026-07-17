class thiskeyword{
    int a;

    thiskeyword(int a) {
        this.a = a;
    }

    void display() {
        System.out.println("Value of a: " + a);
    }

    public static void main(String[] args) {
        thiskeyword obj = new thiskeyword(001);
        obj.display();
    }
}