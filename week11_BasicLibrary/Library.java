import java.util.Scanner;

public class Library {
    public String name, address, city, street, state, zip;
    int bookCount = 0; //used to index through books in loops
    Scanner input = new Scanner(System.in);

// Arrays to hold book info
    String[] bookNames = new String[50];
    String[] bookAuthors = new String[50];
    String[] bookGenres = new String[50];

    // Arrays for copies
    String[] copyBookNames = new String[50];
    String[] copyBookAuthors = new String[50];
    String[] copyBookGenres = new String[50];

    //CONSTRICTOR THAT ACCEPTS VALUES
    public Library(String name, String address, String street, String city, String state, String zip){
    this.name = name; this.address = address; this.street = street; this.city = city; this.zip = zip;
    Menu();
    }

    //MENU METHOD
    void Menu(){
        System.out.print("How many times do you want to use the menu? ");
        int loopCount = input.nextInt();
        input.nextLine(); // Clear the newline
        char choice;
        int i = 0;

        //POST-TEST LOOP TO CREATE MENU
        do{
                //DISPLAY MENU
                System.out.println("Library Menu");
                System.out.println("Press 'A' to input a book");
                System.out.println("Press 'B' to print a book");
                System.out.println("Press 'C' to copy a book");

                //USER INPUT MENU SELECTION
                choice = input.next().charAt(0);
                input.nextLine(); //CLEAR THE BUFFER OR ELSE NEW LINE CHARACTER BECOMES INPUT

                switch (choice) {
                    case 'A':
                    case 'a': {
                        InputBook();
                        break;
                    }
                    case 'B':
                    case 'b': {
                        PrintBook();
                        break;
                    }
                    case 'C':
                    case 'c': {
                        CopyBook();
                        break;
                    }

                    default: {
                        System.out.println("You did NOT make a proper choice");
                    }
                }
                i++;
        } while (i < loopCount);
    }

    void InputBook(){
        System.out.print("How many books do you want to enter? ");
        int booknum = input.nextInt();
        input.nextLine(); // Clear the newline
        for (int i = 0; i < booknum; i++) {
            System.out.print("Enter book title: ");
            bookNames[bookCount] = input.nextLine();

            System.out.print("Enter Author's Name: ");
            bookAuthors[bookCount] = input.nextLine();

            System.out.print("Enter Genre: ");
            bookGenres[bookCount] = input.nextLine();

            bookCount++;
        }
    }

    void PrintBook(){
        System.out.println("\nPrinting books:");
        for (int i = 0; i < bookCount; i++) {
            System.out.println("Name: " + bookNames[i]);
            System.out.println("Author: " + bookAuthors[i]);
            System.out.println("Genre: " + bookGenres[i] + "\n");
        }
    }

    void CopyBook(){
        for (int i = 0; i < bookCount; i++) {
            copyBookNames[i] = bookNames[i];
            copyBookAuthors[i] = bookAuthors[i];
            copyBookGenres[i] = bookGenres[i];
        }
        System.out.println("Books copied successfully!");
    }

    public static void main(String[] args) {
        Library Library1 = new Library("Liverpool", "110", "Oswego Rd.", "Liverpool", "NY", "13090");
    }
}