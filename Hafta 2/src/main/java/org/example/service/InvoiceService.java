package org.example.service;

/**
 * @author egepancaroglu
 */

public interface InvoiceService {

    void totalInvoiceAmountOfCustomersCreatedInJune();

    void findAll();

    void filterInvoicesByTotalAmount();

    void averageOfInvoicesOverAmount();

    void listOfCustomersHasBelowAmount();

    void listOfSectorNamesInvoiceAmountBelow();
}
