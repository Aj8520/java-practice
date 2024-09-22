package main.ColllectionFramework;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

// entry object in java 
public class Entry {

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();

        map.put(1, "Abhi");
        map.put(2, "Joe");
        map.put(3, "sandy");

        Set<Map.Entry<Integer, String>> allEntries = map.entrySet();

        for (Map.Entry<Integer, String> entry : allEntries) {

            System.out.println("key is: " + entry.getKey());
            System.out.println("value is: " + entry.getValue());

        }

    }

}
