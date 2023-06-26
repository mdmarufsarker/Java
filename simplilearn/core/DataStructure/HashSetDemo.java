package DataStructure;
import java.util.HashSet;

// HashSet is a collection that cannot contain duplicate elements. It is an implementation of the Set interface. It is an unordered collection.
public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        // add() method
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("D");
        set.add("E");
        System.out.println(set); // [A, B, C, D, E]

        // remove() method
        set.remove("B");
        System.out.println(set); // [A, C, D, E]

        // contains() method
        System.out.println(set.contains("A")); // true
        System.out.println(set.contains("B")); // false

        // size() method
        System.out.println(set.size()); // 4

        // isEmpty() method
        System.out.println(set.isEmpty()); // false

        // clear() method
        set.clear();
        System.out.println(set); // []
        System.out.println(set.isEmpty()); // true
    }
}
