package com.kubsu.generator;

public class FibNumberGenerator extends NumberGenerator {

    protected int firstFibNumber = 1;
    protected int secondFibNumber = 0;
    protected int lastFibNumber = 0;

    public int next(){

            lastFibNumber = firstFibNumber + secondFibNumber;
            firstFibNumber = secondFibNumber;
            secondFibNumber = lastFibNumber;

            return lastFibNumber;
    }
}
