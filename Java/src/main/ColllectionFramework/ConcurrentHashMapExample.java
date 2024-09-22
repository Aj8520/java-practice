package main.ColllectionFramework;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {

    public static void main(String[] args) {
        ConcurrentHashMap<String, Integer> concurrentMap = new ConcurrentHashMap<>();

        concurrentMap.put("One", 1);
        concurrentMap.put("Two", 2);
        concurrentMap.put("Three", 3);

        // Perform operations safely in a concurrent environment
        int value = concurrentMap.getOrDefault("Two", 0);
        System.out.println("Value for 'Two': " + value);

        int result = concurrentMap.compute("Three", (key, oldValue) -> oldValue * 10);
        System.out.println("Updated value for 'Three': " + result);
    }

}
