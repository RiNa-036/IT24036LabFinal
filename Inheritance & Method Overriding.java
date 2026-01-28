class Employee {
    public double calculateSalary() {
        return 0;
    }
}

class FullTimeEmployee extends Employee {
    @Override
    public double calculateSalary() {
        return 50000;
    }
}

class PartTimeEmployee extends Employee {
    @Override
    public double calculateSalary() {
        return 20000;
    }
}

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new FullTimeEmployee();
        Employee emp2 = new PartTimeEmployee();

        System.out.println("Full Time Employee Salary: " + emp1.calculateSalary());
        System.out.println("Part Time Employee Salary: " + emp2.calculateSalary());
    }
}
