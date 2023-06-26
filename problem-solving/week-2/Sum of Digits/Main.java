import java.util.Scanner;

// Written by: Md. Maruf Sarker
// Platform: CodeChef
// Problem: https://www.codechef.com/LP0TO101/problems/FLOW006
// Language: java
// Date: 2023-01-31
// Difficulty Rating: 

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();

        for(int i = 0; i < t; i++){
            int n = sc.nextInt();
            int sum = 0;

            while(n > 0){
                sum += n % 10;
                n /= 10;
            }

            System.out.println(sum);
        }
    }
}