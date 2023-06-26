// https://www.codechef.com/problems/INTEST

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n, k;
        n = sc.nextInt();
        k = sc.nextInt();

        int count = 0;
        for (int i = 0; i < n; i++) {
            int t = sc.nextInt();
            if (t % k == 0) {
                count++;
            }
        }

        System.out.println(count);
    }
}
