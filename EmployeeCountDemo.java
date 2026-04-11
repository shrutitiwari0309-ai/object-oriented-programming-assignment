class Employee {

    String name;
    int id;

    // static variable to track total employees
    static int employeeCount = 0;

    // Constructor
    Employee(String name, int id) {
        this.name = name;
        this.id = id;

        // increase count when object is created
        employeeCount++;
    }

    // static method to display employee count
    static void displayCount() {
        System.out.println("Total Employees: " + employeeCount);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        Employee e1 = new Employee("Amit", 101);
        Employee e2 = new Employee("Neha", 102);
        Employee e3 = new Employee("Ravi", 103);
        Employee e4 = new Employee("Sara", 104);

        // Display total employees using static method
        Employee.displayCount();
    }
}
