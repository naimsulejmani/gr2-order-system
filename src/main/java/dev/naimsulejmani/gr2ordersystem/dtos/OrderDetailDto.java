package dev.naimsulejmani.gr2ordersystem.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderDetailDto {
    private long id;
    private ProductDto product;
    private long quantity;
    private double price;
    private double discount;
    private double total;
}













