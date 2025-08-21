// LEON LAM - JAVA LAB - WEEK 12 - ARRAYS OF CLASSES

import java.util.Scanner;
import java.text.DecimalFormat;

//notes
//char type variable used for methods using switch statements to return values...
//int type variblae used for methods using array indexing to return values... creates issue if letter is entered.
// DECIMAL FORMAT DECLARED STATIC IN BEVERAGE CLASS, ONLY NEEDED IN EACH METHOD IF METHOD IS STATIC, BUT DF IS NOT
// IF WANT TO BYPASS MAKING DECIMAL FORMAT & METHODS -STATIC- , BEVERAGE WOULD NEED TO BE INSTANTIATED IN THE MAIN.

public class RESTAURANT {
    //Scanner input = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("0.00"); //DECLARE HERE IN CLASS. ONLY NEEDED IN EACH METHOD IF METHOD IS STATIC
    static Scanner input = new Scanner(System.in);  //GLOBAL VARIABLE, DOES NOT NEED TO BE DECLARED IN EVERY METHOD

    double appetizerPrice;
    double mainMealPrice;
    double dessertPrice;
    double drinkPrice;

    //CONSTRUCTOR
    public RESTAURANT() {
        drinkPrice = chooseDrink();
        appetizerPrice = Appetizers();
        mainMealPrice = MainMeal();
        dessertPrice = Desserts();

        BILL(appetizerPrice, mainMealPrice, dessertPrice, drinkPrice);
    }

    public static void main(String[] args) {
        RESTAURANT[] bills = new RESTAURANT[5]; //DECLARES THE ARRAY OF 5 RESTAURANT CLASS OBJECTS
        //INSTATIATE EACH CLASS OBJECT
        for (int i = 0; i < bills.length; i++) {
            //PRINT KEEPS TRACK OF EACH "BILL"
            System.out.println("\n--- Welcome to Restaurant Order #" + (i + 1) + " ---");
            bills[i] = new RESTAURANT(); // <--------------------------
        }
    }

    //METHOD THAT CALLS EITHER SOFTDRINK OR SPIRIT MENU FROM BEVERAGE CLASS
    double chooseDrink() {
        //Scanner input = new Scanner(System.in);
        char drinkChoice;

        do {
            System.out.println("Would you like a (1) Soft Drink or (2) Spirit?");
            drinkChoice = input.next().charAt(0);

            if (drinkChoice != '1' && drinkChoice != '2') {
                System.out.println("Invalid selection. Please try again.");
            }

        }while (drinkChoice != '1' && drinkChoice != '2');

        if (drinkChoice == '1') { //COULD USE SWITCH HERE? case 1 and case 2
            return Beverages.SoftDrinks(); //calls STATIC METHOD from Beverage Class
        } else {
            return Beverages.Spirits(); //STATIC METHOD. READ COMMENTS IN METHOD REGARDING DECIMAL FORMAT DECLARATION!!
        }

    }

    double Appetizers() {
        //Scanner input = new Scanner(System.in);
        //ARRAYS OF MENU ITEM AND PRICES
        String[] items = {"Shrimp Cocktail", "Clam Chowder", "Wings", "Salad"};
        double[] prices = {12.99, 7.50, 18.99, 17.99};

        //PRINT EACH ITEM WITH PRICE
        char choice; // = 0;
        //DecimalFormat df = new DecimalFormat("0.00"); //ONLY NEEDED IN EACH METHOD IF METHOD IS STATIC
        //LOOP IF CHOICE IS INVALID
        do {
            System.out.println("Choose an appetizer:");
            for (int i = 0; i < items.length; i++) {
                System.out.println((i + 1) + ". " + items[i] + " - $" + df.format(prices[i]));
            }
            //USER INPUT CHOICE
            choice = input.next().charAt(0);

            if (choice < '1' || choice > '4') { //.LENGTH = length of array
                System.out.println("Invalid selection. Please try again.");
            }
        }while (choice < '1' || choice > '4');

        //USING SWITCH HERE FOR RETURN VALUES
        switch (choice) {
            case '1':
                return prices[0];
            case '2':
                return prices[1];
            case '3':
                return prices[2];
            case '4':
                return prices[3];
            default:
                return 0.0; // just in case ... IS DEFAULT NEEDED IF I HAVE IF STATEMENT FOR INVALID CHOICE IN THE post test loop???
        }
    }

    double MainMeal() {
        //Scanner input = new Scanner(System.in);
        String[] items = {"Ribeye", "Lobster", "Salmon", "Chicken"};
        double[] prices = {89.99, 90.00, 32.99, 26.99};
        //DecimalFormat df = new DecimalFormat("0.00"); //ONLY NEEDED IN EACH METHOD IF METHOD IS STATIC

        //USING INT HERE CREATES ERRORS IF LETTER IS ACCIDENTALLY ENTERED AS INPUT
        char choice; //= 0;
         do{
            System.out.println("Choose a main meal:");
            for (int i = 0; i < items.length; i++) {
                System.out.println((i + 1) + ". " + items[i] + " - $" + df.format(prices[i]));
            }

            choice = input.next().charAt(0);
            if (choice < '1' || choice > '4') {
                System.out.println("Invalid selection. Please try again.");
            }
        }while (choice < '1' || choice > '4');
        //USING SWITCH HERE FOR RETURN VALUES
        switch (choice) {
            case '1':
                return prices[0];
            case '2':
                return prices[1];
            case '3':
                return prices[2];
            case '4':
                return prices[3];
            default:
                return 0.0; // just in case
        }

    }

