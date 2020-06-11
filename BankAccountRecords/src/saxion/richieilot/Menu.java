package saxion.richieilot;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    public void MenuPrinter(){
        System.out.println("\nYour Bank Account Records");
        System.out.println("=============================");
        System.out.println("1: Monthly transaction + Total");
        System.out.println("2: Monthly transaction per category");
        System.out.println("3: Total yearly balance");
        System.out.println("4: Monthly balance");
        System.out.println("5: Monthly biggest expenses");
        System.out.println("6: Monthly expenses per category");
        System.out.println("7: Monthly average expenses per category");
        System.out.println("8: Yearly income per sub-category");
        System.out.println("9: Exit");
        System.out.println("=============================");
        System.out.println("Enter your choice: ");
    }

    public boolean run(Statement statement, ProcessingEngine processor) {
            MenuPrinter();
            var option = 0;
            Scanner scanner = new Scanner(System.in);
            try {
                option = scanner.nextInt();
            }
            catch (InputMismatchException e) {
                System.out.println("Try again");
            }
            switch (option) {
                case 1: { //Monthly and total transaction
                    System.out.println("\nYearly transaction= " + processor.YearlyTransactionsCounter(statement) +" transaction(s)");
                    System.out.println("Enter Month Number: ");
                    var userInput = 0;
                    try {
                        userInput = scanner.nextInt();
                    } catch (InputMismatchException e) {
                        System.out.println("Try again with numbers");
                    }
                    if (userInput < 1 || userInput > 12) {
                        System.out.println("Enter the right month (1-12)");
                    } else {
                        System.out.println("Month["+userInput+ "] Transaction= "+processor.MonthlyTransactionsCounter(statement, userInput)+" transaction(s)");
                        System.out.println("Returning to main menu...\n");
                    }
                    return false;
                }
                case 2: { //MONTHLY transaction per category / I have no idea how to process the category
                    System.out.println("Enter Month Number: ");
                    var userInput = 0;
                    try{
                        userInput = scanner.nextInt();
                    }
                    catch (InputMismatchException e){
                        System.out.println("Try again with numbers");
                    }
                    if (userInput < 1 || userInput > 12) {
                        System.out.println("Enter the right month (1-12)");
                    } else {
                        System.out.println("Month["+userInput+ "] Transaction= "+processor.CategorialMonthlyTransactionCounter(statement, userInput).toString());
                        System.out.println("Returning to main menu...\n");
                    }
                    return false;

                }
                case 3: { //yearly balance
                    var rounded = Math.round(processor.Balance(statement)*100.0);
                    System.out.println("Yearly Balance= "+rounded/100.0); //IT WORKS?
                    System.out.println("Returning to main menu...\n");
                    return false;

                }
                case 4: { //monthly balance
                    System.out.println("Enter Month: ");
                    var userDateInput =0;
                    try {
                        userDateInput = scanner.nextInt();
                    }
                    catch (InputMismatchException e){
                        System.out.println("Illegal input try numbers");
                    }
                    if (userDateInput < 1 || userDateInput > 12) {
                        System.out.println("Enter the right month (1-12)");
                    } else {
                        var rounded = Math.round(processor.MonthlyBalance(statement, userDateInput) * 100.0);
                        System.out.println("Month["+userDateInput+"] Balance= "+rounded / 100.0);
                        System.out.println("Returning to main menu...\n");
                    }
                    return false;
                }
                case 5: {
                    //Top ten biggest expenses in a month
                    System.out.println("Returning to main menu...\n");
                    return false;
                }
                case 6: {
                    //monthly expenses per category
                    System.out.println("Returning to main menu...\n");
                    return false;
                }
                case 7: {
                    //monthly average min and max per category
                    System.out.println("Returning to main menu...\n");
                    return false;

                }

                case 8: {
                    //yearly income per subcategory
                    System.out.println("Returning to main menu...\n");
                    return false;

                }
                case 9:{ //exit
                    System.out.println("Returning to main menu...\n");
                    System.out.println("--GOOD BYE--");
                    return true;
                }
                default:
                    System.out.println("Put the correct menu number");

            }
            return false;
        }
    }


