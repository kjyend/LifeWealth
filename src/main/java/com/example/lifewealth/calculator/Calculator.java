package com.example.lifewealth.calculator;

public class Calculator {

    private int principal;
    private int rate;
    private int frequency;
    private int years;

    public void applyPrincipal(int principal) {
        this.principal=principal;
    }

    public int getCompoundResult() {
        if(frequency==0){
            return principal;
        }
        if(years==0){
            return 1000;
        }
        return principal+principal*rate/100;
    }

    public void applyYears(int years) {
        this.years=years;
    }

    public void applyInterestRate(int rate) {
        this.rate=rate;
    }

    public void applyFrequency(int frequency) {
        this.frequency=frequency;
    }
}
