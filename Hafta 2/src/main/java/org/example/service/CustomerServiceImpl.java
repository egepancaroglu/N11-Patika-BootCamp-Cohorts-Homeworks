package org.example.service;

import org.example.entity.Customer;
import org.example.util.LoadInitData;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author egepancaroglu
 */

public class CustomerServiceImpl implements CustomerService {

    private final List<Customer> customerList = LoadInitData.getCustomerList();

    @Override
    public void findAll() {
        customerList.forEach(System.out::println);
    }

    @Override
    public void save(Scanner scanner) {

        System.out.println("Please enter a name: ");
        String name = scanner.next();
        System.out.println("Please enter a surname: ");
        String surname = scanner.next();
        System.out.println("Please enter a sector: ");
        String sector = scanner.next();

        Customer customer = new Customer(name, surname, sector, new ArrayList<>(), LocalDate.now());
        customerList.add(customer);
    }

    @Override
    public void filterWithLetterC() {
        List<Customer> list = customerList.stream().filter(customer -> customer.getName().contains("C") || customer.getName().contains("c"))
                .toList();
        list.forEach(System.out::println);
    }
}
