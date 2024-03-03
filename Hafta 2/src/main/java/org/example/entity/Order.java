package org.example.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

/**
 * @author egepancaroglu
 */

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Order {

    private Customer customer;
    private List<Product> products;

    @Override
    public String toString() {
        return "Order{" +
                "customer=" + customer +
                ", products=" + products +
                '}';
    }
}