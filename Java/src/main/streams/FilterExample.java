package main.streams;

import java.util.Arrays;
import java.util.List;
//intermediate operation= not returning anything
public class FilterExample {
    public static void main(String[] args) {

        List<Integer> number= Arrays.asList(1,2,3,4,5,6);

        // act like a gate if condition matches then the element are enter 
        number.stream().filter(n -> n%2 ==0).forEach(System.out::println);
        
    }
    
}
