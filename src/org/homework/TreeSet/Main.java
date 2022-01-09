package org.homework.TreeSet;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Example5(); //Write a Java program to get the first and last elements in a tree set.
        Example6(); //Write a Java program to clone a tree set list to another tree set.
    }
    public static void Example5(){
        TreeSet<String> myTreeSet = new TreeSet<>();
        myTreeSet.add("Dog");
        myTreeSet.add("Horse");
        myTreeSet.add("Cat");
        System.out.println("My tree set is: ");
        System.out.println(myTreeSet);

        Object firstElement = myTreeSet.first();
        Object lastElement = myTreeSet.last();
        System.out.println("The first element in given Tree Set is: "+firstElement);
        System.out.println("The last element in given Tree Set is: "+lastElement);
    }
    public static void Example6(){
        TreeSet<String> myTreeSet = new TreeSet<>();

        myTreeSet.add("Dog");
        myTreeSet.add("Horse");
        myTreeSet.add("Cat");
        System.out.println("My tree set is: "+myTreeSet);

        TreeSet<String> myTreeSetClone = (TreeSet<String>) myTreeSet.clone();
        System.out.println("My cloned tree set is: "+myTreeSetClone);
    }
}
