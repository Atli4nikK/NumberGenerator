package com.kubsu;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Statistica {
    public static void main(String[] args) {

        Map<String, Integer> statistic = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("1.txt"))) {

            while (reader.ready()) {
                //String[] massivSlov = reader.readLine().split(" ");
                //System.out.println(Arrays.toString(massivSlov));
                for (String word : reader.readLine().split(" ")) {
                    addWordToStatistic(statistic, word);
                }

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(statistic);
    }

    private static void addWordToStatistic(Map<String, Integer> statistic, String word) {
        if (statistic.containsKey(word)) {
            int kolvoSlov = statistic.get(word);
            statistic.put(word, kolvoSlov + 1);
        } else {
            statistic.put(word, 1);
        }
    }

}

