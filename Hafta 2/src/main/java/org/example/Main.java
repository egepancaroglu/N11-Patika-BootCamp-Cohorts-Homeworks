package org.example;

import org.example.service.CustomerServiceImpl;
import org.example.service.InvoiceServiceImpl;

import java.util.Scanner;

/**
 * Hello world!
 */
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        CustomerServiceImpl customerService = new CustomerServiceImpl();
        InvoiceServiceImpl invoiceService = new InvoiceServiceImpl();
        boolean exit = true;

        while (exit) {
            printMenu();
            int number = scanner.nextInt();
            switch (number) {
                case 1 -> customerService.save(scanner);
                case 2 -> customerService.findAll();
                case 3 -> customerService.filterWithLetterC();
                case 4 -> invoiceService.totalInvoiceAmountOfCustomersCreatedInJune();
                case 5 -> invoiceService.findAll();
                case 6 -> invoiceService.filterInvoicesByTotalAmount();
                case 7 -> invoiceService.averageOfInvoicesOverAmount();
                case 8 -> invoiceService.listOfCustomersHasBelowAmount();
                case 9 -> invoiceService.listOfSectorNamesInvoiceAmountBelow();
                case 0 -> exit = false;
                default -> System.out.println("Invalid option !");
            }
        }
    }

    private static void printMenu() {
        System.out.println("1. Create New Customer");
        System.out.println("2. List all customers");
        System.out.println("3. List customers with the letter 'C' in them");
        System.out.println("4. List total amount of invoices of customers who registered in June");
        System.out.println("5. List all invoices in the system");
        System.out.println("6. List invoices over 1500TL in the system");
        System.out.println("7. Calculate the average of invoices over 1500TL in the system");
        System.out.println("8. List names of customers with invoices under 500TL in the system");
        System.out.println("9. List sector in which companies whose average invoices for June are below 750 are in");
        System.out.println("0. EXIT");
        System.out.print("Enter your choice: ");
    }
}

