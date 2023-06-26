import java.util.*;

// Written by: Md. Maruf Sarker
// Platform: CodeChef
// Problem: https://www.codechef.com/LP0TO101/problems/FLOW013
// Language: java
// Date: 2023-02-02
// Difficulty Rating: 

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if (a + b + c == 180) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}