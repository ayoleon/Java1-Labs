/* Leon Lam
JAVA Lab 7
 */

import java.util.Scanner;
import java.text.DecimalFormat;


public class Investments {
    public double Balance = 100000;
    public String AccountNumber;
    final DecimalFormat df = new DecimalFormat("0.00"); //DECIMAL FORMAT IN SUPER CLASS
 //Constructor to take account number value
    Investments(String AccountNumber) {
        this.AccountNumber = AccountNumber;
        System.out.println("Account Number : " + AccountNumber);
        final DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("Balance : " + df.format(Balance));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Account Number: "); //Request Account Number
        String accNumber = input.nextLine();

        // Investments invest1 = new Investments(accNumber); //Instantiate INVESTMENT

        //Display Menu
        System.out.println(" Select: S -- stocks ; C -- CDs");
        Scanner input2 = new Scanner(System.in);
        char select = input2.next().charAt(0);

        if (select == 'S'  || select == 's'){
            //fill in IF STATEMENT
            Stocks s1 = new Stocks(accNumber);
            s1.StockPositions();
        }
        else if (select == 'C' || select == 'c'){
            CDs cd1 = new CDs(accNumber);
            cd1.CDPositions();
        }
        else {
            System.out.println("Invalid Selection");
        }
        }

}

class Stocks extends Investments{
    Stocks(String AccountNumber){
        super(AccountNumber);
    }
    //METHOD. CALLED IN MAIN
    void StockPositions(){
        System.out.println("Enter Symbol");
        Scanner input = new Scanner(System.in);
        char Sym = input.next().charAt(0);
        System.out.println("Enter number of shares");
        int numShares = input.nextInt();
        System.out.println("Enter current price");
        double price = input.nextDouble();
        double totalcost = numShares * price;
        double remaining = super.Balance - totalcost;
        System.out.println("Stock : " + Sym);
        System.out.println("Number of shares purchased:" + numShares);
        System.out.println("Price per share: " + df.format(price));
        System.out.println("Total cost : " + df.format(totalcost));
        System.out.println("New Balance : " + df.format(remaining));

    }
}

class CDs extends Investments{
    CDs(String AccountNumber){
        super(AccountNumber);
    }
    void CDPositions(){
        System.out.println("Enter CD Amount");
        Scanner input = new Scanner(System.in);
        double amount = input.nextDouble();
        System.out.println("Enter number of days");
        int days = input.nextInt();
        double rate, total;

        if (days >= 1 && days < 30){
            rate = 0;
        }
        else if (days >= 30 && days < 60){
            rate = 0.05;
        }
        else if (days >= 60 && days < 90){
            rate = 0.1;
        }
        else if (days >= 90 && days < 180){
            rate = 0.15;
        }
        else if (days >= 180){
            rate = 0.2;
        }
        else{
            System.out.println("Invalid Entry");
            rate = 0;
        }

        total = super.Balance + ( amount * rate);
        System.out.println("CD");
        System.out.println("Amount of " + df.format(amount));
        System.out.println("Rate: " + rate);
        System.out.println("Total after maturity : " + df.format(total));
    }
}

