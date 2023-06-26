import java.util.*;

// Written by: Md. Maruf Sarker
// Platform: CodeChef
// Problem: https://www.codechef.com/LP0TO101/problems/FLOW004
// Language: java
// Date: 2023-02-02
// Difficulty Rating: 

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int last = n % 10;
            int first = 0;
            while (n > 0) {
                first = n % 10;
                n /= 10;
            }
            System.out.println(first + last);
        }
    }
}