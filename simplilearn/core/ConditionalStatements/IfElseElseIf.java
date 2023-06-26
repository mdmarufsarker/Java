package ConditionalStatements;
import java.util.Scanner;

public class IfElseElseIf {
    public static void main(String[] args) {
        int mark;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your mark: ");
        mark = sc.nextInt();

        if(mark >= 0 && mark <= 100){
            if(mark >= 80 && mark <= 100)
                System.out.println("You got A+ grade");
            else if(mark >= 75 && mark <= 80)
                System.out.println("You got A grade");
            else if(mark >= 70 && mark <= 75)
                System.out.println("You got A- grade");
            else if(mark >= 65 && mark <= 70)
                System.out.println("You got B+ grade");
            else if(mark >= 60 && mark <= 65)
                System.out.println("You got B grade");
            else if(mark >= 55 && mark <= 60)
                System.out.println("You got B- grade");
            else if(mark >= 50 && mark <= 55)
                System.out.println("You got C+ grade");
            else if(mark >= 45 && mark <= 50)
                System.out.println("You got C grade");
            else if(mark >= 40 && mark <= 45)
                System.out.println("You got D grade");
            else
                System.out.println("You got F grade");
        }
    }
}
