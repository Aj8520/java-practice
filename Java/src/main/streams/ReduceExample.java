package main.streams;

import java.util.Arrays;
import java.util.List;

//terminal operation = return the value
public class ReduceExample {

    public static void main(String[] args) {
        List<Integer> number= Arrays.asList(1,2,3,4,5);

        //reduce the element
        final Integer sum= number.stream().reduce(0, (a, b) -> a+b);

        System.out.println(sum);
        
    }
    
}
