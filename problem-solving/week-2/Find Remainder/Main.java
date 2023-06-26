import java.util.Scanner;

// Written by: Md. Maruf Sarker
// Platform: Java
// Problem: https://www.codechef.com/LP0TO101/problems/FLOW002
// Language: java
// Date: 2023-01-31
// Difficulty Rating: 

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for(int i = 0; i < t; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.println(a % b);
        }
    }
}