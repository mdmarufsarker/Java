import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        int num;
        boolean isPrime;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        num = sc.nextInt();

        if(num < 2)
            isPrime = false;
        else
            isPrime = true;

        for(int i = 2; i <= num / i; i++){
            if((num % i) == 0){
                isPrime = false;
                break;
            }
        }

        if(isPrime)
            System.out.println("Prime");
        else
            System.out.println("Not Prime");
    }
}
