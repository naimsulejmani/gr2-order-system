package dev.naimsulejmani.gr2ordersystem.controllers.api.v1;

import dev.naimsulejmani.gr2ordersystem.dtos.CustomerDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/customers")
public class CustomerRestController {

    @GetMapping
    public List<CustomerDto> getCustomers() {
        return List.of(
                new CustomerDto(1, "Naim Sulejmani", "rr. nena tereze", "123456789"),
                new CustomerDto(2, "Filan Fisteku", "rr. nena tereze1 ", "123456781")
        );
    }
}
