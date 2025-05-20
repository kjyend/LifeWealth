package com.example.lifewealth;

import com.example.lifewealth.calculator.Calculator;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LifeWealthApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void createCalculator(){
        Calculator calculator =new Calculator();
    }
}
