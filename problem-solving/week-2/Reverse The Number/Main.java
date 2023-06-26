import java.util.Scanner;

// Written by: Md. Maruf Sarker
// Platform: codechef
// Problem: https://www.codechef.com/LP0TO101/problems/FLOW007
// Language: java
// Date: 2023-02-01
// Difficulty Rating: 

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for(int i = 0; i < t; i++){
            Long n = sc.nextLong();

            String s = n.toString();
            String reverse = "";

            for(int j = s.length() - 1; j >= 0; j--){
                reverse += s.charAt(j);
            }

            System.out.println(Long.parseLong(reverse));
        }
    }
}