import java.util.Scanner;

class Resort {
    int RNo;
    String Name;
    float Charges;
    int Days;

    // Function to calculate and return Amount
    float Compute() {
        float amount = Days * Charges;

        if (amount > 11000) {
            amount = (float)(1.02 * amount); // add 2% extra
        }

        return amount;
    }

    // Function to accept input
    void Getinfo() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Room Number: ");
        RNo = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter Customer Name: ");
        Name = sc.nextLine();

        System.out.print("Enter Charges per Day: ");
        Charges = sc.nextFloat();

        System.out.print("Enter Number of Days: ");
        Days = sc.nextInt();
    }

    // Function to display details
    void DispInfo() {
        float amount = Compute();

        System.out.println("\n--- Resort Details ---");
        System.out.println("Room Number: " + RNo);
        System.out.println("Customer Name: " + Name);
        System.out.println("Charges per Day: " + Charges);
        System.out.println("Number of Days: " + Days);
        System.out.println("Total Amount: " + amount);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Resort r = new Resort();

        r.Getinfo();
        r.DispInfo();
    }
}
