package main.streams;

import java.util.Arrays;
import java.util.List;

//intermediate operation= distinct
public class DistinctExample {

    public static void main(String[] args) {
        
        List<Integer> number= Arrays.asList(1,2,2,3,3,44,44);
// it removes duplicate from list
        number.stream().distinct().forEach(System.out::println);
    }
    
}
