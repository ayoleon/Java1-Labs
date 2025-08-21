# Restaurant Ordering System (User-Defined Menu Version)  

## Overview  
This version of the restaurant ordering program allows the **user** to create their own menu by entering names and prices for:  
- Beverages (Soft Drinks or Spirits)  
- Appetizers  
- Main Meals  
- Desserts  

Instead of selecting from a **predefined list of items**, the user directly enters each menu item and its price. The program then calculates totals and generates a final bill.  

---

## Features  
- **User-defined menu items:** Prompts the user to input both names and prices for each category.  
- **Arrays for storage:** Stores entered items and prices in arrays.  
- **Running totals:** Each method (`Appetizers()`, `MainMeal()`, `Desserts()`, `SoftDrinks()`, `Spirits()`) calculates the total of all items entered.  
- **Buffer handling:** Uses `input.nextLine()` after numeric input to avoid Scanner buffer issues.  
- **Bill calculation:** Displays subtotal, asks for optional tip, and outputs final total.  
- **Multiple bills:** Supports up to **five separate restaurant orders** through an array of `RESTAURANT` objects.  

---

## Files  
- **RESTAURANT.java**  
  - Handles appetizers, main meals, desserts, billing, and overall flow.  

- **Beverages class** (inside the same file for this lab)  
  - Provides static methods for entering soft drinks and spirits.  

---

## How It Works  
1. The program prompts the user for each **menu item name** and its **price**.  
2. All entered items are stored in arrays (`String[] items` and `double[] prices`).  
3. Each category method (Appetizers, MainMeal, Desserts, Beverages) returns the **sum of all prices entered**.  
4. The program calculates the **subtotal** and asks if the user wants to leave a **tip**.  
5. Displays the **final total**, formatted to two decimal places.  

---

## Example Run  
```text
--- Welcome to Restaurant Order #1 ---
Would you like a (1) Soft Drink or (2) Spirit?
1
Enter the name of Soft Drink: Coke
Enter the price of Coke: 2.50
Enter the name of Soft Drink: Sprite
Enter the price of Sprite: 2.25
Enter the name of Soft Drink: Dr. Pepper
Enter the price of Dr. Pepper: 2.75
Enter the name of Soft Drink: Fanta
Enter the price of Fanta: 2.50
Enter the name of appetizer: Wings
Enter the price of Wings: 12.99
Enter the name of appetizer: Salad
Enter the price of Salad: 8.50
Enter the name of appetizer: Fries
Enter the price of Fries: 4.25
Enter the name of appetizer: Soup
Enter the price of Soup: 7.25
Enter the name of Maine Course: Steak
Enter the price of Steak: 25.99
Enter the name of Maine Course: Salmon
Enter the price of Salmon: 22.50
Enter the name of Maine Course: Pasta
Enter the price of Pasta: 18.99
Enter the name of Maine Course: Chicken
Enter the price of Chicken: 16.75
Enter the name of Dessert: Cake
Enter the price of Cake: 6.99
Enter the name of Dessert: Pie
Enter the price of Pie: 5.50
Enter the name of Dessert: Ice Cream
Enter the price of Ice Cream: 4.99
Enter the name of Dessert: Brownie
Enter the price of Brownie: 3.75
Your subtotal is: $167.21
Would you like to leave a tip?
Enter (Y) for yes or (N) for no:
Y
Enter tip amount:
20
Your final total is: $187.21
```

## How to Run  
This program was **developed, compiled, and tested in IntelliJ IDEA**.  

To run it in IntelliJ:  
1. Open the project in IntelliJ.  
2. Make sure the file `RESTAURANT.java` is set as the main class.  
3. Click the green **Run** button to compile and execute the program.
4. Enter menu item names and prices when prompted.
