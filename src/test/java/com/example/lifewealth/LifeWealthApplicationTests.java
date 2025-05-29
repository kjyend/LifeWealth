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
        calculator.applyPrincipal(0);
        assertEquals(calculator.getCompoundResult(),0);
    }

    @Test
    void calculateCompoundInterest_input_principal_0_year_0_return_0(){
        Calculator calculator = new Calculator();
        calculator.applyPrincipal(0);
        calculator.applyYears(0);
        assertEquals(calculator.getCompoundResult(),0);
    }

    @Test
    void calculateCompoundInterest_input_principal_0_year_0_interestRate_0_return_0(){
        Calculator calculator = new Calculator();
        calculator.applyPrincipal(0);
        calculator.applyYears(0);
        calculator.applyInterestRate(0);
        assertEquals(calculator.getCompoundResult(),0);
    }

    @Test
    void calculateCompoundInterest_input_principal_0_year_0_frequency_0_interestRate_0_return_0(){
        Calculator calculator = new Calculator();
        calculator.applyPrincipal(0);
        calculator.applyYears(0);
        calculator.applyInterestRate(0);
        calculator.applyFrequency(0);
        assertEquals(calculator.getCompoundResult(),0);
    }

    @Test
    void calculateCompoundInterest_input_principal_1000_year_0_frequency_0_interestRate_0_return_1000(){
        Calculator calculator = new Calculator();
        calculator.applyPrincipal(1000);
        calculator.applyYears(0);
        calculator.applyInterestRate(0);
        calculator.applyFrequency(0);
        assertEquals(calculator.getCompoundResult(),1000);
    }

    @Test
    void calculateCompoundInterest_input_principal_1000_year_1_frequency_0_interestRate_0_return_1000(){
        Calculator calculator = new Calculator();
        calculator.applyPrincipal(1000);
        calculator.applyYears(1);
        calculator.applyInterestRate(0);
        calculator.applyFrequency(0);
        assertEquals(calculator.getCompoundResult(),1000);
    }

    @Test
    void calculateCompoundInterest_input_principal_1000_year_1_frequency_0_interestRate_1_return_1000(){
        Calculator calculator = new Calculator();
        calculator.applyPrincipal(1000);
        calculator.applyYears(1);
        calculator.applyInterestRate(1);
        calculator.applyFrequency(0);
        assertEquals(calculator.getCompoundResult(),1000);
    }

    @Test
    void calculateCompoundInterest_input_principal_1000_year_1_frequency_1_interestRate_1_return_1010(){
        Calculator calculator = new Calculator();
        calculator.applyPrincipal(1000);
        calculator.applyYears(1);
        calculator.applyInterestRate(1);
        calculator.applyFrequency(1);
        assertEquals(calculator.getCompoundResult(),1010);
    }

    @Test
    void calculateCompoundInterest_input_principal_1000_year_0_frequency_1_interestRate_1_return_1000(){
        Calculator calculator = new Calculator();
        calculator.applyPrincipal(1000);
        calculator.applyYears(0);
        calculator.applyInterestRate(1);
        calculator.applyFrequency(1);
        assertEquals(calculator.getCompoundResult(),1000);
    }

    @Test
    void calculateCompoundInterest_input_principal_100_year_0_frequency_1_interestRate_1_return_100(){
        Calculator calculator = new Calculator();
        calculator.applyPrincipal(100);
        calculator.applyYears(0);
        calculator.applyInterestRate(1);
        calculator.applyFrequency(1);
        assertEquals(calculator.getCompoundResult(),100);
    }
}
