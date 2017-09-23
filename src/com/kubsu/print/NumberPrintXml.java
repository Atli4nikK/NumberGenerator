package com.kubsu.print;

import com.kubsu.generator.NumberGenerator;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import static java.lang.System.in;

/**
* <numbers>
*     <number>1</number>
*     <number>2</number>
*     <number>3</number>
* </numbers>
*/

public class NumberPrintXml extends NumberPrint {

    public void print(NumberGenerator gen, int n){

        OutputStream out = null;

        try {
            out = new FileOutputStream("1.xml");
            out.write("<numbers> \n".getBytes());
            for (int i = 1; i <= n; i++){
                out.write(("\t" + "<number>" + gen.next() + "</number>"+"\n").getBytes());
            }
            out.write("</numbers>".getBytes());

        } catch (IOException e){
            e.printStackTrace();
        } finally {
            if (in!= null){
                try{
                    out.close();
                } catch(Exception e){

                }
            }
        }

    }
}
