package dev.naimsulejmani.gr2ordersystem.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/new-order")
    public String newOrder() {
        return "new-order";
    }
}
