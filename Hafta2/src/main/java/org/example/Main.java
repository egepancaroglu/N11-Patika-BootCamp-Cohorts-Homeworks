package org.example;

import org.example.entity.Customer;
import org.example.entity.Invoice;
import org.example.service.CustomerService;
import org.example.service.InvoiceService;

import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class Main {

    public static void main(String[] args) {
        List<Customer> customers = initializeCustomers();
        List<Invoice> invoices = initializeInvoices(customers);

        CustomerService customerService = new CustomerService(customers);
        InvoiceService invoiceService = new InvoiceService(invoices);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            printMenu();
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    listAllCustomers(customerService);
                    break;
                case 2:
                    // Implement other menu options based on your requirements
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void listAllCustomers(CustomerService customerService) {
        List<Customer> allCustomers = customerService.getAllCustomers();
        allCustomers.forEach(System.out::println);
    }

    private static List<Customer> initializeCustomers() {
        // Implement customer initialization logic
        return List.of(
                new Customer(1, "CustomerA", "SectorA"),
                new Customer(2, "CustomerB", "SectorB"),
                new Customer(3, "CustomerC", "SectorC")
        );
    }

    private static List<Invoice> initializeInvoices(List<Customer> customers) {
        // Implement invoice initialization logic
        return List.of(
                new Invoice(101, customers.get(0), 1200),
                new Invoice(102, customers.get(1), 1600),
                new Invoice(103, customers.get(2), 800)
        );
    }

    private static void printMenu() {
        System.out.println("1. List all customers");
        System.out.println("2. List customers with the letter 'C' in them");
        // Add more menu options based on your requirements
        System.out.print("Enter your choice: ");
    }
}