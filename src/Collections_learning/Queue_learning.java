package Collections_learning;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_learning {
    public static void main(String[] args) {
        // Queue follows FIFO - First in first out
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10); queue.add(11); queue.add(12); queue.add(13);
        queue.offer(14);

        // add() - return true if the task is successful or throws an error
        // offer() - return true if successful or returns false - safe compare to add()
        // element() -  returns the head of the queue, if the queue is empty it will return an exception
        // peek() - returns the head of the queue, if the queue is empty it will returns null
        System.out.println("Using element function : "+ queue.element());
        System.out.println("Using peek function : "+ queue.peek());
        // remove() - returns and removes the head of the queue - if the returns exception if the queue is empty
        // poll() - returns and removes the head of the queue - if the returns null if the queue is empty
        // In Queue - to insert element use offer(), to access head use peek(), to remove use peek() to handle the exceptions automatically

        System.out.println("Using poll function - retuen and remove the head : "+ queue.poll());
        System.out.println("See the front element of the queue using peek : "+queue.peek());






    }
}
