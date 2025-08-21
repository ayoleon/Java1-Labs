# Java 1 Labs Repository

## Overview
This repository contains some of my Java 1 lab projects completed during my first Java programming course.  
The labs focus on **basic Java programming concepts**, including:

- Variables, data types, and arithmetic operations  
- Arrays and array manipulation  
- Methods (static and non-static)  
- Loops and conditionals  
- User input handling with `Scanner`  
- Object-oriented programming: classes, objects, constructors  
- Input validation and basic error handling  
- Formatting output with `DecimalFormat`

---
-  ## Key Skills Demonstrated Across Labs
- Working with **arrays** and storing user input  
- Writing **methods** with parameters and return values  
- Handling **user input and buffer issues** with `Scanner`  
- Using **loops** and **conditional statements** effectively  
- Applying **object-oriented principles**: classes, objects, constructors  
- Formatting numeric output using `DecimalFormat`  
- Implementing **menu-driven programs**  

---

## Labs Included

### week12_RESTAURANT - Restaurant Ordering System (Predefined Menu Version)
- **Description:** Allows users to order appetizers, main meals, desserts, and beverages from predefined arrays. Calculates subtotal and final total including optional tips.  
- **Concepts:** Arrays, switch statements, static vs non-static methods, object instantiation, loops, `DecimalFormat`.  
- **Special Notes:** Demonstrates multiple `RESTAURANT` objects for multiple bills.  
- **File:** `RESTAURANT.java`  

### week12_RESTAURANT_2 - Restaurant Ordering System (User-Defined Menu Version)
- **Description:** Lets the user enter their own menu items and prices for beverages, appetizers, main meals, and desserts. Totals are calculated based on user input.  
- **Concepts:** Arrays, loops, methods returning totals, `Scanner` buffer handling, static methods.  
- **Special Notes:** Shows how to dynamically store user input in arrays rather than using fixed menus.  
- **File:** `RESTAURANT.java` (or same `RESTAURANT.java` updated)  

### week11_BasicLibrary - Library Management System
- **Description:** Simple library program allowing the user to add books, print book information, and copy books into a separate array.  
- **Concepts:** Arrays for structured data storage, object-oriented design, menu-driven program, input handling with `Scanner`, do-while loops.  
- **Special Notes:** Demonstrates CRUD-like operations (Create, Read, Copy) and multiple loops for menu interaction.  
- **File:** `Library.java`

### week13_EmployeePayrollInfo – Employee Payroll Program
- **Description:** Models basic employee payroll using object-oriented programming. Users enter employee details, and the program calculates salaries with conditional raises. Multiple employees can be entered until the user chooses to stop.  
- **Concepts:** Classes & objects (`Employee` class), methods (`empDisplay()`, `empSalary()`, `empData()`, `Run()`), loops (do-while), input validation, string handling (`.equals()`, `.trim().toLowerCase()`), numeric formatting with `DecimalFormat`.  
- **Special Notes:** Demonstrates conditional logic for raises, multiple object handling, and formatted output for salaries.  
- **File:** `Main.java`  

### week7_Investments - Investments Program
- **Description:** This program models a simple investment system where a user can manage **stocks** or **CDs (Certificates of Deposit)**. Users enter account details, choose an investment type, and input relevant data to calculate balances and returns.  
- **Concepts:**  
  - Classes & inheritance (`Stocks` and `CDs` extend `Investments`)  
  - Methods for calculations and displaying information (`StockPositions()`, `CDPositions()`)  
  - Conditional logic for rate calculations and menu selection  
  - User input handling with `Scanner`  
  - Numeric formatting with `DecimalFormat`  
- **Special Notes:** Demonstrates inheritance, user-driven menu selection, and financial calculations with formatted output.  
- **File:** `Investments.java`  
---

## How to Run
All programs were **developed, compiled, and tested in IntelliJ IDEA**.  

To run any lab:
1. Open the project in IntelliJ.  
2. Ensure the desired `.java` file is set as the main class.  
3. Click the green **Run** button.  
4. Follow the on-screen prompts for input.  

---
