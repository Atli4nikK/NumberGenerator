package com.kubsu.generator;

public class PrimeNumberGenerator extends NumberGenerator {

    protected int lastPrimeNumber = 1;

    public int next(){

        for (lastPrimeNumber = lastPrimeNumber+1; true;lastPrimeNumber++){

            int b = 0;

            for (int a = 1;a <= lastPrimeNumber;a++){
                if (lastPrimeNumber % a == 0)
                    b = b + 1;
            }

            if (b == 2)
                return lastPrimeNumber;
        }
    }
}
