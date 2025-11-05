class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayBasicInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class Employee extends Person {
    private int empId;
    private double baseSalary;

    public Employee(String name, int age, int empId, double baseSalary) {
        super(name, age);
        this.empId = empId;
        this.baseSalary = baseSalary;
    }

    public double calculateAnnualSalary() {
        return baseSalary * 12;
    }

    public void displayEmployeeInfo() {
        displayBasicInfo();
        System.out.println("Employee ID: " + empId + ", Monthly Salary: " + baseSalary);
        System.out.println("Annual Salary: " + calculateAnnualSalary());
    }
}

class Manager extends Employee {
    private int teamSize;

    public Manager(String name, int age, int empId, double baseSalary, int teamSize) {
        super(name, age, empId, baseSalary);
        this.teamSize = teamSize;
    }

    public double calculateBonus() {
        return calculateAnnualSalary() * 0.1 + teamSize * 5000;
    }

    public void displayManagerInfo() {
        displayEmployeeInfo();
        System.out.println("Team Size: " + teamSize);
        System.out.println("Bonus: " + calculateBonus());
        System.out.println("Total Annual Compensation: " + (calculateAnnualSalary() + calculateBonus()));
        System.out.println("----------------------------------");
    }
}

class Developer extends Employee {
    private int projects;

    public Developer(String name, int age, int empId, double baseSalary, int projects) {
        super(name, age, empId, baseSalary);
        this.projects = projects;
    }

    public double calculateProjectBonus() {
        return projects * 8000;
    }

    public void displayDeveloperInfo() {
        displayEmployeeInfo();
        System.out.println("Projects: " + projects);
        System.out.println("Project Bonus: " + calculateProjectBonus());
        System.out.println("Total Annual Compensation: " + (calculateAnnualSalary() + calculateProjectBonus()));
        System.out.println("----------------------------------");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Manager m = new Manager("Priya", 35, 201, 90000, 8);
        Developer d = new Developer("Arun", 28, 202, 70000, 5);

        m.displayManagerInfo();
        d.displayDeveloperInfo();
    }
}

