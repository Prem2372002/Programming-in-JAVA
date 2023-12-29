
class Employee {
    protected String name;
    protected int employeeID;

    public Employee(String name, int employeeID) {
        this.name = name;
        this.employeeID = employeeID;
    }

   
    public double calculateSalary() {
        return 50000.0; 
    }
}

class Manager extends Employee {
    private double bonusPercentage;

    public Manager(String name, int employeeID, double bonusPercentage) {
        super(name, employeeID);
        this.bonusPercentage = bonusPercentage;
    }

    @Override
    public double calculateSalary() {
        double basicSalary = super.calculateSalary();
        double bonusAmount = basicSalary * (bonusPercentage / 100.0);
        return basicSalary + bonusAmount;
    }
}


class Developer extends Employee {
    private String programmingLanguage;

    public Developer(String name, int employeeID, String programmingLanguage) {
        super(name, employeeID);
        this.programmingLanguage = programmingLanguage;
    }


    @Override
    public double calculateSalary() {
        double basicSalary = super.calculateSalary();
        double allowance = 2000.0; // Extra allowance for developers
        return basicSalary + allowance;
    }
}


public class EmployeeHierarchyDemo {
    public static void main(String[] args) {

        Manager manager = new Manager("John Doe", 101, 15.0);
        Developer developer = new Developer("Alice Smith", 102, "Java");

        System.out.println("Manager Details:");
        System.out.println("Name: " + manager.name);
        System.out.println("Employee ID: " + manager.employeeID);
        System.out.println("Calculated Salary: $" + manager.calculateSalary());
        System.out.println();

        System.out.println("Developer Details:");
        System.out.println("Name: " + developer.name);
        System.out.println("Employee ID: " + developer.employeeID);
        System.out.println("Calculated Salary: $" + developer.calculateSalary());
    }
}
