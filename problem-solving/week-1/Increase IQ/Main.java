// https://www.codechef.com/problems/INCRIQ

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        n = sc.nextInt();

        if(n + 7 > 170) System.out.println("YES");
        else System.out.println("NO");
    }
}
