
class BankAccount {
    final int accountNumber = 29;
    String accountHolder;
    double balance;

    BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    void display() {
        System.out.println("Account ID : " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolder);
        System.out.println("Balance: " + balance);
    }
}

public class Ex1 {
    public static void main(String[] args) {
        BankAccount b = new BankAccount("Akshit", 10500);
        b.display();
    }
}