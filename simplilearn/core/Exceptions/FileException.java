package Exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileException {
    // checked exceptions or called compile time exceptions
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileReader file = new FileReader("Demo.java");
        BufferedReader fileInput = new BufferedReader(file);

        for (int counter = 0; counter < 3; counter++)
            System.out.println(fileInput.readLine());

        fileInput.close();
    }
}
