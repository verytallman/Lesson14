package org.homework.LinkedList;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Exercise1();
        Exercise2();
        Exercise3();
        Exercise4();
        Exercise5();
        Exercise6();
        Exercise7();
        Exercise8();
        Exercise9();
        Exercise10();
        Exercise11();
        Exercise12();
        Exercise13();
        Exercise14();
        Exercise15();
        Exercise16();
        Exercise17();
        Exercise18();
        Exercise19();
        Exercise20();
        Exercise21();
        Exercise22();
        Exercise23();
        Exercise24();
        Exercise25();
        Exercise26();
    }

    public static void Exercise1() {
        LinkedList<String> myLinkedList = new LinkedList<>();
        myLinkedList.add("Tomatoes");
        myLinkedList.add("Potatoes");
        myLinkedList.add("Peaches");
        myLinkedList.add("Cucumbers");

        System.out.println("My LinkedList is " + myLinkedList);
    }
    public static void Exercise2() {
        LinkedList<String> myLinkedList = new LinkedList<>();
        myLinkedList.add("Tomatoes");
        myLinkedList.add("Potatoes");
        myLinkedList.add("Peaches");
        myLinkedList.add("Cucumbers");
        for (String testString : myLinkedList) {
            System.out.println(testString);
        }
    }
    public static void Exercise3() {
        LinkedList<String> myLinkedList = new LinkedList<>();
        myLinkedList.add("Tomatoes");
        myLinkedList.add("Potatoes");
        myLinkedList.add("Peaches");
        myLinkedList.add("Cucumbers");
        Iterator iterator = myLinkedList.listIterator(1);
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
    public static void Exercise4() {
        LinkedList<String> myLinkedList = new LinkedList<>();
        myLinkedList.add("Tomatoes");
        myLinkedList.add("Potatoes");
        myLinkedList.add("Peaches");
        myLinkedList.add("Cucumbers");
        System.out.println("Orignal linked List " + myLinkedList);
        Iterator iterator = myLinkedList.descendingIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
    public static void Exercise5() {
        LinkedList<String> myLinkedList = new LinkedList<>();
        myLinkedList.add("Tomatoes");
        myLinkedList.add("Potatoes");
        myLinkedList.add("Peaches");
        myLinkedList.add("Cucumbers");
        System.out.println("Orignal linked List " + myLinkedList);
        myLinkedList.add(1, "Apples");
        System.out.println("Apples were added to the second place " + myLinkedList);
    }
    public static void Exercise6() {
        LinkedList<String> myLinkedList = new LinkedList<>();
        myLinkedList.add("Tomatoes");
        myLinkedList.add("Potatoes");
        myLinkedList.add("Peaches");
        myLinkedList.add("Cucumbers");
        System.out.println("Orignal linked List " + myLinkedList);
        myLinkedList.addFirst("Apples");
        System.out.println("Apples were added to the first place " + myLinkedList);
        myLinkedList.addLast("Grape");
        System.out.println("Grape was added to the last place " + myLinkedList);
    }
    public static void Exercise7() {
        LinkedList<String> myLinkedList = new LinkedList<>();
        myLinkedList.add("Tomatoes");
        myLinkedList.add("Potatoes");
        myLinkedList.add("Peaches");
        myLinkedList.add("Cucumbers");
        System.out.println("Orignal linked List " + myLinkedList);
        myLinkedList.offerFirst("Apples");
        System.out.println("Apples were added to the first place in front " + myLinkedList);

    }
    public static void Exercise8() {
        LinkedList<String> myLinkedList = new LinkedList<>();
        myLinkedList.add("Tomatoes");
        myLinkedList.add("Potatoes");
        myLinkedList.add("Peaches");
        myLinkedList.add("Cucumbers");
        System.out.println("Orignal linked List " + myLinkedList);
        myLinkedList.offerLast("Apples");
        System.out.println("Apples were added to the last place " + myLinkedList);
    }
    public static void Exercise9() {
        LinkedList<String> myLinkedList = new LinkedList<>();
        LinkedList<String> myLinkedList1 = new LinkedList<>();
        myLinkedList.add("Tomatoes");
        myLinkedList.add("Potatoes");
        myLinkedList.add("Peaches");
        myLinkedList.add("Cucumbers");
        System.out.println("Orignal linked List " + myLinkedList);

        myLinkedList1.add("Salt");
        myLinkedList1.add("Pepper");

        myLinkedList.addAll(1, myLinkedList1);

        System.out.println("Linked List after adding " + myLinkedList);
    }
    public static void Exercise10() {
        LinkedList<String> myLinkedList = new LinkedList<>();
        myLinkedList.add("Tomatoes");
        myLinkedList.add("Potatoes");
        myLinkedList.add("Peaches");
        myLinkedList.add("Cucumbers");

        System.out.println("Orignal linked List " + myLinkedList);

        Object firstElement = myLinkedList.getFirst();
        Object lastElement = myLinkedList.getLast();
        System.out.println("First element is " + firstElement);
        System.out.println("Last element is " + lastElement);
    }
    public static void Exercise11() {
        LinkedList<String> myLinkedList = new LinkedList<>();
        myLinkedList.add("Tomatoes");
        myLinkedList.add("Potatoes");
        myLinkedList.add("Peaches");
        myLinkedList.add("Cucumbers");

        System.out.println("Orignal linked List " + myLinkedList);

        for (int i = 0; i < myLinkedList.size(); i++){
            System.out.println("Element at index "+i+": "+myLinkedList.get(i));
        }
    }
    public static void Exercise12() {
        LinkedList<String> myLinkedList = new LinkedList<>();
        myLinkedList.add("Tomatoes");
        myLinkedList.add("Potatoes");
        myLinkedList.add("Peaches");
        myLinkedList.add("Cucumbers");

        System.out.println("Orignal linked List " + myLinkedList);

        myLinkedList.remove(1);
        System.out.println("Linked list without potatoes " + myLinkedList);
    }
    public static void Exercise13() {
        LinkedList<String> myLinkedList = new LinkedList<>();
        myLinkedList.add("Tomatoes");
        myLinkedList.add("Potatoes");
        myLinkedList.add("Peaches");
        myLinkedList.add("Cucumbers");

        System.out.println("Orignal linked List " + myLinkedList);

        Object firstElement = myLinkedList.removeFirst();
        Object lastElement = myLinkedList.removeLast();
        System.out.println("First element is  removed " + firstElement);
        System.out.println("Last element is removed " + lastElement);
        System.out.println("The new linked List "+myLinkedList);
    }
    public static void Exercise14() {
        LinkedList<String> myLinkedList = new LinkedList<>();
        myLinkedList.add("Tomatoes");
        myLinkedList.add("Potatoes");
        myLinkedList.add("Peaches");
        myLinkedList.add("Cucumbers");

        System.out.println("Orignal linked List " + myLinkedList);

        myLinkedList.clear();

        System.out.println("Cleared linked List "+myLinkedList);
    }
    public static void Exercise15() {
        LinkedList<String> myLinkedList = new LinkedList<>();
        myLinkedList.add("Tomatoes");
        myLinkedList.add("Potatoes");
        myLinkedList.add("Peaches");
        myLinkedList.add("Cucumbers");

        System.out.println("Orignal linked List " + myLinkedList);

        Collections.swap(myLinkedList,3,0);

        System.out.println("I Swapped Cucumbers and Tomatoes "+myLinkedList);
    }
    public static void Exercise16() {
        LinkedList<String> myLinkedList = new LinkedList<>();
        myLinkedList.add("Tomatoes");
        myLinkedList.add("Potatoes");
        myLinkedList.add("Peaches");
        myLinkedList.add("Cucumbers");

        System.out.println("Orignal linked List " + myLinkedList);

        Collections.shuffle(myLinkedList);

        System.out.println("Shuffled linked list is "+myLinkedList);
    }
    public static void Exercise17() {
        LinkedList<String> myLinkedList = new LinkedList<>();
        LinkedList<String> myLinkedList2 = new LinkedList<>();
        LinkedList<String> myLinkedList3 = new LinkedList<>();

        myLinkedList.add("Tomatoes");
        myLinkedList.add("Potatoes");
        myLinkedList.add("Peaches");
        myLinkedList.add("Cucumbers");

        myLinkedList2.add("Pasta");
        myLinkedList2.add("Floor");
        myLinkedList2.add("Sour Cream");
        myLinkedList2.add("Milk");

        System.out.println("Orignal first linked List " + myLinkedList);
        System.out.println("Orignal second linked List " + myLinkedList2);

        myLinkedList3.addAll(myLinkedList);
        myLinkedList3.addAll(myLinkedList2);
        System.out.println("New linked list "+myLinkedList3);
    }
    public static void Exercise18() {
        LinkedList<String> myLinkedList = new LinkedList<>();
        LinkedList<String> NewMyLinkedList = new LinkedList<>();

        myLinkedList.add("Tomatoes");
        myLinkedList.add("Potatoes");
        myLinkedList.add("Peaches");
        myLinkedList.add("Cucumbers");

        System.out.println("Orignal linked List " + myLinkedList);

        NewMyLinkedList = (LinkedList<String>) myLinkedList.clone();

        System.out.println("Cloned linked list "+NewMyLinkedList);
    }
    public static void Exercise19() {
        LinkedList<String> myLinkedList = new LinkedList<>();

        myLinkedList.add("Tomatoes");
        myLinkedList.add("Potatoes");
        myLinkedList.add("Peaches");
        myLinkedList.add("Cucumbers");

        System.out.println("Orignal linked List " + myLinkedList);
        System.out.println("Removed element "+myLinkedList.pop());
        System.out.println("Linked list after pop "+myLinkedList);

    }
    public static void Exercise20() {
        LinkedList<String> myLinkedList = new LinkedList<>();

        myLinkedList.add("Tomatoes");
        myLinkedList.add("Potatoes");
        myLinkedList.add("Peaches");
        myLinkedList.add("Cucumbers");
        System.out.println("Orignal linked List " + myLinkedList);

        String testString = myLinkedList.peekFirst();
        System.out.println("First element is "+testString);
        System.out.println("Linked List after peekFist() " + myLinkedList);
    }
    public static void Exercise21() {
        LinkedList<String> myLinkedList = new LinkedList<>();

        myLinkedList.add("Tomatoes");
        myLinkedList.add("Potatoes");
        myLinkedList.add("Peaches");
        myLinkedList.add("Cucumbers");
        System.out.println("Orignal linked List " + myLinkedList);

        String testString = myLinkedList.peekLast();
        System.out.println("Last element is "+testString);
        System.out.println("Linked List after peekLast() " + myLinkedList);
    }
    public static void Exercise22() {
        LinkedList<String> myLinkedList = new LinkedList<>();

        myLinkedList.add("Tomatoes");
        myLinkedList.add("Potatoes");
        myLinkedList.add("Peaches");
        myLinkedList.add("Cucumbers");
        System.out.println("Orignal linked List " + myLinkedList);

        if (myLinkedList.contains("Tomatoes")){
            System.out.println("Tomatoes are present in list");
        }else {
            System.out.println("There is no Tomatoes in given list");
        }
    }
    public static void Exercise23() {
        LinkedList<String> myLinkedList = new LinkedList<>();

        myLinkedList.add("Tomatoes");
        myLinkedList.add("Potatoes");
        myLinkedList.add("Peaches");
        myLinkedList.add("Cucumbers");
        System.out.println("Orignal linked List " + myLinkedList);
        System.out.println("Linked List ---> ArrayList");
        List<String> testList = new ArrayList<>(myLinkedList);
        for (String testString : testList){
            System.out.println(testString);
        }
    }
    public static void Exercise24() {
        LinkedList<String> myLinkedList = new LinkedList<>();
        LinkedList<String> myLinkedList1 = new LinkedList<>();

        myLinkedList.add("Tomatoes");
        myLinkedList.add("Potatoes");
        myLinkedList.add("Peaches");
        myLinkedList.add("Cucumbers");
        System.out.println("Orignal first linked List " + myLinkedList);

        myLinkedList1.add("Tomatoes");
        myLinkedList1.add("Potatoes");
        myLinkedList1.add("Peaches");
        myLinkedList1.add("Grapes");

        System.out.println("Orignal second linked List " + myLinkedList1);

        LinkedList<String> testLinkedList = new LinkedList<>();
        System.out.println("Есть ли совпадения в данных 2 Линкед Листах поиндексно?");
        for (String testString : myLinkedList){
            testLinkedList.add(myLinkedList1.contains(testString) ? "Да" : "Нет");
            System.out.println(testLinkedList.get(testLinkedList.size()-1));
        }
    }
    public static void Exercise25() {
        LinkedList<String> myLinkedList = new LinkedList<>();

        myLinkedList.add("Tomatoes");
        myLinkedList.add("Potatoes");
        myLinkedList.add("Peaches");
        myLinkedList.add("Cucumbers");
        System.out.println("Orignal linked List " + myLinkedList);
        System.out.println("Linked list is empty? "+myLinkedList.isEmpty());
        myLinkedList.clear();
        System.out.println("Linked list is now cleared!");
        System.out.println("May be Linked list is empty now? "+myLinkedList.isEmpty());
    }
    public static void Exercise26() {
        LinkedList<String> myLinkedList = new LinkedList<>();

        myLinkedList.add("Tomatoes");
        myLinkedList.add("Potatoes");
        myLinkedList.add("Peaches");
        myLinkedList.add("Cucumbers");
        System.out.println("Orignal linked List " + myLinkedList);

        myLinkedList.set(0, "Apples");
        System.out.println("Tomatoes ---> Apples");
        System.out.println("New linked list " + myLinkedList);
    }
}