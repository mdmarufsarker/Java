// https://www.codechef.com/problems/COURSEREG

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t;
        t = sc.nextInt();

        for(int i = 0; i < t; i++){
            int x, y, z;
            x = sc.nextInt();
            y = sc.nextInt();
            z = sc.nextInt();

            if(y - z >= x) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
