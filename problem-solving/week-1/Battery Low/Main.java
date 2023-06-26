// https://www.codechef.com/problems/BATTERYLOW

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t;
        t = sc.nextInt();

        for(int i = 0; i < t; i++){
            int n;
            n = sc.nextInt();

            if(n <= 15) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
