package org.example;

import java.awt.List;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.*;
public class lesson2 {
    public static void main(String[] args) {
        String[] solarSystemPlanets = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};
        Random random = new Random();

        ArrayList<String> manyPlanets = new ArrayList<>();


        for (int i = 0; i < 20; i++) {
            manyPlanets.add(solarSystemPlanets[random.nextInt(8)]);
        }
        System.out.println("Список планет: " +manyPlanets);

        Set<String> set = new LinkedHashSet<>(manyPlanets);
        ArrayList<String> ListWithoutDuplicates = new ArrayList<>(set);
System.out.println("Список планет без повторов: " +ListWithoutDuplicates);

    }

}