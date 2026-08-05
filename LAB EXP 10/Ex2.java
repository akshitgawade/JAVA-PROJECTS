abstract class FoodOrder {

    double amount;

    FoodOrder(double amount) {
        this.amount = amount;
    }

    // Abstract method
    abstract void calculateBill();
}

class DineInOrder extends FoodOrder {

    DineInOrder(double amount) {
        super(amount);
    }

    void calculateBill() {
        double total = amount + (amount * 0.10); // 10% service charge
        System.out.println("Dine-In Bill: Rs" + total);
    }
}

class TakeAwayOrder extends FoodOrder {

    TakeAwayOrder(double amount) {
        super(amount);
    }

    void calculateBill() {
        double total = amount + 30; // ₹30 packing charge
        System.out.println("Take Away Bill: Rs" + total);
    }
}

public class Ex2 {
    public static void main(String[] args) {

        FoodOrder order1 = new DineInOrder(200);
        FoodOrder order2 = new TakeAwayOrder(300);

        order1.calculateBill();
        order2.calculateBill();
    }
}