package Collections_learning;

import java.util.List;
import java.util.Stack;

public class Stack_learning {
    public static void main(String[] args) {
        // Stack - LIFO - last in first out - implements the list interface so the index will be from the last
        // if 3 elements then the index will be 2,1,0.
        Stack<Integer> stack = new Stack<>();
        stack.add(10); stack.add(20); stack.add(30); stack.add(40);
        System.out.println("printing the stack : "+stack);
        //1. push - to add element in the stack
        //2. pop -- to remove the last element from the stack
        //3. peek -- seeing the elements from the top i.e., the last element order is LIFO - plates are arranged
        //4. search -- search an element in the stack returns -1 for the false and index value for True
        //5. empty-- checks the stack is empty or not - returns true and false if the no element in the stack
        stack.push(45);
        System.out.println("Elements in the stack after the push : " +stack);
        stack.pop();
        System.out.println("Elements after the pop operation : "+ stack);
        System.out.println("Element at peek : "+ stack.peek());
        System.out.println("Search 40 in the stack : "+stack.search(40));
        System.out.println("Is the stack is Empty? : "+ stack.empty());

    }
}
