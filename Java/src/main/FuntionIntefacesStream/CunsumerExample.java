package main.FuntionIntefacesStream;

import java.util.function.Consumer;

public class CunsumerExample {

    public static void main(String[] args) {
        // Represents an operation that accepts a single input argument and returns no
        // result
        Consumer<String> printer = message -> System.out.println(message);
        printer.accept("hello Word");
    }

}
