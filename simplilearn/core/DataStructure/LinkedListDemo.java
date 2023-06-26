package DataStructure;
import java.util.LinkedList;

// LinkedList is a collection that can contain duplicate elements.
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        // add() method
        list.add("A");
        list.add("B");
        System.out.println(list);

        list.addLast("C");
        System.out.println(list);

        list.addFirst("D");
        System.out.println(list);

        list.add(2, "E");
        System.out.println(list);

        // [A, B]
        // [A, B, C]
        // [D, A, B, C]
        // [D, A, E, B, C]

        System.out.print(list.get(1)); // A
        System.out.print(list.indexOf("A")); // 1
        System.out.print(list.lastIndexOf("B")); // 3

        System.out.print(list.peek()); // D
        System.out.print(list.peekFirst()); // D
        System.out.print(list.peekLast()); // C
        System.out.println(list); // [D, A, E, B, C]

        System.out.print(list.poll()); // D
        System.out.print(list.pollFirst()); // A
        System.out.print(list.pollLast()); // C
        System.out.println(list); // [E, B]

        System.out.print(list.pop()); // E
        System.out.println(list); // [B]
        
        // A13DDCDACE[B]

        // remove() method
        list.remove("B");
        System.out.println(list);

        list.remove(3);
        System.out.println(list);

        list.removeFirst();
        System.out.println(list);

        list.removeLast();
        System.out.println(list);

        // [D, A, E, B, C]
        // [D, A, E, C]
        // [D, A, E]
        // [A, E]
        // [A]
    }
}
