package org.example.util;

import org.example.entity.Customer;
import org.example.entity.Invoice;
import org.example.entity.Order;
import org.example.entity.Product;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * @author egepancaroglu
 */
public class LoadInitData {


    private static final List<Customer> CUSTOMER_LIST = new ArrayList<>();
    private static final List<Invoice> INVOICE_LIST = new ArrayList<>();

    static {
        loadInitData();
    }

    private LoadInitData() {
    }

    public static List<Customer> getCustomerList() {
        return CUSTOMER_LIST;
    }

    public static List<Invoice> getInvoiceList() {
        return INVOICE_LIST;
    }

    private static void loadInitData() {
        Customer ege = new Customer("Ege", "Pancaroğlu", "IT", new ArrayList<>(), LocalDate.of(2024, 6, 12));
        Customer ahmet = new Customer("Ahmet", "Özkan", "Sales", new ArrayList<>(), LocalDate.now());
        Customer ceyda = new Customer("Ceyda", "Ersoy", "Technology", new ArrayList<>(), LocalDate.now());
        Customer ali = new Customer("Ali", "Yılmaz", "IT", new ArrayList<>(), LocalDate.now());
        Customer veli = new Customer("Veli", "Öztürk", "Management", new ArrayList<>(), LocalDate.now());

        Product muz = new Product("muz", 15.50);
        Product canta = new Product("çanta", 50.0);
        Product kitap = new Product("kitap", 10.0);
        Product notebook = new Product("notebook", 2565.50);
        Product ayakkabi = new Product("ayakkabı", 750.0);

        Order egeOrder = new Order(ege, List.of(muz, canta));
        Order ahmetOrder = new Order(ahmet, List.of(kitap, muz));
        Order ceydaOrder = new Order(ceyda, List.of(notebook, ayakkabi));
        Order aliOrder = new Order(ali, List.of(notebook, kitap, canta, muz));
        Order veliOrder = new Order(veli, List.of(kitap, notebook, canta, canta));

        ege.getOrders().add(egeOrder);
        ahmet.getOrders().add(ahmetOrder);
        ceyda.getOrders().add(ceydaOrder);
        ali.getOrders().add(aliOrder);
        veli.getOrders().add(veliOrder);

        Invoice egeInvoice = new Invoice(LocalDateTime.now(), egeOrder);
        Invoice ahmetInvoice = new Invoice(LocalDateTime.now(), ahmetOrder);
        Invoice ceydaInvoice = new Invoice(LocalDateTime.now(), ceydaOrder);
        Invoice aliInvoice = new Invoice(LocalDateTime.now(), aliOrder);
        Invoice veliInvoice = new Invoice(LocalDateTime.now(), veliOrder);

        CUSTOMER_LIST.add(ege);
        CUSTOMER_LIST.add(ahmet);
        CUSTOMER_LIST.add(ceyda);
        CUSTOMER_LIST.add(ali);
        CUSTOMER_LIST.add(veli);

        INVOICE_LIST.add(egeInvoice);
        INVOICE_LIST.add(ahmetInvoice);
        INVOICE_LIST.add(ceydaInvoice);
        INVOICE_LIST.add(aliInvoice);
        INVOICE_LIST.add(veliInvoice);

    }

}
