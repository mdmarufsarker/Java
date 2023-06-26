package Streams;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSortDemo {
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

        List<String> sortedLanguages1 = new ArrayList<>();
        for(String language : languages) {
            sortedLanguages1.add(language);
        }
        Collections.sort(sortedLanguages1);

        System.out.println(sortedLanguages1); // [C#, C++, Go, Java, JavaScript, PHP, Python, Ruby]

        // using stream --> Java 8
        List<String> sortedLanguages2 = languages.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedLanguages2); // [C#, C++, Go, Java, JavaScript, PHP, Python, Ruby]
    }
}
