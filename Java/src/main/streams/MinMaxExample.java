package main.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MinMaxExample {

    public static void main(String[] args) {

        List<Integer> number = Arrays.asList(1, 2, 3, 4, 5, 6);

        Optional<Integer> minnumber = number.stream().min(Comparator.naturalOrder());

        System.out.println(minnumber.get());

        Optional<Integer> maxnumber = number.stream().max(Comparator.naturalOrder());

        System.out.println(maxnumber.get());

    }

}
