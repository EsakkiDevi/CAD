abstract class Employee {
    private String name;
    private int id;
    private double baseSalary;

    public Employee(String name, int id, double baseSalary) {
        this.name = name;
        this.id = id;
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    abstract double calculateBonus();
    abstract String getRole();

    public void showDetails() {
        System.out.println("ID: " + id + ", Name: " + name + ", Role: " + getRole());
        System.out.println("Base Salary: " + baseSalary);
        System.out.println("Bonus: " + calculateBonus());
        System.out.println("Total Salary: " + (baseSalary + calculateBonus()));
        System.out.println("---------------------------");
    }
}

class Manager extends Employee {
    private int teamSize;

    public Manager(String name, int id, double baseSalary, int teamSize) {
        super(name, id, baseSalary);
        this.teamSize = teamSize;
    }

    double calculateBonus() {
        return getBaseSalary() * 0.2 + teamSize * 1000;
    }

    String getRole() {
        return "Manager";
    }
}

class Developer extends Employee {
    private int projects;

    public Developer(String name, int id, double baseSalary, int projects) {
        super(name, id, baseSalary);
        this.projects = projects;
    }

    double calculateBonus() {
        return getBaseSalary() * 0.15 + projects * 500;
    }

    String getRole() {
        return "Developer";
    }
}

class Tester extends Employee {
    private int bugsFound;

    public Tester(String name, int id, double baseSalary, int bugsFound) {
        super(name, id, baseSalary);
        this.bugsFound = bugsFound;
    }

    double calculateBonus() {
        return getBaseSalary() * 0.1 + bugsFound * 50;
    }

    String getRole() {
        return "Tester";
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Employee e1 = new Manager("Priya", 101, 80000, 5);
        Employee e2 = new Developer("Arun", 102, 60000, 4);
        Employee e3 = new Tester("Vani", 103, 50000, 120);

        Employee[] employees = {e1, e2, e3};

        for (Employee e : employees) {
            e.showDetails();
        }
    }
}

