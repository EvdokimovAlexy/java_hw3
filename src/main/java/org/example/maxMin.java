package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static java.util.Collections.max;
import static java.util.Collections.min;

public class maxMin {
    public static void main(String[] args) {
        List <Integer> number=new ArrayList<Integer>();

        number.add(11);
        number.add(45);
        number.add(12);
        number.add(64);
        number.add(36);

        System.out.println("Первоначальный вид: "+number);

       int max = max(number);
       int min = min(number);
        int sumItems = 0;
        for (int item : number) {
            if (item > max) {
                max = item;
            }
            if (item < min) {
                min = item;
            }
            sumItems += item;
        }
       float average = (float)sumItems/number.size();
        System.out.println("Максимальное число "+max);
        System.out.println("Минимальное число "+min);
        System.out.println("Среднее число "+average);
    }
}