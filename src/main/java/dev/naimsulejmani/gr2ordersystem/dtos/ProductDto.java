package dev.naimsulejmani.gr2ordersystem.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ProductDto {
    private long id;
    private String name;
    private String description;
    private double price;
    private long quantity;
    private Category category;
}














