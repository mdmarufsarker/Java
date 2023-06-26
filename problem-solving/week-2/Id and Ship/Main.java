import java.util.*;

// Written by: Md. Maruf Sarker
// Platform: CodeChef
// Problem: https://www.codechef.com/LP0TO101/problems/FLOW010
// Language: java
// Date: 2023-02-02
// Difficulty Rating: 

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            String s = sc.next();
            if (s.equals("B") || s.equals("b")) System.out.println("BattleShip");
            else if (s.equals("C") || s.equals("c")) System.out.println("Cruiser");
            else if (s.equals("D") || s.equals("d")) System.out.println("Destroyer");
            else if (s.equals("F") || s.equals("f")) System.out.println("Frigate");
        }
    }
}