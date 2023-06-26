package ConditionalStatements;
import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        int mark;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your mark: ");
        mark = sc.nextInt();

        switch(mark / 10) {
            case 10:
            case 9:
                System.out.println("You got A+ grade");
                break;
            case 8:
                System.out.println("You got A grade");
                break;
            case 7:
                System.out.println("You got A- grade");
                break;
            case 6:
                System.out.println("You got B+ grade");
                break;
            case 5:
                System.out.println("You got B grade");
                break;
            case 4:
                System.out.println("You got B- grade");
                break;
            case 3:
                System.out.println("You got C+ grade");
                break;
            case 2:
                System.out.println("You got C grade");
                break;
            case 1:
                System.out.println("You got D grade");
                break;
            default:
                System.out.println("You got F grade");
        }
    }
}
