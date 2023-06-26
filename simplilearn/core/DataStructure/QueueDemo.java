package DataStructure;
import java.util.LinkedList;
import java.util.Queue;

// Queue is an interface in java.util package. It is a collection of objects that are inserted and removed according to the first-in first-out principle. Queue is a data structure for storing a collection of objects. It is a simple data structure that allows adding and removing elements in a particular order. Every time an element is added, it goes to the tail of the queue and the only element that can be removed is the element that is at the head of the queue, just like a line of people waiting to buy tickets.
public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("A");
        queue.add("B");
        queue.add("C");
        queue.add("D");
        queue.add("E");
        System.out.println("Queue: " + queue); // [A, B, C, D, E]
        System.out.println("Queue size: " + queue.size()); // 5
        System.out.println("Queue peek: " + queue.peek()); // A
        System.out.println("Queue poll: " + queue.poll()); // A
        System.out.println("Queue: " + queue); // [B, C, D, E]
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
