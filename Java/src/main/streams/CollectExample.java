package main.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectExample {
    public static void main(String[] args) {
        
        List<Integer> number= Arrays.asList(1,2,3,4,5,6);

      List<Integer> squareList=   number.stream().filter(n -> n%2==0).map(x -> x *x).collect(Collectors.toList());
      System.err.println(squareList);
    }
    
}
