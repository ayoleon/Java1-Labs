# Library Management System (Basic Java Lab)

## Overview
This project is a simple **Library Management System** built in Java.  
It demonstrates **arrays, user input handling, menu-driven programs, and basic OOP concepts**.  

The program allows the user to:
- Add books (title, author, genre)  
- Print all stored books  
- Copy book information into a separate set of arrays  

---

## Features
- **Library class with attributes:** name, address, street, city, state, zip  
- **Book storage:** Uses arrays to store up to 50 book titles, authors, and genres  
- **Menu-driven interface:**  
  - **A** → Add books  
  - **B** → Print books  
  - **C** → Copy books  
- **Scanner buffer handling:** Prevents skipped inputs by clearing newlines  
- **Copy functionality:** Duplicates book information into separate arrays  

---

## Files
- **Library.java**  
  - Contains the `Library` class and `main()` method.  
  - All logic (menu, input, print, copy) is handled within this file.  

---

## How It Works
1. When the program starts, it creates a `Library` object with some default address information.  
2. The `Menu()` method runs, asking how many times you want to use the menu.  
3. Each loop allows you to:  
   - Add book(s)  
   - Print stored books  
   - Copy book information into a new set of arrays  
4. The program ends after the specified number of menu uses.  

---

## Example Run
```text
How many times do you want to use the menu? 3
Library Menu
Press 'A' to input a book
Press 'B' to print a book
Press 'C' to copy a book
a
How many books do you want to enter? 2
Enter book title: The Hobbit
Enter Author's Name: J.R.R. Tolkien
Enter Genre: Fantasy
Enter book title: Dune
Enter Author's Name: Frank Herbert
Enter Genre: Science Fiction

Library Menu
Press 'A' to input a book
Press 'B' to print a book
Press 'C' to copy a book
b

Printing books:
Name: The Hobbit
Author: J.R.R. Tolkien
Genre: Fantasy

Name: Dune
Author: Frank Herbert
Genre: Science Fiction

Library Menu
Press 'A' to input a book
Press 'B' to print a book
Press 'C' to copy a book
c
Books copied successfully!
```
---
## How to Run  
This program was **developed, compiled, and tested in IntelliJ IDEA**.  

To run it in IntelliJ:  
1. Open the project in IntelliJ.  
2. Make sure the file `Library.java` is set as the main class.  
3. Click the green **Run** button to compile and execute the program.  
4. Enter menu selections and book details when prompted.
