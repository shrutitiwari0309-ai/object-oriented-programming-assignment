import java.util.Scanner;

class CARRENTAL {
    int CarId;
    String CarType;
    float Rent;

    // Method to accept CarId and CarType
    void GetCar(int id, String type) {
        CarId = id;
        CarType = type;
    }

    // Method to calculate and return rent based on CarType
    float GetRent() {
        if (CarType.equalsIgnoreCase("Small Car")) {
            Rent = 1000;
        } else if (CarType.equalsIgnoreCase("Van")) {
            Rent = 800;
        } else if (CarType.equalsIgnoreCase("SUV")) {
            Rent = 2500;
        } else {
            Rent = 0;
            System.out.println("Invalid Car Type");
        }
        return Rent;
    }

    // Method to display car details
    void ShowCar() {
        System.out.println("Car ID: " + CarId);
        System.out.println("Car Type: " + CarType);
        System.out.println("Rent: " + Rent);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        CARRENTAL car = new CARRENTAL();

        // Input from user
        System.out.print("Enter Car ID: ");
        int id = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter Car Type (Small Car / Van / SUV): ");
        String type = sc.nextLine();

        // Set car details
        car.GetCar(id, type);

        // Calculate rent
        car.GetRent();

        // Display details
        System.out.println("\nCar Details:");
        car.ShowCar();

        sc.close();
    }
}
