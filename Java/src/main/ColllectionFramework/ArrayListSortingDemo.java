package main.ColllectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListSortingDemo {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("banana");
        fruits.add("apple");
        fruits.add("grape");
        fruits.add("orange");

        // Sorting ArrayList using a custom comparator
        Collections.sort(fruits, new Comparator<String>() {
            public int compare(String fruit1, String fruit2) {
                return fruit1.compareTo(fruit2);
            }
        });

        // Displaying the sorted ArrayList
        System.out.println("Sorted ArrayList: " + fruits);
    }
}
