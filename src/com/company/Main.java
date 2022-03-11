package com.company;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        Set<City> set = new HashSet<City>();

        set.add(new City(21, "Bishkek"));
        set.add(new City(123, "KDM"));
        set.add(new City(25, "Moscow"));
        set.add(new City(6, "New York"));
        set.add(new City(22, "Chicago"));
        TreeSet<City> set1 = new TreeSet<>(set);
        for (City b: set1) {
            if (b.getCode()%2 !=0){
                System.out.println(b);
            }
        }



    }
}

