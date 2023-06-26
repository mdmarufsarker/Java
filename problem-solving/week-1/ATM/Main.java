// https://www.codechef.com/problems/HS08TEST

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        double y = sc.nextDouble();

        if((x % 5 == 0) && (y - x - 0.5 >= 0)) {
            System.out.println(String.format("%.2f", y - x - 0.5));
        } else {
            System.out.println(String.format("%.2f", y));
        }
    }
}
