package org.example.service;

import org.example.entity.Invoice;
import org.example.util.LoadInitData;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author egepancaroglu
 */

public class InvoiceServiceImpl implements InvoiceService {

    private final List<Invoice> invoices = LoadInitData.getInvoiceList();


    @Override
    public void totalInvoiceAmountOfCustomersCreatedInJune() {
        Double totalPrice = 0.0;
        for (Invoice invoice : invoices) {
            if (invoice.getOrder().getCustomer().getCreatedAt().getMonthValue() == 6) {
                totalPrice += invoice.getTotalPrice();
            }
        }
        System.out.println(totalPrice);
    }

    @Override
    public void findAll() {
        invoices.forEach(System.out::println);
    }

    @Override
    public void filterInvoicesByTotalAmount() {
        List<Invoice> invoiceList = new ArrayList<>();
        for (Invoice invoice : invoices) {
            if (invoice.getTotalPrice() > 1500) {
                invoiceList.add(invoice);
            }
        }
        invoiceList.forEach(System.out::println);
    }

    @Override
    public void averageOfInvoicesOverAmount() {
        List<Invoice> invoiceList = new ArrayList<>();
        Double totalPrice = 0.0;
        for (Invoice invoice : invoices) {
            if (invoice.getTotalPrice() > 1500) {
                invoiceList.add(invoice);
                totalPrice += invoice.getTotalPrice();
            }
        }
        if (!invoiceList.isEmpty()) {
            System.out.println(totalPrice / invoiceList.size());
        } else {
            System.out.println("0");
        }

    }

    @Override
    public void listOfCustomersHasBelowAmount() {
        List<String> names = new ArrayList<>();
        for (Invoice invoice : invoices) {
            if (invoice.getTotalPrice() < 500) {
                names.add(invoice.getOrder().getCustomer().getName());
            }
        }
        names.forEach(System.out::println);
    }

    @Override
    public void listOfSectorNamesInvoiceAmountBelow() {
        Set<String> names = new HashSet<>();
        for (Invoice invoice : invoices) {
            if (invoice.getTotalPrice() < 750) {
                names.add(invoice.getOrder().getCustomer().getSector());
            }
        }
        names.forEach(System.out::println);
    }
}