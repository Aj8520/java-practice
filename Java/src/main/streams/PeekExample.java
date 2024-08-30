package main.streams;
//intemediate operation

import java.util.Arrays;
import java.util.List;

import java.util.stream.Collectors;
// intermediate operation - peek
public class PeekExample {
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(1,2,3,4,5);
//peek funtion not modify stream it used for simple operation like print
        List<Integer> squareNumber= numbers.stream().peek(System.out::println).map(n -> n*n).peek(System.out::println).collect(Collectors.toList());
        System.out.println(squareNumber);
        
    }

   
    
}
