package main.shadowing;

public class ShadowingExample {

    static int a = 10;

    public static void printInnerA() {
        int a = 20;
        // Inner variable, shadowing the outer variable
        System.out.println("inner method a " + a);
    }

    public static void main(String[] args) {

        System.out.println("outer a " + a);

        printInnerA();

    }
}
