package main.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// intermidiate skip
public class SkipExample {
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(23,23,34,4,25,6,7);
        // this is skip element form we give potition
       List<Integer> listAfterSkiped= numbers.stream().skip(3).collect(Collectors.toList());
        System.out.println(listAfterSkiped);
    }
    
}
