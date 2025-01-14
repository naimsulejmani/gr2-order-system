package dev.naimsulejmani.gr2ordersystem.controllers.api.v1;

import dev.naimsulejmani.gr2ordersystem.dtos.CustomerDto;
import dev.naimsulejmani.gr2ordersystem.dtos.OrderDto;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/orders")
public class OrderRestController {
    private static long orderId = 0;
    private final List<OrderDto> orders;

    public OrderRestController() {
        this.orders = new ArrayList<>();
    }

    @GetMapping
    public List<OrderDto> getOrders() {
        return orders;
    }

    @GetMapping("/{id}")
    public ResponseEntity<OrderDto> getOrderById(@PathVariable long id) {
        var order = orders.stream().filter(o -> o.getId() == id).findFirst()
                .orElseThrow();
        return ResponseEntity.ok(order);
        // return ResponseEntity.status(HttpStatus.OK).body(order);
    }


    @PostMapping
    public ResponseEntity<OrderDto> createOrder(@RequestBody OrderDto order) {
        order.setId(++orderId);
        orders.add(order);
        return ResponseEntity.status(201).body(order);
    }

    @PutMapping("/{id}")
    public ResponseEntity<OrderDto> updateOrder(@PathVariable long id, @RequestBody OrderDto order) {
        if (id != order.getId()) {
            return ResponseEntity.badRequest().build();
        }
        OrderDto orderDto = orders.stream().filter(o -> o.getId() == id).findFirst()
                .orElseThrow();
        orderDto.setCustomer(order.getCustomer());
        orderDto.setDate(order.getDate());
        orderDto.setOrderDetails(order.getOrderDetails());
        orderDto.setEmployee(order.getEmployee());
        orderDto.setComment(order.getComment());
        return ResponseEntity.ok(orderDto);

//        CustomerDto customerDto= CustomerDto.builder()
//                .name("Naim")
//                .nui("asdadad").build();


    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteOrder(@PathVariable long id) {
        orders.removeIf(o -> o.getId() == id);
        return ResponseEntity.noContent().build();
    }


}














