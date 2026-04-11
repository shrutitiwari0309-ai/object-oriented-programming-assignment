// Abstract class
abstract class Shape {

    // Abstract method
    abstract double calculate_area();

    // Concrete method
    void display_info() {
        System.out.println("This is a shape.");
    }
}

// Circle subclass
class Circle extends Shape {
    double radius;

    Circle(double r) {
        radius = r;
    }

    // Implement abstract method
    double calculate_area() {
        return Math.PI * radius * radius;
    }
}

// Rectangle subclass
class Rectangle extends Shape {
    double length, breadth;

    Rectangle(double l, double b) {
        length = l;
        breadth = b;
    }

    // Implement abstract method
    double calculate_area() {
        return length * breadth;
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        // Shape s = new Shape(); ❌ ERROR: Cannot instantiate abstract class

        // Create subclass objects
        Circle c = new Circle(3);
        Rectangle r = new Rectangle(4, 5);

        // Call methods
        c.display_info();
        System.out.println("Circle Area: " + c.calculate_area());

        System.out.println();

        r.display_info();
        System.out.println("Rectangle Area: " + r.calculate_area());
    }
}
