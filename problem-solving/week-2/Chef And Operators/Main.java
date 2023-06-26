import java.util.Scanner;

// Written by: Md. Maruf Sarker
// Platform: codechef
// Problem: https://www.codechef.com/LP0TO101/problems/CHOPRT
// Language: java
// Date: 2023-02-01
// Difficulty Rating: 

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for(int i = 0; i < t; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            if(a > b){
                System.out.println(">");
            } else if(a < b){
                System.out.println("<");
            } else {
                System.out.println("=");
            }
        }
    }
}