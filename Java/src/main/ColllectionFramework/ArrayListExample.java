package main.ColllectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

// diffrence between collection and collections 
public class ArrayListExample {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        System.out.println(arrayList);
        Collections.reverse(arrayList);
        System.out.println(arrayList);

        int maxnumber = Collections.max(arrayList);
        System.out.println(maxnumber);

    }

}
