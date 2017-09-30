package com.kubsu.print;

import com.kubsu.generator.NumberGenerator;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import static java.lang.System.in;

/**
 *{
 *     "numbers": [
 *          1,
 *          2,
 *          3
 *     ]
 *}
 */
public class NumberPrintJson extends NumberPrint {

    public void print(NumberGenerator gen, int n){

        OutputStream out = null;
//try(out = new FileOutputStream("1.json");) создать метод гетТекст где будем передавать наш текст
        try {
            out = new FileOutputStream("1.json");
            out.write(("{\n\t\"numbers\": [\n").getBytes());

            for (int i = 1; i <= n-1; i++){
                out.write(("\t\t" + gen.next() + ",\n").getBytes());
            }

            out.write(("\t\t" + gen.next()+"\n\t]\n}").getBytes());

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
