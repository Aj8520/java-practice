package main.ColllectionFramework;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSortingUsingCollections {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(30);
        numbers.add(10);
        numbers.add(50);
        numbers.add(20);

        // // Sorting ArrayList in ascending order using Collections.sort()
        // Collections.sort(numbers);

        // // Displaying the sorted ArrayList
        // System.out.println("Sorted ArrayList (ascending): " + numbers);

        // Sorting ArrayList in descending order using Collections.sort() and
        // reverseOrder()
        Collections.sort(numbers, Collections.reverseOrder());

        // Displaying the sorted ArrayList in descending order
        System.out.println("Sorted ArrayList (descending): " + numbers);

    }

}
