package Streams;
import java.util.ArrayList;
import java.util.List;

// Stream reduce() method
// The reduce() method is used to reduce the elements of a stream to a single value.
// The reduce() method takes a BinaryOperator as a parameter.
// This operator is used to reduce the elements of the stream.
// The result of the reduction is an Optional holding the reduced value.
// The reduce() method can be used to compute the sum of all elements in a stream of numbers.
// The reduce() method can also be used to compute the maximum or minimum value in a stream of numbers.
// The reduce() method can be used to concatenate all elements in a stream of strings.
// The reduce() method can be used to compute the product of all elements in a stream of numbers.
public class StreamReduceDemo {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        // previous way
        int sum = 0;
        for(int number : numbers) {
            sum += number;
        }
        System.out.println(sum); // 15

        // using stream --> Java 8
        int sum2 = numbers.stream().reduce(0, (a, b) -> a + b);
        System.out.println(sum2); // 15
    }
}
