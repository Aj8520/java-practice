package main.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirstExample {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        Optional<Integer> firstOperation = numbers.stream().filter(n -> n % 2 == 0).findFirst();

        System.out.println(firstOperation.get());
    }

}
