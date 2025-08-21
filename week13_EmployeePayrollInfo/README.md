# WEEK 13 Java Lab – Employee Payroll Program

## Description
This program demonstrates **object-oriented programming** in Java by modeling basic employee payroll information.  

- The program prompts the user to enter employee details (ID, last name, phone number, hours worked, hourly wage).  
- Employee data is stored in an `Employee` object.  
- The program displays employee information and calculates salary with conditional adjustments:
  - Employees earning under $600 receive a **3% raise**.  
  - Employees earning $600 or more receive a **1% raise**.  
- Input validation ensures only valid numbers are accepted for hours worked and hourly wage.  
- Users may enter multiple employees until they choose to stop.  

## Key Concepts Demonstrated
- **Classes & Objects** – `Employee` class stores employee data, with methods for displaying information and calculating salary.  
- **Methods** – breaking functionality into smaller reusable units (`empDisplay()`, `empSalary()`, `empData()`, `Run()`).  
- **Loops** – `do-while` loop allows repeated entry of employee data.  
- **Input Validation** – checks user input for numeric values before accepting them.  
- **String Handling** – `.equals()` for comparing user responses, `.trim().toLowerCase()` for consistent validation.  
- **Formatting** – salary and numerical values are displayed with two decimal places using `DecimalFormat`.

  
## Example Run
```text
Enter Employee ID: 12345
Enter Last Name: Smith
Enter Phone Number: 555-1234
Enter Hours Worked: 40
Enter Hourly Wage: 15
ID NUM: 12345
LAST NAME: Smith
TELEPHONE #: 555-1234
HOURS WORKED: 40.00
HOURLY WAGE : $15.00
Salary is $606.00
Would you like to enter another employee? (yes/no): no
All employee data entered. Program ended.
```

## How to Compile and Run
This program was developed and tested in **IntelliJ IDEA**. It should also work in other IDEs or from the command line.
