package main.IntefacesStream;

import java.util.function.Predicate;

public class PredicateExample {

    // Represents a predicate (boolean - valued funtion ) of one argument .

    public static void main(String[] args) {
        Predicate<String> isNullOrEmpty = str -> str == null || str.isEmpty();

        System.out.println("is null or empty: " + isNullOrEmpty.test(null));

        System.out.println("is null or empty: " + isNullOrEmpty.test(""));

        System.out.println("is null or empty: " + isNullOrEmpty.test("hello"));

    }

}
