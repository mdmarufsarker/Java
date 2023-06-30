/*
Create a program that simulates a banking system. The program should handle exceptions related to insufficient funds during a withdrawal transaction. Implement a class called BankAccount with a balance field and two methods: withdraw() and getBalance(). The withdraw() method should accept an amount as a parameter and deduct that amount from the balance if sufficient funds are available. If the withdrawal amount exceeds the balance, it should throw a custom exception called InsufficientFundsException. The getBalance() method should return the current balance. Create a Main class that demonstrates the usage of the BankAccount class, including handling the InsufficientFundsException and displaying an appropriate error message.
*/

import java.util.Scanner;

class InsufficientFundsException extends Exception{
    public InsufficientFundsException(){
        super("Tui Gorib :D");
    }
}

class BankAccount{
    private double balance;
    public BankAccount(double balance){
        this.balance = balance;
    }

    public double getBalance(){
        return balance;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if(amount > balance) {
            throw new InsufficientFundsException();
        }
        balance -= amount;
        System.out.println("Withdrawal successful");
        System.out.println("Current balance: " + balance);
    }
}

public class CustomException2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            BankAccount account = new BankAccount(1000);
            System.out.print("Enter amount to withdraw: ");
            double amount = sc.nextDouble();
            account.withdraw(amount);
        }catch(InsufficientFundsException err) {
            System.out.println(err.getMessage());
        }
        sc.close();
    }
}