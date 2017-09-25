package com.kubsu;

import com.kubsu.generator.FibNumberGenerator;
import com.kubsu.generator.PrimeNumberGenerator;
import com.kubsu.print.NumberPrint;
import com.kubsu.print.NumberPrintJson;
import com.kubsu.print.NumberPrintTxt;
import com.kubsu.print.NumberPrintXml;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import static java.lang.System.in;

public class Main {
    public static void main(String[] args){

        PrimeNumberGenerator primeGenerator = new PrimeNumberGenerator();
        FibNumberGenerator fibGenerator = new FibNumberGenerator();

        NumberPrintTxt printPrimeTxt = new NumberPrintTxt();
        NumberPrintXml printPrimeXml = new NumberPrintXml();
        NumberPrintJson printPrimeJson = new NumberPrintJson();

        //printPrimeTxt.print(primeGenerator, 55);
        printPrimeXml.print(fibGenerator, 20);
        printPrimeJson.print(primeGenerator, 75);

//        for (int i = 1; i<=20; i++) {
//            System.out.println(primeGenerator.next());
//        }

    }
}
