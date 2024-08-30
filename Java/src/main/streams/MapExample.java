package main.streams;

import java.util.Arrays;
import java.util.List;
//intemdiate operation
//it Act Like a Transformer
public class MapExample {
public static void main(String[] args) {
    List<String> names= Arrays.asList("ajay","vijay","poonam","amit");
    names.stream().map(String::toUpperCase).forEach(System.out::println); 
}  
}
