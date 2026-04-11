class Shape {
    void display() {
        System.out.println("This is a general shape.");
    }
}

// Circle inherits Shape
class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    void area() {
        double result = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + result);
    }
}

// Rectangle inherits Shape
class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    void area() {
        double result = length * width;
        System.out.println("Area of Rectangle: " + result);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        Circle c = new Circle(5);
        c.display();   // inherited method
        c.area();

        System.out.println();

        Rectangle r = new Rectangle(10, 5);
        r.display();   // inherited method
        r.area();
    }
}
