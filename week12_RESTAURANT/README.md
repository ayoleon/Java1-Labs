# Restaurant Ordering System (Version with Predefined Menus/Arrays) 

## Overview  
This program simulates a restaurant ordering system using **Java classes, arrays, and methods**.  
It allows the user to order:  
- A **beverage** (soft drink or spirit, handled by the `Beverages` class)  
- An **appetizer**  
- A **main meal**  
- A **dessert**  

After the selections, the program calculates a **bill** with an option to add a tip.  

---

## Features  
- Uses **arrays** to store menu items and prices.  
- Demonstrates **switch statements** and **loops** for input validation.  
- Utilizes **static methods and variables** in the `Beverages` class.  
- Instantiates multiple `RESTAURANT` objects in the `main` method.  
- Formats currency output with `DecimalFormat`.  

## Key Concepts Demonstrated  
- **Classes and Objects** – `RESTAURANT` objects represent individual bills.  
- **Static vs Non-Static Methods** – `Beverages` uses static methods so they can be called without instantiation.  
- **Arrays** – Menu items and prices are stored in arrays.  
- **Input Validation** – Loops ensure only valid selections are accepted.  
- **Switch Statements** – Handle return values based on user choices.  
- **Decimal Formatting** – Ensures prices display with two decimal places.
---

## How It Works  
1. The program creates an array of **five `RESTAURANT` objects**, simulating five separate customer bills.  
2. For each bill, the user is prompted to select:  
   - Beverage (Soft Drink or Spirit → handled by `Beverages` class)  
   - Appetizer  
   - Main Meal  
   - Dessert  
3. After the choices, the program calculates a **subtotal**.  
4. The user is asked if they want to leave a **tip**.  
5. The program displays the **final total**, properly formatted.  

## Example Run 
```text
--- Welcome to Restaurant Order #1 ---
Would you like a (1) Soft Drink or (2) Spirit?
1
Choose a soft drink:
1. Coke - $2.50
2. Diet Coke - $2.50
3. Sprite - $2.25
4. Dr. Pepper - $2.75
2
Choose an appetizer:
1. Shrimp Cocktail - $12.99
2. Clam Chowder - $7.50
3. Wings - $18.99
4. Salad - $17.99
1
Choose a main meal:
1. Ribeye - $89.99
2. Lobster - $90.00
3. Salmon - $32.99
4. Chicken - $26.99
3
Choose a dessert:
1. Crème Brulee - $19.99
2. Cheese Cake - $12.99
3. Sorbet - $12.99
4. Souffle - $16.99
2
Your subtotal is: $66.48
Would you like to leave a tip?
Enter (Y) for yes or (N) for no:
Y
Enter tip amount:
10
Your final total is: $76.48
```
---
## Files  
- **RESTAURANT.java**  
  - Main class that handles appetizers, main meals, desserts, billing, and overall flow.  

- **Beverages class** (inside the same file for this lab)  
  - Contains static methods for choosing soft drinks and spirits.  
---

  ## How to Run  
This program was **developed, compiled, and tested in IntelliJ IDEA**.  

To run it in IntelliJ:  
1. Open the project in IntelliJ.  
2. Make sure the file `RESTAURANT.java` is set as the main class.  
3. Click the green **Run** button to compile and execute the program.  
4. Follow the prompts to order food, beverages, and calculate the bill.  
