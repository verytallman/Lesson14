package org.homework.PriorityQueue;

import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        Exercise5(); // Write a Java program to remove all the elements from a priority queue.
        Exercise6(); // Write a Java program to count the number of elements in a priority queue.
    }
    public static void Exercise5(){
        PriorityQueue<String> myPriorityQueue = new PriorityQueue<>();
        myPriorityQueue.add("Dog");
        myPriorityQueue.add("Cat");
        myPriorityQueue.add("Horse");
        System.out.println("Original Priority Queue is "+myPriorityQueue);
        myPriorityQueue.clear();
        System.out.println("Priority Queue is cleared!");
        System.out.println("The new priority queue is "+myPriorityQueue);
    }
    public static void Exercise6(){
        PriorityQueue<String> myPriorityQueue = new PriorityQueue<>();
        myPriorityQueue.add("Dog");
        myPriorityQueue.add("Cat");
        myPriorityQueue.add("Horse");
        System.out.println("Original Priority Queue is "+myPriorityQueue);
        System.out.println("The size of Priority Queue is "+myPriorityQueue.size());
    }
}
