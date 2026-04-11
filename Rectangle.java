// Rectangle class
class Rectangle {
    int length;
    int breadth;

    // Constructor to initialize length and breadth
    Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }

    // Method to calculate and return area
    int Area() {
        return length * breadth;
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Create two rectangle objects
        Rectangle r1 = new Rectangle(4, 5);
        Rectangle r2 = new Rectangle(5, 8);

        // Print areas
        System.out.println("Area of Rectangle 1: " + r1.Area());
        System.out.println("Area of Rectangle 2: " + r2.Area());
    }
}
