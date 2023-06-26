package TryCatch;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TryCatchExceptions {
    public void writeList() {
        PrintWriter out = null;
        final int SIZE = 10;
        int[] list = new int[SIZE];

        for (int i = 0; i < SIZE; i++) {
            list[i] = i;
        }
    
        try {
            System.out.println("Entering" + " try statement");
    
            out = new PrintWriter(new FileWriter("OutFile.txt"));
            for (int i = 0; i < SIZE; i++) {
                out.println("Value at: " + i + " = " + list[i]);
            }
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Caught IndexOutOfBoundsException: "
                               +  e.getMessage());
                                     
        } catch (IOException e) {
            System.err.println("Caught IOException: " +  e.getMessage());
                                     
        } finally {
            if (out != null) {
                System.out.println("Closing PrintWriter");
                out.close();
            } 
            else {
                System.out.println("PrintWriter not open");
            }
        }
    }
}