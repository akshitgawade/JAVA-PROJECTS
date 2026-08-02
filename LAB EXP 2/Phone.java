public class Phone {
    String brand;
    String model;
    double price;

    // Default constructor
    Phone() {
        brand = "Samsung";
        model = "Galaxy A54";
        price = 28999;
    }

    // Parameterized constructor
    Phone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Copy constructor
    Phone(Phone p) {
        this.brand = p.brand;
        this.model = p.model;
        this.price = p.price;
    }

    void display() {
        System.out.println("Brand: " + brand + ", Model: " + model + ", Price: Rs." + price);
    }

    public static void main(String[] args) {
        Phone phone1 = new Phone();
        Phone phone2 = new Phone("Apple", "iPhone 15", 69999);
        Phone phone3 = new Phone(phone2);

        System.out.println("Mobile Phone Inventory System");
        phone1.display();
        phone2.display();
        phone3.display();
    }
}
