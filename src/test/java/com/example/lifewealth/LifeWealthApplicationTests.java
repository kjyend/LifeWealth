package com.example.lifewealth;

import com.example.lifewealth.calculator.CompoundInterestCalculator;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LifeWealthApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void createCompoundInterestCalculator(){
        CompoundInterestCalculator calculator =new CompoundInterestCalculator();
    }
}
