// https://www.codechef.com/problems/CABS

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t;
        t = sc.nextInt();

        for(int i = 0; i < t; i++){
            int x, y;
            x = sc.nextInt();
            y = sc.nextInt();

            if(x < y) System.out.println("FIRST");
            else if(x > y) System.out.println("SECOND");
            else System.out.println("ANY");
        }
    }
}
