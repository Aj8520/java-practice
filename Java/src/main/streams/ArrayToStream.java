package main.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;
//convert input data to stream
public class ArrayToStream {
    // converting arrys to list 
    public static void main(String[] args) {
        List<Integer> number= Arrays.asList(1,2,3,4,5);

        // primiteve array
        int[] primiteveNumber= {1,2,3,4,5};

        // objective array
        Integer[] objectiveArray={6, 7, 8,9,10};

        // for primative data type
        final IntStream intStream= Arrays.stream(primiteveNumber);
        intStream.forEach(System.out::println);

        // for non primative data type
        final Stream<Integer> objecStream= Stream.of(objectiveArray);
        objecStream.forEach(System.out::println);

        //for collection to stream
        number.stream().forEach(System.out::println);
    }
    
}
