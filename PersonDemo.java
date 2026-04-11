class Person {
    void role() {
        System.out.println("Role: I am a Person");
    }
}

// Employee extends Person
class Employee extends Person {
    void role() {
        System.out.println("Role: I am an Employee");
    }
}

// Manager extends Employee (Multilevel Inheritance)
class Manager extends Employee {
    void role() {
        System.out.println("Role: I am a Manager");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        Person p1 = new Person();
        Person p2 = new Employee();
        Person p3 = new Manager();

        p1.role();
        p2.role();
        p3.role();
    }
}
