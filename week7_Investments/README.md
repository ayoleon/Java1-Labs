# Investments Program

## Description
This program models a simple investment system where a user can manage **stocks** or **CDs (Certificates of Deposit)**.  
Users are prompted to enter their account number, choose an investment type, and input relevant data to calculate balances and returns.  
The program demonstrates object-oriented programming concepts, inheritance, conditional logic, and user input handling in Java.

## Key Concepts Demonstrated
- **Classes & Inheritance:** `Stocks` and `CDs` classes extend the `Investments` superclass.  
- **Methods:** Functions like `StockPositions()` and `CDPositions()` handle calculations and display information.  
- **Conditional Logic:** Determines interest rates for CDs based on investment duration.  
- **User Input:** Uses `Scanner` for interactive prompts.  
- **Numeric Formatting:** Displays monetary values with two decimal places using `DecimalFormat`.  
- **Object-Oriented Design:** Shows how subclasses can reuse and extend properties of a superclass.

## How to Run
This program was **developed, compiled, and tested in IntelliJ IDEA**.  

To run it in IntelliJ:  
1. Open the project or folder containing `Investments.java` in IntelliJ.  
2. Ensure `Investments.java` is set as the main class.  
3. Click the green **Run** button to compile and execute the program.  
4. Follow the prompts to enter your account number, select an investment type (Stocks or CDs), and input the required data.  
5. The program will calculate and display balances, costs, or returns based on your input.

## Example Run
**Stocks Example:**
```text
Enter Your Account Number: 12345
Account Number : 12345
Balance : 100000.00
Select: S -- stocks ; C -- CDs
S
Enter Symbol: A
Enter number of shares: 10
Enter current price: 50
Stock : A
Number of shares purchased: 10
Price per share: 50.00
Total cost : 500.00
New Balance : 99500.00
```
**CDs Example:**
```text
Enter Your Account Number: 67890
Account Number : 67890
Balance : 100000.00
Select: S -- stocks ; C -- CDs
C
Enter CD Amount: 10000
Enter number of days: 90
CD
Amount of 10000.00
Rate: 0.15
Total after maturity : 10150.00
```
---
## Files
- `Investments.java` – Main program file containing all classes (`Investments`, `Stocks`, `CDs`).  
