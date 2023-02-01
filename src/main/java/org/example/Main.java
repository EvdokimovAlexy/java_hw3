package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        List <Integer> number=new ArrayList <Integer>();

        number.add(11);
        number.add(45);
        number.add(12);
        number.add(64);
        number.add(36);

        System.out.println("Первоначальный вид: "+number);

        int i = 0;
        while (i < number.size()) {
            if (number.get(i) % 2 == 0) {
                number.remove(i);
            }
            else {
                i++;
            }
        }

        Collections.sort(number);
        System.out.println("Список без четных чисел: "+number);
    }
}