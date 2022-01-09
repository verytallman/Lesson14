package org.homework.ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

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

    }

    public static void Exercise1(){
        List<String> myArrayList = new ArrayList<String>();
        myArrayList.add("white");
        myArrayList.add("blue");
        myArrayList.add("yellow");

        System.out.println(myArrayList);
    }
    public static void Exercise2(){
        List<String> myArrayList = new ArrayList<String>();
        myArrayList.add("white");
        myArrayList.add("blue");
        myArrayList.add("yellow");

        for (String testString : myArrayList) {
            System.out.println(testString);
        }
    }
    public static void Exercise3(){
        List<String> myArrayList = new ArrayList<String>();
        myArrayList.add("white");
        myArrayList.add("blue");
        myArrayList.add("yellow");
        System.out.println(myArrayList);
        myArrayList.add(0, "gray");
        myArrayList.add(1,"navy-blue");
        System.out.println(myArrayList);
    }
    public static void Exercise4(){
        List<String> myArrayList = new ArrayList<String>();
        myArrayList.add("white");
        myArrayList.add("blue");
        myArrayList.add("yellow");
        System.out.println(myArrayList);
        String testString = myArrayList.get(2);
        String testString1 = myArrayList.get(0);
        System.out.println("Colour under index 2 is "+testString);
        System.out.println("Colour under index 0 is "+testString1);
    }
    public static void Exercise5(){
        List<String> myArrayList = new ArrayList<String>();
        myArrayList.add("white");
        myArrayList.add("blue");
        myArrayList.add("yellow");
        System.out.println(myArrayList);
        myArrayList.set(0, "gray");
        myArrayList.set(1, "navy-blue");
        myArrayList.set(2,"brown");
        System.out.println(myArrayList);
    }
    public static void Exercise6(){
        List<String> myArrayList = new ArrayList<String>();
        myArrayList.add("white");
        myArrayList.add("blue");
        myArrayList.add("yellow");
        System.out.println(myArrayList);
        System.out.println("List length before = "+"["+myArrayList.toArray().length+"]");
        myArrayList.remove(0);
        System.out.println(myArrayList);
        System.out.println("List length after = "+"["+myArrayList.toArray().length+"]");
    }
    public static void Exercise7(){
        List<String> myArrayList = new ArrayList<String>();
        myArrayList.add("white");
        myArrayList.add("blue");
        myArrayList.add("yellow");
        if (myArrayList.contains("white")){
            System.out.println("I found white element");
        }else {
            System.out.println("There is no white element in List");
        }
    }
    public static void Exercise8(){
        List<String> myArrayList = new ArrayList<String>();
        myArrayList.add(0,"white");
        myArrayList.add(1,"blue");
        myArrayList.add(2,"yellow");
        System.out.println("List before sorting "+myArrayList);
        Collections.sort(myArrayList);
        System.out.println("List after sorting due to Unicode "+myArrayList);

    }
    public static void Exercise9(){
        List<String> myArrayList = new ArrayList<String>();
        List<String> myArrayList2 = new ArrayList<String>();
        myArrayList.add("white");
        myArrayList.add("blue");
        myArrayList.add("yellow");

        myArrayList2.add("purple light");
        myArrayList2.add("navy blue");
        myArrayList2.add("coal black");

        System.out.println("List 1 before copying "+myArrayList);
        System.out.println("List 2 before copying "+myArrayList2);
        Collections.copy(myArrayList, myArrayList2);
        System.out.println("List 1 after copying "+myArrayList2);
        System.out.println("List 2 after copying "+myArrayList2);

    }
    public static void Exercise10(){
        List<String> myArrayList = new ArrayList<String>();
        myArrayList.add("white");
        myArrayList.add("blue");
        myArrayList.add("yellow");
        System.out.println("List before shuffle "+myArrayList);
        Collections.shuffle(myArrayList);
        System.out.println("List after shuffle "+myArrayList);

    }
    public static void Exercise11(){
        List<String> myArrayList = new ArrayList<String>();
        myArrayList.add("white");
        myArrayList.add("blue");
        myArrayList.add("yellow");
        System.out.println("List before reverse "+myArrayList);
        Collections.reverse(myArrayList);
        System.out.println("List after reverse "+myArrayList);

    }
    public static void Exercise12(){
        List<String> myArrayList = new ArrayList<String>();
        myArrayList.add("white");
        myArrayList.add("blue");
        myArrayList.add("yellow");
        myArrayList.add("purple");
        myArrayList.add("green");
        myArrayList.add("black");
        myArrayList.add("turquoise");

        System.out.println("Base List is "+myArrayList);
        List<String> myTestList = myArrayList.subList(0,4);
        System.out.println("List of only first 4 elements "+myTestList);
    }
    public static void Exercise13(){
        ArrayList<String> myArrayList = new ArrayList<String>();
        myArrayList.add("blue");
        myArrayList.add("turquoise");
        myArrayList.add("yellow");
        myArrayList.add("purple");

        ArrayList<String> myArrayList2 = new ArrayList<String>();
        myArrayList2.add("white");
        myArrayList2.add("black");
        myArrayList2.add("purple");

        ArrayList<String> myTestArrayList = new ArrayList<String>();
        for (String testString : myArrayList){
            myTestArrayList.add(myArrayList2.contains(testString) ? " Да " : " Нет ");
            System.out.print(myTestArrayList.get(myTestArrayList.size()-1));
        }
    }
    public static void Exercise14(){
        ArrayList<String> myArrayList = new ArrayList<String>();
        myArrayList.add("white");
        myArrayList.add("blue");
        myArrayList.add("yellow");
        myArrayList.add("turquoise");
        System.out.println("My arrayList before swap:" + myArrayList);
        Collections.swap(myArrayList, 1,3);
        System.out.println("My arrayList after swap:" + myArrayList);
    }
    public static void Exercise15(){
        ArrayList<String> myArrayList = new ArrayList<String>();
        ArrayList<String> myArrayList1 = new ArrayList<String>();
        ArrayList<String> myArrayList2 = new ArrayList<String>();

        myArrayList.add("white");
        myArrayList.add("blue");
        myArrayList.add("yellow");
        myArrayList.add("turquoise");
        System.out.println("First ArrayList: " + myArrayList);

        myArrayList1.add("black");
        myArrayList1.add("red");
        myArrayList1.add("green");
        myArrayList1.add("purple");
        System.out.println("Second ArrayList: " + myArrayList1);

        myArrayList2.addAll(myArrayList);
        myArrayList2.addAll(myArrayList1);
        System.out.println("Joined ArrayList: " + myArrayList2);
    }
    public static void Exercise16(){
        ArrayList<String> myArrayList = new ArrayList<String>();
        myArrayList.add("white");
        myArrayList.add("blue");
        myArrayList.add("yellow");
        myArrayList.add("turquoise");
        System.out.println("First ArrayList: " + myArrayList);
        ArrayList<String> arrayClone = (ArrayList<String>) myArrayList.clone();
        System.out.println("Cloned ArrayList: " + arrayClone);
    }
    public static void Exercise17(){
        ArrayList<String> myArrayList = new ArrayList<String>();
        myArrayList.add("white");
        myArrayList.add("blue");
        myArrayList.add("yellow");
        myArrayList.add("turquoise");
        System.out.println("First ArrayList: " + myArrayList);
        myArrayList.removeAll(myArrayList);
        System.out.println("ArrayList after cleaning "+myArrayList);
    }
    public static void Exercise18(){
        ArrayList<String> myArrayList = new ArrayList<String>();
        myArrayList.add("white");
        myArrayList.add("blue");
        myArrayList.add("yellow");
        myArrayList.add("turquoise");
        System.out.println("First ArrayList: " + myArrayList);
        System.out.println("Array is empty? "+myArrayList.isEmpty());
        myArrayList.removeAll(myArrayList);
        System.out.println("ArrayList after cleaning "+myArrayList);
        System.out.println("May be now Array is empty? "+myArrayList.isEmpty());
    }
    public static void Exercise19(){
        ArrayList<String> myArrayList = new ArrayList<String>(1000);
        myArrayList.add("white");
        myArrayList.add("blue");
        myArrayList.add("yellow");
        myArrayList.add("turquoise");
        System.out.println("Original ArrayList: " + myArrayList);
        myArrayList.trimToSize();
        System.out.println("ArrayList after triming "+myArrayList);
        System.out.println("Array capacity is "+myArrayList.size());
    }
    public static void Exercise20(){
        ArrayList<String> myArrayList = new ArrayList<String>(4);
        myArrayList.add("white");
        myArrayList.add("blue");
        myArrayList.add("yellow");
        myArrayList.add("turquoise");
        System.out.println("Original ArrayList: " + myArrayList);
        myArrayList.ensureCapacity(6);
        myArrayList.add("black");
        myArrayList.add("green");
        System.out.println("Ensured capacity ArrayList: " + myArrayList);
    }
    public static void Exercise21(){
        ArrayList<String> myArrayList = new ArrayList<String>();
        myArrayList.add("white");
        myArrayList.add("blue");
        System.out.println("Original ArrayList: " + myArrayList);
        String colour = "green";
        myArrayList.set(1,colour);
        int num = myArrayList.size();
        System.out.println("Replaced "+"blue"+" element with " +"green element");
        for (int i = 0; i<num; i++){
            System.out.println(myArrayList.get(i));
        }
    }
    public static void Exercise22(){
        ArrayList<String> myArrayList = new ArrayList<String>();
        myArrayList.add("white");
        myArrayList.add("blue");
        myArrayList.add("green");
        myArrayList.add("black");
        System.out.println("Original ArrayList: " + myArrayList);
        System.out.println("Print using index of elements: ");
        int size = myArrayList.size();
        for (int i = 0; i < size; i++){
            System.out.println(myArrayList.get(i));
        }
    }
}
