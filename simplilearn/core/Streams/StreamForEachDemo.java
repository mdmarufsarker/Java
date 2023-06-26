package Streams;
import java.util.ArrayList;
import java.util.List;

public class StreamForEachDemo {
    public static void main(String[] args) {
        List<String> languages = new ArrayList<>();

        languages.add("Java");
        languages.add("Python");
        languages.add("JavaScript");
        languages.add("C++");
        languages.add("C#");
        languages.add("Ruby");
        languages.add("PHP");
        languages.add("Go");

        // previous way
        for(String language : languages) {
            System.out.println(language); // Java, Python, JavaScript, C++, C#, Ruby, PHP, Go
        }

        // using stream --> Java 8
        languages.stream().forEach(language -> {
            System.out.println(language); // Java, Python, JavaScript, C++, C#, Ruby, PHP, Go
        });
    }
}
