package dev.naimsulejmani.gr2ordersystem.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderDto {
    private long id; //UUID
    private CustomerDto customer;
    private LocalDate date;
    private String employee;
    private String comment;
    private LocalDateTime createdAt;
//    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<OrderDetailDto> orderDetails;

}













