package main.streams;

import java.util.Arrays;
import java.util.List;

//intermidiate -limit
public class LimitExample {

    public static void main(String[] args) {
        List<Integer> number= Arrays.asList(1,2,3,4,5);
        //set limit and printing given number other are bloc 
        number.stream().limit(3).forEach(System.out::println);
    }
    
}
