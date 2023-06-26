package DataStructure;
import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<String> queue = new PriorityQueue<>();
        queue.add("B");
        queue.add("A");
        queue.add("C");
        queue.add("D");
        queue.add("E");
        System.out.println("Queue: " + queue); // [A, B, C, D, E]
        System.out.println("Queue size: " + queue.size()); // 5
        System.out.println("Queue peek: " + queue.peek()); // A
        System.out.println("Queue poll: " + queue.poll()); // A
        System.out.println("Queue: " + queue); // [B, D, C, E]
        System.out.println("Queue contains B: " + queue.contains("B")); // true
        System.out.println("Queue contains A: " + queue.contains("A")); // false
        System.out.println("Queue contains E: " + queue.contains("E")); // true
        System.out.println("Queue contains F: " + queue.contains("F")); // false
        queue.remove("B");
        System.out.println("Queue: " + queue); // [C, D, E]

        queue.clear();
        System.out.println("Queue: " + queue); // []
    }
}
