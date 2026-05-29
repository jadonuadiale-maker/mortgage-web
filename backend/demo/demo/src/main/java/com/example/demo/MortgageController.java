package com.example.demo;

import org.springframework.web.bind.annotation.*;
import java.text.NumberFormat;

@RestController
@RequestMapping("/calculate")

public class MortgageController {

    private final MortgageCalculator calculator = new MortgageCalculator();

    @PostMapping
    public String calculateMortgage(@RequestBody MortgageRequest request) {
        double result = calculator.calculate(
            request.getPrincipal(),
            request.getRate(),
            request.getYears()
        );

        return NumberFormat.getCurrencyInstance().format(result);
    }
    
}
