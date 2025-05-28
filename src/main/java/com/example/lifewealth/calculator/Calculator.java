package com.example.lifewealth.calculator;

public class Calculator {

    private int principal;
    private int rate;
    private int frequency;

    public void applyPrincipal(int principal) {
        this.principal=principal;
    }

    public int getCompoundResult() {
        if(frequency==0){
            return principal;
        }
        return principal+principal*rate/100;
    }

    public void applyYears(int years) {

    }

    public void applyInterestRate(int rate) {
        this.rate=rate;
    }

    public void applyFrequency(int frequency) {
        this.frequency=frequency;
    }
}
