package com.example.lifewealth.calculator;

public class Calculator {

    private int principal;
    private int rate;

    public void applyPrincipal(int principal) {
        this.principal=principal;
    }

    public int getCompoundResult() {
        return principal+principal*rate/100;
    }

    public void applyYears(int years) {

    }

    public void applyInterestRate(int rate) {
        this.rate=rate;
    }

    public void applyFrequency(int frequency) {

    }
}
