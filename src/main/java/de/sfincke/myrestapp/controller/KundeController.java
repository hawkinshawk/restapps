package de.sfincke.myrestapp.controller;

import de.sfincke.myrestapp.model.Customer;
import lombok.extern.java.Log;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.concurrent.atomic.AtomicLong;

@RestController
@Log
public class KundeController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/customer")
    public Customer greeting(@RequestParam(value = "name", defaultValue = "Max") String name,
                             @RequestParam(value = "lastName", defaultValue = "Mustermann") String lastName) {
        log.info("Requesting a new customer!!");
        return new Customer(counter.getAndIncrement(), name, lastName,
                LocalDate.of(1977, 3, 29));
    }

}
