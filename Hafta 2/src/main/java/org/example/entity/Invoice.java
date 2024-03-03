package org.example.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

/**
 * @author egepancaroglu
 */

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Invoice {

    private LocalDateTime issueDate;
    private double totalPrice;
    private Order order;


    public Invoice(LocalDateTime issueDate, Order order) {
        this.issueDate = issueDate;
        this.order = order;
        setTotalPrice();
    }

    public void setTotalPrice() {
        Double total = 0.0;

        for (Product p : order.getProducts()) {
            total += p.getPrice();
        }
        this.totalPrice = total;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "issueDate=" + issueDate +
                ", totalPrice=" + totalPrice +
                ", order=" + order +
                '}';
    }
}
