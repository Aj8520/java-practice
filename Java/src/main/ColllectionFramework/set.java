package main.ColllectionFramework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class set {

    public static void main(String[] args) {

        // ordering - no , sorting - no, preformance - best
        Set<Integer> numbers = new HashSet<>();

        numbers.add(3);
        numbers.add(1);
        numbers.add(2);

        numbers.forEach(System.out::println);
        // ordering - yes , sorting - no, preformance - better
        Set<Integer> numbers1 = new LinkedHashSet<>();

        numbers1.add(3);
        numbers1.add(1);
        numbers1.add(2);

        numbers1.forEach(System.out::println);
        // ordering - no , sorting - yes, preformance - good
        Set<Integer> numbers2 = new TreeSet<>();

        numbers2.add(3);
        numbers2.add(1);
        numbers2.add(2);

        numbers2.forEach(System.out::println);

    }

}