    double Desserts() {
        //Scanner input = new Scanner(System.in);
        String[] items = {"Crème Brulee", "Cheese Cake", "Sorbet", "Souffle"};
        double[] prices = {19.99, 12.99, 12.99, 16.99};
        //DecimalFormat df = new DecimalFormat("0.00"); //ONLY NEEDED IN EACH METHOD IF METHOD IS STATIC

        char choice; // = 0;
        do {
            System.out.println("Choose a dessert:");
            for (int i = 0; i < items.length; i++) {
                System.out.println((i + 1) + ". " + items[i] + " - $" + df.format(prices[i]));
            }

            choice = input.next().charAt(0);
            if (choice < '1' || choice > '4') { //IF CHOICE IS LESS THAN 1 OR LONGER THAN ARRAY LENGTH, INVALID
                System.out.println("Invalid selection. Please try again.");
            }
        }while (choice < '1' || choice > '4');

        //USING SWITCH HERE FOR RETURN VALUES
        switch (choice) {
            case '1':
                return prices[0];
            case '2':
                return prices[1];
            case '3':
                return prices[2];
            case '4':
                return prices[3];
            default:
                return 0.0; // just in case
        }
    }

    void BILL(double appetizer, double main, double dessert, double beverage) {
        //Scanner input = new Scanner(System.in);
        //DecimalFormat df = new DecimalFormat("0.00"); //ONLY NEEDED IN EACH METHOD IF METHOD IS STATIC
        double total = appetizer + main + dessert + beverage;

        System.out.println("Your subtotal is: $" + df.format(total));

        char tipChoice; //  = ' '; // default value that’s not Y or N
        //CHAR WORKS BETTER THAN INT FOR OTHER METHODS BECAUSE LETTERS ARE INVALID SELECTIONS
        do {
            System.out.println("Would you like to leave a tip?");
            System.out.println("Enter (Y) for yes or (N) for no:");
            tipChoice = input.next().charAt(0);

            //IF INVALID INPUT
            if (tipChoice != 'Y' && tipChoice != 'y' && tipChoice != 'N' && tipChoice != 'n') {
                System.out.println("Invalid input. Please enter Y or N.");
            }
        }while (tipChoice != 'Y' && tipChoice != 'y' && tipChoice != 'N' && tipChoice != 'n');

        if (tipChoice == 'Y' || tipChoice == 'y') {
            System.out.println("Enter tip amount: ");
            double tip = input.nextDouble();
            total += tip;
        }

        System.out.println("Your final total is: $"+ df.format(total));
    }
}

// SEPERATE CLASS FOR DRINK MENU METHODS!!!
//PUBLIC STATIC ?????
class Beverages {
    static Scanner input = new Scanner(System.in); //DECLARED IN CLASS, NOT NEEDED IN EACH METHOD

    static DecimalFormat df = new DecimalFormat("0.00");
    //DECLARE IN CLASS, ONLY NEEDED IN EACH METHOD IF METHOD IS STATIC, BUT DF IS NOT
    // DECIMAL FORMAT MADE STATIC, SO IT DOESN"T HAVE TO BE DECLARED IN STATIC EACH CLASS METHOD (SOFTDRINK & SPIRITS())
    // IF WANT TO BYPASS MAKING DECIMAL FORMAT & METHODS -STATIC- , BEVERAGE WOULD NEED TO BE INSTANTIATED IN THE MAIN.

    public static double SoftDrinks() {
        //Scanner input = new Scanner(System.in);
        // DecimalFormat df = new DecimalFormat("0.00"); //ONLY NEEDED IN EACH METHOD IF METHOD IS STATIC, but df is not.
        String[] drinks = {"Coke", "Diet Coke", "Sprite", "Dr. Pepper"};
        double[] prices = {2.50, 2.50, 2.25, 2.75};

        //WHILE LOOP IF USER ENTER INVALID SELECTIONN
        char choice;
        do {
            System.out.println("Choose a soft drink:");
            for (int i = 0; i < drinks.length; i++) {
                System.out.println((i + 1) + ". " + drinks[i] + " - $" + df.format(prices[i]));
                //PRINTS NUMBER, DRINK, PRICE
            }

            choice = input.next().charAt(0);
            if (choice < '1' || choice > '4') {
                System.out.println("Invalid selection. Please try again.");
            }
        }while (choice < '1' || choice > '4');

        //USING SWITCH HERE FOR RETURN VALUES
        switch (choice) {
            case '1':
                return prices[0];
            case '2':
                return prices[1];
            case '3':
                return prices[2];
            case '4':
                return prices[3];
            default:
                return 0.0; // just in case
        }
    }

    public static double Spirits() {
        //Scanner input = new Scanner(System.in);
        //DecimalFormat df = new DecimalFormat("0.00"); //ONLY NEEDED IN EACH METHOD IF METHOD IS STATIC, but df is not
        String[] spirits = {"Beer", "Vodka", "Gin", "Champagne"};
        double[] prices = {5.00, 8.00, 7.50, 15.00};

        //MUST BE INT TYPE FOR ARRAY INDEXING. CREATES ISSUE IF USER ENTERS ANYTHING OTHER THAN A NUMBER
        int choice;
        do {
            System.out.println("Choose a spirit:");
            for (int i = 0; i < spirits.length; i++) {
                System.out.println((i + 1) + ". " + spirits[i] + " - $" + df.format(prices[i]));
            }

            choice = input.nextInt();
            if (choice < 1 || choice > spirits.length) {
                System.out.println("Invalid selection. Please try again.");
            }
        }while (choice < 1 || choice > spirits.length);

        //USING ARRAY INDEXING FOR RETURN VALUE HERE INSTEAD OF SWITCH!!
        return prices[choice - 1];
    }
}