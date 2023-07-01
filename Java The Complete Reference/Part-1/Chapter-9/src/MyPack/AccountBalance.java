/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MyPack;

/**
 *
 * @author maruf
 */

class Balance{
    String name;
    double bal;
    
    Balance(String n, double b){
        name = n;
        bal = b;
    }
    
    void show(){
        if(bal < 0){
            System.out.println("--> ");
        }
        
        System.out.println(name + ": $" + bal);
    }
}

public class AccountBalance {
    public static void main(String[] args) {
        Balance current[] = new Balance[3];
        
        current[0] = new Balance("K. J. Fielding", 123.23);
        current[1] = new Balance("Wukk Tell", 157.02);
        current[2] = new Balance("Tom Jackson", -12.33);
        
        for(int i = 0; i < 3; i++){
            current[i].show();
        }
    }
}
