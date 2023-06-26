import java.util.Arrays;

// Written by: Md. Maruf Sarker
// Platform: Linux Mint 19.3
// Problem: Call by Reference
// Language: java
// Date: 2023-03-24

public class CallByReference {
    public static void changeArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] += 3;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println("Before calling method: " + Arrays.toString(arr)); // prints [1, 2, 3]
        changeArray(arr);
        System.out.println("After calling method: " + Arrays.toString(arr)); // prints [4, 5, 6]
    }
}
/*
In the example above, we have a method called "changeArray" that takes an integer array parameter "a" and adds 3 to each element of the array. In the "main" method of the "Main" class, we declare an integer array "arr" and initialize it with values {1, 2, 3}. We then call the "changeArray" method with "arr" as the argument, and the values of "arr" are changed to {4, 5, 6} because it was passed by reference to the method.
 */