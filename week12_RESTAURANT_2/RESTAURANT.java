// LEON LAM - JAVA LAB - WEEK 12 - ARRAYS OF CLASSES
//UPDATED TO WRITE VALUES FROM USER INTO ARRAYS
//METHODS RETURN TOTALS OF ALL 4 MMENU ITEMS
//BUFFER ISSUES AFTER EVERY SCANNER INPUT THAT WAS not nextLine()

import java.util.Scanner;
import java.text.DecimalFormat;


//notes REGARDING FIRST NON-UPDATED VERSION VERSION
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
            input.nextLine(); // BUFFER ISSUES. CLEAR BUFFER.

            if (drinkChoice != '1' && drinkChoice != '2') {
                System.out.println("Invalid selection. Please try again.");
            }

        }while (drinkChoice != '1' && drinkChoice != '2');

        if (drinkChoice == '1') { //COULD USE SWITCH HERE? case 1 and case 2
            return Beverages.SoftDrinks(); //calls STATIC METHOD from Beverage Class
        }
        else {
            return Beverages.Spirits(); //STATIC METHOD. READ COMMENTS IN METHOD REGARDING DECIMAL FORMAT DECLARATION!!
        }

    }

    double Appetizers() {
        //Scanner input = new Scanner(System.in);
        //ARRAYS OF MENU ITEM AND PRICES
        String[] items = new String[4];
        double[] prices = new double[4];
        double total = 0.0;

        for (int i = 0; i < 4; i++) {
            System.out.print("Enter the name of appetizer: ");
            items[i] = input.nextLine();
            System.out.print("Enter the price of " + items[i]  + ": ");
            prices[i] = input.nextDouble();
            input.nextLine(); // BUFFER ISSUES. CLEAR BUFFER.
            total += prices[i];
        }

        return total;
    }

    double MainMeal() {
        //Scanner input = new Scanner(System.in);
        //ARRAYS OF MENU ITEM AND PRICES
        String[] items = new String[4];
        double[] prices = new double[4];
        double total = 0.0;

        for (int i = 0; i < 4; i++) {
            System.out.print("Enter the name of Maine Course: ");
            items[i] = input.nextLine();
            System.out.print("Enter the price of " + items[i]  + ": ");
            prices[i] = input.nextDouble();
            input.nextLine(); // BUFFER ISSUES. CLEAR BUFFER.
            total += prices[i];
        }

        return total;
    }

    double Desserts() {
        //Scanner input = new Scanner(System.in);
        //ARRAYS OF MENU ITEM AND PRICES
        String[] items = new String[4];
        double[] prices = new double[4];
        double total = 0.0;

        for (int i = 0; i < 4; i++) {
            System.out.print("Enter the name of Dessert: ");
            items[i] = input.nextLine();
            System.out.print("Enter the price of " + items[i]  + ": ");
            prices[i] = input.nextDouble();
            input.nextLine(); // BUFFER ISSUES. CLEAR BUFFER.
            total += prices[i];
        }

        return total;
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
            input.nextLine(); // BUFFER ISSUES. CLEAR BUFFER.

            //IF INVALID INPUT
            if (tipChoice != 'Y' && tipChoice != 'y' && tipChoice != 'N' && tipChoice != 'n') {
                System.out.println("Invalid input. Please enter Y or N.");
            }
        }while (tipChoice != 'Y' && tipChoice != 'y' && tipChoice != 'N' && tipChoice != 'n');

        if (tipChoice == 'Y' || tipChoice == 'y') {
            System.out.println("Enter tip amount: ");
            double tip = input.nextDouble();
            input.nextLine(); // BUFFER ISSUES. CLEAR BUFFER.
            total += tip;
        }

        System.out.println("Your final total is: $"+ df.format(total));
    }
}

// SEPERATE CLASS FOR DRINK MENU METHODS!!!
//PUBLIC STATIC ?????
class Beverages {
    static Scanner input = new Scanner(System.in); //DECLARED IN CLASS, NOT NEEDED IN EACH METHOD

    //DECIMAL FORMAT NOTE USED IN THIS CLASS. COMMENTS BELOW ARE FOR ORIGINAL LAB BEFORE MODIFICATIONS.
    //static DecimalFormat df = new DecimalFormat("0.00");
    //DECLARE IN CLASS, ONLY NEEDED IN EACH METHOD IF METHOD IS STATIC, BUT DF IS NOT
    // DECIMAL FORMAT MADE STATIC, SO IT DOESN"T HAVE TO BE DECLARED IN STATIC EACH CLASS METHOD (SOFTDRINK & SPIRITS())
    // IF WANT TO BYPASS MAKING DECIMAL FORMAT & METHODS -STATIC- , BEVERAGE WOULD NEED TO BE INSTANTIATED IN THE MAIN.

    public static double SoftDrinks() {
        //Scanner input = new Scanner(System.in);
        //ARRAYS OF MENU ITEM AND PRICES
        String[] items = new String[4];
        double[] prices = new double[4];
        double total = 0.0;

        for (int i = 0; i < 4; i++) {
            System.out.print("Enter the name of Soft Drink: ");
            items[i] = input.nextLine();
            System.out.print("Enter the price of " + items[i] + ": ");
            prices[i] = input.nextDouble();
            input.nextLine(); // BUFFER ISSUES. CLEAR BUFFER.
            total += prices[i];
        }

        return total;
    }

    public static double Spirits() {
        //Scanner input = new Scanner(System.in);
        //ARRAYS OF MENU ITEM AND PRICES
        String[] items = new String[4];
        double[] prices = new double[4];
        double total = 0.0;

        for (int i = 0; i < 4; i++) {
            System.out.print("Enter the name of Spirit Drink: ");
            items[i] = input.nextLine();
            System.out.print("Enter the price of " + items[i] + ": ");
            prices[i] = input.nextDouble();
            input.nextLine(); // BUFFER ISSUES. CLEAR BUFFER.
            total += prices[i];
        }

        return total;
    }
}