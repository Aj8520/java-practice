package main.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Sorted {
// intermidiate -sorted
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(5,4,3,2,1);
// uses for sorting the element according to your knolage
        numbers.stream().sorted(Comparator.reverseOrder()
        ).forEach(System.out::println);

        List<String> names= Arrays.asList("a", "aj", "ajay", "abc");
        names.stream().sorted(Comparator.comparingInt(String:: length)).forEach(System.out::println);
    }
    
}
