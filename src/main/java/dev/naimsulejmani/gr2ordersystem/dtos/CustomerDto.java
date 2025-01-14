package dev.naimsulejmani.gr2ordersystem.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CustomerDto {
    private long id;
    private String name;
    private String address;
    private String nui;
}

















