package org.example.service;

import java.util.Scanner;

/**
 * @author egepancaroglu
 */

public interface CustomerService {

    void findAll();

    void save(Scanner scanner);

    void filterWithLetterC();
}