/**
 * input: customer's name
 *        purchase amount
 *        tax code
 * output: customer's name
 *         purchase amount
 *         sales tax
 *         total amount due
 * process: sales tax
 *          total amount due
 *
 * prompt user for: Name
 *                  take input
 *                  purchase amount
 *                  take input
 *                  tax code
 *                  take input letter and assign it to tax choice variable
 * create a switch statement for choosing tax code
 * assign the choice to tax amount variable
 * compute tax amount by multiplying it to purchase amount
 * print out the results
 */

import java.util.Scanner;

public class ProcessCustomerRecord {
    public static void main(String [] args){
        //declare variables
        String name;
        double taxAmount = 0;
        double purchAmount;
        final int stateTax = 3;
        final int fed_StateTax = 5;
        final int specialTax = 7;


        Scanner input = new Scanner(System.in);

        //prompt user
        System.out.println("Enter your name: " );
        name = input.nextLine();
        System.out.println("Enter purchase amount ");
        purchAmount = input.nextDouble();
        input.nextLine();
        System.out.println("Choose tax code letter: \n\tA tax exempt \n\tB state tax \n\tC federal and state tax \n\tD special sales tax");
        String taxChoice = input.nextLine();

        //assign taxAmount;
        switch (taxChoice) {
            case "A":
                taxAmount = 0;
                break;
            case "B":
                taxAmount = stateTax;
                break;
            case "C":
                taxAmount = fed_StateTax;
                break;
            case "D":
                taxAmount = specialTax;
                break;
            default:
                System.out.println("invalid tax code");
                break;
        }


        //compute
        taxAmount = purchAmount * (taxAmount/100);

        //print output
        System.out.println("name: " + name + "\nPurchase amount: $" + purchAmount +
                "\nSales tax: $" + taxAmount + "\nTotal due: $" + (purchAmount + taxAmount));






    }
}
