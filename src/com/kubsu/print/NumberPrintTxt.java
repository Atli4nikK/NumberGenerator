package com.kubsu.print;

import com.kubsu.generator.FibNumberGenerator;
import com.kubsu.generator.NumberGenerator;
import com.kubsu.generator.PrimeNumberGenerator;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import static java.lang.System.in;

public class NumberPrintTxt extends NumberPrint {

    public void print(NumberGenerator gen, int n){

        OutputStream out = null;

        try {
            out = new FileOutputStream("1.txt");
            for (int i = 1; i <= n; i++) {
                out.write((gen.next() + " ").getBytes());
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(in != null){
                try {
                    out.close();
                }catch (Exception e){}
            }
        }

    }

}
