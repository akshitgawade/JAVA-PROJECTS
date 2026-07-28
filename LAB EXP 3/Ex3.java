class Vehicle {
    int speed() {
        return 100;
    }
}

class Car extends Vehicle {
    int speed() {
        return 200;
    }
}

class Bike extends Vehicle {
    int speed() {
        return 300;
    }
}

public class Ex3 {
    public static void main (String[] args) {
        Vehicle v = new Vehicle();
        Car c = new Car();
        Bike b = new Bike();
        
        System.out.println("The speed for the vehicle is : " + v.speed() + " km\\hr");
        System.out.println("The speed for the vehicle is : " + c.speed() + " km\\hr");
        System.out.println("The speed for the vehicle is : " + b.speed() + " km\\hr");
    }
}