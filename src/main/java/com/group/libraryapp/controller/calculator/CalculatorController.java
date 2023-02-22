package com.group.libraryapp.controller.calculator;

import com.group.libraryapp.dto.calculator.request.CalculatorAddRequest;
import com.group.libraryapp.dto.calculator.request.CalculatorMultiplyRequest;
import org.springframework.web.bind.annotation.*;

@RestController
public class CalculatorController {

    @GetMapping("/add")
    public int addTwoNumbers(CalculatorAddRequest calculatorAddRequest) {
        return calculatorAddRequest.getNumber1() + calculatorAddRequest.getNumber2();
    }

    @PostMapping("/multiply")
    public int multiplyTwoNumbers(@RequestBody CalculatorMultiplyRequest request){
        return request.getNumber1() * request.getNumber2();
    }
}
