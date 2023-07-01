/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p1;

/**
 *
 * @author maruf
 */
class SamePackage {
    SamePackage(){
        Protection p = new Protection();
        System.out.println("same pacakge constructor");
        System.out.println("n = " + p.n);
        
        // class only
        // System.out.println("n_pri = " + n_pri);
        
        System.out.println("n_pro = " + p.n_pro);
        System.out.println("n_pub = " + p.n_pub);
    }
}
