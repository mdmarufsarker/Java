package Array;
import java.util.*;

public class ArrList {
    public static void main(String[] args) {
        // List<Integer> numbers = new ArrayList<Integer>(5);
        List<Integer> numbers = new ArrayList<>();

        for(int i = 1; i <= 5; i++) {
            numbers.add(i);
        }
        numbers.remove(2);

        for(int number : numbers) {
            System.out.println(number);
        }

        for(int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        System.out.println(numbers);
    }
}