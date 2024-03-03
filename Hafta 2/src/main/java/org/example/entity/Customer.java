package org.example.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

/**
 * @author egepancaroglu
 */

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

    private String name;
    private String surname;
    private String sector;
    private List<Order> orders;
    private LocalDate createdAt;

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", sector='" + sector + '\'' +
                ", createdAt=" + createdAt +
                '}';
    }
}