package dev.naimsulejmani.gr2ordersystem.controllers.api.v1;

import dev.naimsulejmani.gr2ordersystem.dtos.Category;
import dev.naimsulejmani.gr2ordersystem.dtos.ProductDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
public class ProductRestController {

    @GetMapping
    public List<ProductDto> getProducts() {
        return List.of(
                new ProductDto(1,"Jogobella 0.5L","Jogurt",1.5, 100, Category.FOOD),
                new ProductDto(2,"Coca Cola 0.5L","Gazirano pice",2.5, 100, Category.DRINK),
                new ProductDto(3,"Milka 100g","Cokolada",3.5, 100, Category.FOOD),
                new ProductDto(4,"Kinder Bueno","Cokoladica",4.5, 100, Category.FOOD)
        );
    }
}












