// Written by: Md. Maruf Sarker
// Platform: Linux
// Problem: Java Constructor
// Language: java
// Date: 2023-03-24

public class Constructor {
    Constructor() {
        System.out.println("No parameter constructor");
    }
    Constructor(int a) {
        System.out.println("One parameter constructor");
    }
    Constructor(int a, int b) {
        System.out.println("Two parameter constructor");
    }
    Constructor(int a, int b, int c) {
        System.out.println("Three parameter constructor");
    }
    public static void main(String[] args) {
        Constructor c1 = new Constructor();
        Constructor c2 = new Constructor(1);
        Constructor c3 = new Constructor(1, 2);
        Constructor c4 = new Constructor(1, 2, 3);
    }
}
// No parameter constructor
// One parameter constructor
// Two parameter constructor
// Three parameter constructor