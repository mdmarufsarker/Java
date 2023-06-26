// https://www.codechef.com/problems/MANIPULATE

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for(int i = 0; i < t; i++) {
            int x, y;

            x = sc.nextInt();
            y = sc.nextInt();
            
            if(x >= y) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
