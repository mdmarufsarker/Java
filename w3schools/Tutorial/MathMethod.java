package w3schools.Tutorial;

public class MathMethod {
    public static void main(String[] args) {
        System.out.println(Math.max(5, 10));
        System.out.println(Math.min(5, 10));
        System.out.println(Math.sqrt(64));
        System.out.println(Math.abs(-4.7));
        System.out.println(Math.random());
        int randomNum = (int)(Math.random() * 101);  // 0 to 100
        System.out.println(randomNum);
    }
}
/*
    10
    5
    8.0
    4.7
    0.5774375732509782
    27
 */
