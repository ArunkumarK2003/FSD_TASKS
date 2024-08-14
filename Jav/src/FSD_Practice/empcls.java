package FSD_Practice;
class Employee {
    void work() {
        System.out.println("Employee working");
    }

    double getSalary() {
        return 0.0;
    }
}

class HRManager extends Employee {
    @Override
    void work() {
        System.out.println("HR Manager working on recruitment");
    }

    void addEmployee() {
        System.out.println("Adding a new employee");
    }
}

public class empcls {
    public static void main(String[] args) {
        HRManager hrManager = new HRManager();
        hrManager.work();         // Outputs: HR Manager working on recruitment
        hrManager.addEmployee();  // Outputs: Adding a new employee
    }
}
