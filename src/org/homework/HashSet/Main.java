package org.homework.HashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Exercise7(); // Write a Java program to convert a hash set to an array.
        Exercise9(); // Write a Java program to convert a hash set to a List/ArrayList.
    }
    public static void Exercise7(){
        HashSet<String> myHashSet = new HashSet<>();
        myHashSet.add("Dog");
        myHashSet.add("Cat");
        myHashSet.add("Horse");
        myHashSet.add("Parrot");
        System.out.println("Your HashSet is: "+myHashSet);

        String[] myArray = new String[myHashSet.size()];
        myHashSet.toArray(myArray);

        System.out.println("Your array is: ");
        for (String testString : myArray){
            System.out.println(testString);
        }
    }
    public static void Exercise9(){
        HashSet<String> myHashSet = new HashSet<>();
        myHashSet.add("Dog");
        myHashSet.add("Cat");
        myHashSet.add("Horse");
        myHashSet.add("Parrot");
        System.out.println("Your HashSet is: "+myHashSet);

        List<String> myList = new ArrayList<>(myHashSet);
        System.out.println("Your ArrayList is: "+myList);
    }
}
