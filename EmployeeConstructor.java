class class Employee {

    String name;
    double salary;

    // Constructor using 'this' keyword
    Employee(String name, double salary) {
        this.name = name;       // refers to instance variable
        this.salary = salary;   // refers to instance variable
    }

    void display() {
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("----------------------");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        Employee e1 = new Employee("Amit", 50000);
        Employee e2 = new Employee("Neha", 60000);
        Employee e3 = new Employee("Ravi", 55000);

        e1.display();
        e2.display();
        e3.display();
    }
} {

    String name;
    double salary;

    // Constructor using 'this' keyword
    Employee(String name, double salary) {
        this.name = name;       // refers to instance variable
        this.salary = salary;   // refers to instance variable
    }

    void display() {
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("----------------------");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        Employee e1 = new Employee("Amit", 50000);
        Employee e2 = new Employee("Neha", 60000);
        Employee e3 = new Employee("Ravi", 55000);

        e1.display();
        e2.display();
        e3.display();
    }
}
