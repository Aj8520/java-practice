package main.FuntionIntefacesStream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class StreamExample {

    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Predicate to filter even numbers
        Predicate<Integer> isEven = num -> num % 2 == 0;

        // Funtion to square a number
        Function<Integer, Integer> sqareFuntion = num -> num * num;

        // consumer to print each sqared number

        Consumer<Integer> printSquareNumber = System.out::println;

        // suplier to count total sqares number
        Supplier<Integer> countSupplier = () -> 0;

        // Apply stream operation
        int totalSqaureNumbers = number.stream().filter(isEven).map(sqareFuntion).peek(printSquareNumber)
                .reduce(countSupplier.get(), (count, num) -> count * 1);

        System.out.println("total square numbers" + totalSqaureNumbers);

        //
    }

}
