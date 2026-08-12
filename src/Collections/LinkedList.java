package Collections;

import java.util.List;

public class LinkedList {
    public static void main(String[] args) {
        // stored in the linked node format - 3 - previous node refer, value, next refer
        List<Integer> list = new java.util.LinkedList<>();
        // It will have all the methods same as the array list
        // 1. lastIndexOf()


        list.add(20); list.add(30);  list.add(40); list.add(30);
        System.out.println("The values of the linked list is : "+ list);
        System.out.println("Index of 30 from the list is : "+ list.indexOf(30));
        System.out.println("Last Index of 30 from the list is : "+ list.lastIndexOf(30));







    }
}
