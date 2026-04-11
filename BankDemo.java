class Bank {

    // final variable (cannot be changed)
    final double interestRate = 6.5;

    // method to calculate interest
    void calculateInterest(double amount) {
        double interest = (amount * interestRate) / 100;
        System.out.println("Amount: " + amount);
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("Interest: " + interest);
        System.out.println("----------------------");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        Bank customer1 = new Bank();
        Bank customer2 = new Bank();
        Bank customer3 = new Bank();

        customer1.calculateInterest(10000);
        customer2.calculateInterest(25000);
        customer3.calculateInterest(50000);
    }
}
