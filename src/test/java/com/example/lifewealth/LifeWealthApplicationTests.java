package com.example.lifewealth;

import com.example.lifewealth.calculator.Calculator;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class LifeWealthApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void calculateCompoundInterest_input_0_return_0(){
        Calculator calculator = new Calculator();
        calculator.calculateCompoundInterest(0);
        assertEquals(calculator.getCompoundResult(),0);
    }

    @Test
    void calculateCompoundInterest_input_principal_0_year_0_return_0(){
        Calculator calculator = new Calculator();
        calculator.calculateCompoundInterest(0);
        calculator.applyYears(0);
        assertEquals(calculator.getCompoundResult(),0);
    }

    @Test
    void calculateCompoundInterest_input_principal_0_year_0_interestRate_0_return_0(){
        Calculator calculator = new Calculator();
        calculator.calculateCompoundInterest(0);
        calculator.applyYears(0);
        calculator.applyInterestRate(0);
        assertEquals(calculator.getCompoundResult(),0);
    }
}
