package main.FuntionIntefacesStream;

import java.util.function.Function;

public class FunctionExample {
    // Represents a funtion that accepts one argument and produces a result
    public static void main(String[] args) {

        Function<Integer, String> intToStringConvertor = integer -> "Number: " + integer;

        String result = intToStringConvertor.apply(42);

        System.out.println(result);
    }
}
