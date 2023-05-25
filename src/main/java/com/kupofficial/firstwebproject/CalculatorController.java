package com.kupofficial.firstwebproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    private final CalculatorService calculatorService;

    public CalculatorController (CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping()
    public String answerHello(@RequestParam("name") String a) {
        return calculatorService.answerHello(a);
    }
    @GetMapping( "/plus")
    public String sumOperation(@RequestParam("num1") int a, @RequestParam("num2") int b) {
        return calculatorService.sumOperation(a, b);
    }
    @GetMapping(path = "/minus")
    public String minusOperation(@RequestParam("num1") int a, @RequestParam("num2") int b) {
        return calculatorService.minusOperation(a, b);
    }

    @GetMapping(path = "/multiply")
    public String multiplyOperation(@RequestParam("num1") int a, @RequestParam("num2") int b) {
        return calculatorService.multiplyOperation(a, b);
    }

    @GetMapping(path = "/divide")
    public String divideOperation(@RequestParam("num1") int a, @RequestParam("num2") int b) {
            return calculatorService.divideOperation(a, b);
    }
}
