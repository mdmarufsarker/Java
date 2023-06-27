class Factorial{
    long fact(int n){
        long result;

        if(n == 1) return 1;
        result = fact(n - 1) * n;
        return result;
    }
}
public class Recursion {
    public static void main(String[] args) {
        Factorial f = new Factorial();

        System.out.println("3! = " + f.fact(3));
        System.out.println("5! = " + f.fact(5));
    }
}
