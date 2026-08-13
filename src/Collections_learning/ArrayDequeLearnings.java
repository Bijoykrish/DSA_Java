package Collections_learning;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class ArrayDequeLearnings {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.offer(10);
        deque.offer(40);
        deque.offerFirst(20);
        deque.offerLast(30);
        System.out.println("Print the Dequeue is : " +deque);
        System.out.println("Remove the last element using pollLast method: "+deque.pollLast());

        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Stack : "+stack); // printing the dequeue from the last - stack FIFO



    }
}
