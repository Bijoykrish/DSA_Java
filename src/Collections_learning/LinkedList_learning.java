package Collections_learning;


import java.util.LinkedList;

public class LinkedList_learning {
    public static void main(String[] args) {
        // stored in the linked node format - 3 - previous node refer, value, next refer
        //LinkedList list = new LinkedList<Integer>();
        LinkedList<Integer> list = new LinkedList();
        // It will have all the methods same as the array list
        // 1. lastIndexOf() - list.lastIndexOf(value); -- it will return the last value from the linked list
        //2. addLast() addFirst() -- add the element in the first of the list
        //3. removeLast() and removeFirst() - it removes the last and the first element of the list
        //4. getFirst() and getlast() - it fetch the first and the last element of the list
        // addFirst, addLast, removeFirst, removeLast are the linked list specific methods
        //5. peek() - it will return the starting element of the list
        //6. pool() - it will return the first element of list and also removes it from the list



        list.add(20); list.add(30);  list.add(40); list.add(30);
        System.out.println("The values of the linked list is : "+ list);
        System.out.println("Index of 30 from the list is : "+ list.indexOf(30));
        System.out.println("Last Index of 30 from the list is : "+ list.lastIndexOf(30));
        System.out.println("The elements in the lists are : "+list);
        list.addFirst(11);
        System.out.println("Add the element at the first of the list : "+list);
        System.out.println("The elements in the lists are : "+list);
        list.addLast(40);
        System.out.println("Add the element at the last of the list : "+list);
        // peek - returns the first element from the list
        System.out.println("Using the peek function : "+ list.peek());
        // pool - returns and removes the first element of the list
        System.out.println("List Before the Poll : "+ list);
        System.out.println("Using the pool function : "+ list.poll());
        System.out.println("List after the Poll : "+ list);









    }
}
