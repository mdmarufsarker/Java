package Streams;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamDemo {
    public static void main(String[] args) {
        // previous way
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);

        // task is to print the square of each element
        List<Integer> newList = new ArrayList<>();
        for (Integer i : list) {
            newList.add(i * i);
        }
        System.out.println(newList); // [1, 4, 9, 16, 25, 36, 49, 64, 81, 100]

        // using stream --> Java 8
        List<Integer> squareList = list.stream().map(i -> i * i).collect(Collectors.toList());
        System.out.println(squareList); // [1, 4, 9, 16, 25, 36, 49, 64, 81, 100]

        // list = 1 2 3 4 5 6 7 8 9 10
        Set<Integer> squareSet = list.stream().map(i -> i * i).collect(Collectors.toSet());
        System.out.println(squareSet); // [16, 64, 1, 49, 81, 4, 36, 100, 9, 25]


        // task is to print the even numbers
        List<Integer> evenList = new ArrayList<>();
        for (Integer i : list) {
            if (i % 2 == 0) {
                evenList.add(i);
            }
        }

        System.out.println(evenList); // [2, 4, 6, 8, 10]


        // using stream --> Java 8
        List<Integer> evenList2 = list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(evenList2); // [2, 4, 6, 8, 10]

        List<Integer> oddList = list.stream().filter(i -> i % 2 != 0).collect(Collectors.toList());
        System.out.println(oddList); // [1, 3, 5, 7, 9]
    }
}
