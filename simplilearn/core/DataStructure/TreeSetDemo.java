package DataStructure;
import java.util.TreeSet;

// TreeSet is a collection that cannot contain duplicate elements. It is an implementation of the Set interface. It is a sorted set that orders its elements according to their natural ordering, or by a Comparator provided at set creation time.

// sorting algorithm used by TreeSet is called a red-black tree. It is a self-balancing binary search tree. It is a binary tree where every node has a color, either red or black. The root node is always black. The color of the children of a red node is always black. The number of black nodes on every path from the root node to a leaf node is the same. The path from the root node to the farthest leaf node is no more than twice as long as the path from the root node to the nearest leaf node.
public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();

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
