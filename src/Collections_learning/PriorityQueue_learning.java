package Collections_learning;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueue_learning {
    public static void main(String[] args) {
        // Here the queue works according to the priority not in a order
        // Default behaviour -> for integer - less the value more the priority --> minHeap
        // Convert the minHeap to maxHeap using a,b->b-a   Queue<Integer> priority = new PriorityQueue<>((a,b)->a-b));
        // maxHeap -> High value - high priority


        Queue<Integer> priority = new PriorityQueue<>();
        priority.offer(50); priority.offer(70); priority.offer(10); priority.offer(15);
        System.out.println(priority);
        System.out.println("using poll : "+priority.poll());


    }
}
