//Leon Lam
// WEEK 13 JAVA LAB
// ROUGH DRAFT

import java.util.Scanner;
import java.text.DecimalFormat;

public class Main { //main class
    static Scanner input = new Scanner(System.in);  //GLOBAL VARIABLE, DOES NOT NEED TO BE DECLARED IN EVERY METHOD

    Employee empData() {
        Employee employee1 = new Employee();
        System.out.println("Enter Employee ID: ");
        employee1.EmployeeID = input.nextLine();
        System.out.println("Enter Last Name: ");
        employee1.name = input.nextLine();
        System.out.println("Enter Phone Number: ");
        employee1.phonenum = input.nextLine();
        System.out.println("Enter Hours Worked: ");

        while (!input.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a number of hours worked.");
            input.next(); // discard invalid input
        }

        employee1.hours = input.nextDouble();
        System.out.println("Enter Hourly Wage: ");
        while (!input.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a number for wage.");
            input.next(); // discard invalid input
        }
        employee1.hourlypay = input.nextDouble();

        return employee1;
    }
    void Run(){
        String choice;

        do {
            //loops through to ask and print values, does not store values for each employee (NEEDS ARRAY OF CLASS OBJECTS)
            Employee emp1 = empData(); //DIRECT DECLARATION AND INTSATIATION -- method returns employee object
            emp1.empDisplay(emp1);
            emp1.empSalary(emp1);

            input.nextLine(); // consume the leftover newline from previous input
            System.out.print("Would you like to enter another employee? (yes/no): ");
            choice = input.nextLine().trim().toLowerCase();  //SCANNING STRING and REMOVES WHAT'S IN BUFFER. -- 'toLowerCase'
            while (!choice.equals("yes") && !choice.equals("no")) {
                System.out.println("Invalid input. Please type 'yes' or 'no'.");
                System.out.print("Would you like to enter another employee? (yes/no): ");
                choice = input.nextLine().trim().toLowerCase();
            }
        } while (choice.equals("yes")); //  (.equals) to check if string is equal...

        System.out.println("All employee data entered. Program ended.");
    }

    public static void main(String[] args) {

        Main m1 = new Main();
        m1.Run();

    }
}

class Employee {
    static DecimalFormat df = new DecimalFormat("0.00");
    String EmployeeID, name, phonenum;
    double hours, hourlypay;

    void empDisplay(Employee emp2){
        System.out.println("ID NUM: " + emp2.EmployeeID);
        System.out.println("LAST NAME: " + emp2.name);
        System.out.println("TELEPHONE # : " + emp2.phonenum);
        System.out.println("HOURS WORKED: " + df.format(emp2.hours));
    System.out.println("HOURLY WAGE : $" + df.format(emp2.hourlypay));
}
    void empSalary(Employee emp){
        double salary = emp.hours * emp.hourlypay;
        if (salary < 600){
            salary *= 1.03;
        }
        else {
            salary *= 1.01;
        }
        System.out.println("Salary is $" + df.format(salary));
    }

}