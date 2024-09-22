package main.ColllectionFramework;

import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        // Create a PriorityQueue
        PriorityQueue<Integer> pQueue = new PriorityQueue<>();

        // Adding items to the pQueue using add()
        pQueue.add(10);
        pQueue.add(20);
        pQueue.add(15);
        pQueue.add(30);
        pQueue.add(1);
        pQueue.add(12);

        // Printing the top element of PriorityQueue
        System.out.println("Top element is: " + pQueue.peek());

        // Printing the top element and removing it
        // from the PriorityQueue container
        System.out.println("Removed element is: " + pQueue.poll());

        // Printing the top element again
        System.out.println("Top element is: " + pQueue.peek());

    }
}
