class Calculator {

    // Method 1: add two integers
    int add(int a, int b) {
        return a + b;
    }

    // Method 2: add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method 3: add two doubles
    double add(double a, double b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {

        Calculator calc = new Calculator();

        // Calls add(int, int)
        System.out.println("Sum of 2 ints: " + calc.add(10, 20));

        // Calls add(int, int, int)
        System.out.println("Sum of 3 ints: " + calc.add(10, 20, 30));

        // Calls add(double, double)
        System.out.println("Sum of 2 doubles: " + calc.add(10.5, 20.3));

        // You can also see type promotion in action:
        System.out.println("Mixed args: " + calc.add(10, 20.5)); // calls add(double, double)
    }
}
