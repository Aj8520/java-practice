package main.streams;

import java.util.Arrays;
import java.util.List;

public class CountExample {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        Long totalNumberInList = numbers.stream().count();

        System.err.println(totalNumberInList);
    }
}
