/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p2;

/**
 *
 * @author maruf
 */
public class OtherPackage {
    OtherPackage(){
        p1.Protection p = new p1.Protection();
        System.out.println("other package constructor");
        
        // class or package only
        // System.out.println("n = " + p.n);
        
        // class only
        // System.out.println("n_pri = " + p.n_pri);
        
        // class, subclass or package only
        // System.out.println("n_pro = " + p.n_pro);
        
        System.out.println("n_pub = " + p.n_pub);
    }
}
