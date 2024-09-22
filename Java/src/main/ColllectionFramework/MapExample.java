package main.ColllectionFramework;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        // Create a Map using HashMap
        Map<String, Integer> map = new HashMap<>();

        // Adding key-value pairs
        map.put("Apple", 5);
        map.put("Banana", 3);
        map.put("Orange", 8);

        // Accessing values using keys
        int appleCount = map.get("Apple");
        System.out.println("Apple count: " + appleCount);

        // Checking if a key exists
        boolean containsBanana = map.containsKey("Banana");
        System.out.println("Contains Banana? " + containsBanana);

        // Iterating through key-value pairs
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Removing a key-value pair
        map.remove("Orange");

        // Size of the map
        int size = map.size();
        System.out.println("Map size: " + size);

        // Clearing the map
        map.clear();

        // Checking if the map is empty
        boolean isEmpty = map.isEmpty();
        System.out.println("Is map empty? " + isEmpty);
    }
}
