package ghasemia;

import java.util.Scanner;

/**
 * Assignment 1
 *
 * Program : manage a store’s product stock.
 *
 * This is the main class, and it consists the runner constructor.
 *
 * @author Amirmahdi Ghasemi, October 2020
 */
public class Tester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Field of variables that will use in this class
        String id;
        boolean m;
        int qoh;
        int rsp;
        double sellPrice;
        double buyPrice;
        int unit;

        // Scanner that will be used by users to enter their information
        Scanner sc = new Scanner(System.in);
        //Enter the other class as a object in this class
        Stock st1 = new Stock();
        // The scanner will print the following sentence for greeting
        System.out.println("Hello");

        // This do-while loop will make sure that id of the user will be valid
        do {
            System.out.println("Enter Stock Product ID:");
            // Will store the id
            id = sc.nextLine();
            // Regex pattern to make sure that the id is in right pattern
            String pattern = "((?=..*[0-9]).{3}.*[_](?=.*[A-Z]).{3})";
            // will match the id with the pattern
            m = id.matches(pattern);
            // if the id is not in the right pattern the following sentence will be printed
            if (m != true) {
                System.out.println("Error: Inventory ID must be in the form 123_ABC");
            }
        } while (m != true);
        // Then the id will be set
        st1.setProductID(id);
        // The scanner will print the following sentence
        System.out.println("Enter Product Name:");
        // Will store the name 
        String name = sc.nextLine();
        //Then the name will be set
        st1.setProductName(name);
        // This do-while loop will make sure that Quantity is a valid number
        do {
            System.out.println("Qty On Hand:");
            // Will store the Quantity
            qoh = sc.nextInt();
            if (0 > qoh) {
                // If the number is negative the following exception will be thrown
                throw new IllegalArgumentException("Error: Must be greater than 0");
            }
        } while (qoh < 0);
        // Then the Quantity will be set
        st1.setQoh(qoh);
        // This do-while loop will make sure that Re-Stock is a valid number
        do {
            System.out.println("Re-Stock Point:");
            // Will store the Re-Stock
            rsp = sc.nextInt();
            if (0 > rsp) {
                // If the number is negative the following exception will be thrown
                throw new IllegalArgumentException("Error: Must be greater than 0");
            }
        } while (rsp < 0);
        // Then the Re-Stock will be set
        st1.setRsp(rsp);
        // This do-while loop will make sure that selling Price is a valid number
        do {
            System.out.println("Selling Price:");
            // Will store the sellPrice
            sellPrice = sc.nextDouble();
            if (0 > sellPrice) {
                // If the number is negative the following exception will be thrown
                throw new IllegalArgumentException("Error: Must be greater than 0");
            }
        } while (sellPrice < 0);
        // Then the sellPrice will be set
        st1.setSellPrice(sellPrice);
        // This do-while loop will make sure that buying price is a valid number
        do {
            System.out.println("Buying Price:");
            // Will store the buyPrice
            buyPrice = sc.nextDouble();
            if (0 > buyPrice) {
                // If the number is negative the following exception will be thrown
                throw new IllegalArgumentException("Error: Must be greater than 0");
            }
        } while (buyPrice < 0);
        // Then the buyPrice will be set
        st1.setBuyPrice(buyPrice);
        // The toString will be printed
        System.out.println(st1.toString());
        // If the Re-Stock is less than Quantity, the following condition will be exacuted
        if (qoh <= rsp) {
            int need = -(qoh - rsp);
            System.out.println("You should order at least " + (need + 1) + " products.");
        }
        // Asks how many units want
        System.out.println("Enter # of units to buy:");
        // Will store the unit
        unit = sc.nextInt();
        // The following condition depends on the user
        // If the user enters a number greater than 0, then program will calculate the total
        // And if the user enters a number zero or less than that the program will print zero 
        if (unit > 0) {
            System.out.println(String.format("Total Cost: $%.2f", st1.reStockFee(unit)));
        } else {
            System.out.println("Total Cost: $0.00");
        }

    }

}//END OF THE PROGRAM
