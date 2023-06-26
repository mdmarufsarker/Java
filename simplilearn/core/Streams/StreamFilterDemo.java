package Streams;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterDemo {
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

        List<String> filteredLanguages = new ArrayList<>();
        for(String language : languages) {
            if(language.startsWith("J")) {
                filteredLanguages.add(language);
            }
        }

        System.out.println(filteredLanguages); // [Java, JavaScript]


        // using stream --> Java 8
        List<String> filteredLanguages2 = languages.stream().filter(language -> language.startsWith("J")).collect(Collectors.toList());
        System.out.println(filteredLanguages2); // [Java, JavaScript]
    }
}
