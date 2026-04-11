abstract class Employee {
    String name;
    int id;
    double salary;

    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    abstract void calculateBonus();
}

// Manager class
class Manager extends Employee {

    Manager(String name, int id, double salary) {
        super(name, id, salary);
    }

    void calculateBonus() {
        double bonus = 0.20 * salary;
        System.out.println("Manager: " + name + " | Bonus: " + bonus);
    }
}

// Developer class
class Developer extends Employee {
    double projectIncentive;

    Developer(String name, int id, double salary, double projectIncentive) {
        super(name, id, salary);
        this.projectIncentive = projectIncentive;
    }

    void calculateBonus() {
        double bonus = (0.10 * salary) + projectIncentive;
        System.out.println("Developer: " + name + " | Bonus: " + bonus);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        Employee e1 = new Manager("Amit", 101, 50000);
        Employee e2 = new Developer("Neha", 102, 60000, 5000);

        e1.calculateBonus();
        e2.calculateBonus();
    }
}
