package FSD_Practice;
class Person {
    String firstName;
    String lastName;

    Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    String getFirstName() {
        return firstName;
    }

    String getLastName() {
        return lastName;
    }
}

class Employe extends Person {
    String jobTitle;
    int employeeId;

    Employe(String firstName, String lastName, String jobTitle, int employeeId) {
        super(firstName, lastName);
        this.jobTitle = jobTitle;
        this.employeeId = employeeId;
    }

    @Override
    String getLastName() {
        return lastName + " (" + jobTitle + ")";
    }

    int getEmployeeIds() {
        return employeeId;
    }
}

public class pers {
    public static void main(String[] args) {
        Employe employee = new Employe("John", "Doe", "Engineer", 12345);
        System.out.println("Employee Full Name: " + employee.getFirstName() + " " + employee.getLastName());
        System.out.println("Employee ID: " + employee.getEmployeeIds());
        
    }
}