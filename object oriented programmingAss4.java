import java.util.Scanner;

class MessageFormatter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String firstName, lastName, fullName;

        // Accept first name
        System.out.print("Enter first name: ");
        firstName = sc.nextLine();

        // Accept last name
        System.out.print("Enter last name: ");
        lastName = sc.nextLine();

        // Concatenate names with space
        fullName = firstName + " " + lastName;

        // Display full name
        System.out.println("Full Name: " + fullName);

        sc.close();
    }
}