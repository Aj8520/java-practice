package main.ColllectionFramework;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashTableVsHashMapExample {

    public static void main(String[] args) {
        // Hashtable example
        Hashtable<Integer, String> ht = new Hashtable<>();
        ht.put(1, "One");
        ht.put(2, "Two");
        ht.put(3, "Three");

        // HashMap example
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(1, "One");
        hm.put(2, "Two");
        hm.put(3, "Three");

        // Iterating through Hashtable
        System.out.println("Hashtable:");
        Enumeration<Integer> htKeys = ht.keys();
        while (htKeys.hasMoreElements()) {
            Integer key = htKeys.nextElement();
            System.out.println("Key: " + key + ", Value: " + ht.get(key));
        }

        // Iterating through HashMap
        System.out.println("\nHashMap:");
        for (Map.Entry<Integer, String> entry : hm.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
