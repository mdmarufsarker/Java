package DataStructure;
import java.util.Stack;

// Stack is a class in java.util package. It is a subclass of Vector class. It implements the LIFO (Last In First Out) data structure. It is a legacy class. It is not recommended to use this class in new code. It is recommended to use Deque interface instead of this class. It is a collection of objects that are inserted and removed according to the last-in first-out principle. Stack is a data structure for storing a collection of objects. It is a simple data structure that allows adding and removing elements in a particular order. Every time an element is added, it goes on the top of the stack and the only element that can be removed is the element that is at the top of the stack, just like a pile of objects.
public class StackDemo {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("A");
        stack.push("B");
        stack.push("C");
        stack.push("D");
        stack.push("E");
        System.out.println("Stack: " + stack); // [A, B, C, D, E]
        System.out.println("Stack size: " + stack.size()); // 5
        System.out.println("Stack peek: " + stack.peek()); // E
        System.out.println("Stack pop: " + stack.pop()); // E
        System.out.println("Stack: " + stack); // [A, B, C, D]
        System.out.println("Stack search for B: " + stack.search("B")); // 3
        System.out.println("Stack search for A: " + stack.search("A")); // 4
        System.out.println("Stack search for E: " + stack.search("E")); // -1
        System.out.println("Stack search for F: " + stack.search("F")); // -1
        stack.remove("B");
        System.out.println("Stack: " + stack); // [A, C, D]

        stack.clear();
        System.out.println("Stack: " + stack); // []
    }
}