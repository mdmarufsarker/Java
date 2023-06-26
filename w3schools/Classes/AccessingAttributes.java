package w3schools.Classes;

// jodi class er thaka kono variable er value override korte na chai tahole setar age final add krte hobe. It behaves like a constant variable. Another name of this keyword is modifier.

public class AccessingAttributes {
    int x = 5;
    final int y = 10;
    String fname = "Maruf";
    String lname = "Sarker";
    public static void main(String[] args) {
        AccessingAttributes myObj = new AccessingAttributes();
        System.out.println(myObj.x);
        myObj.x = 40;
        System.out.println(myObj.x);

        // myObj.y = 20; // error: cannot assign a value to final variable y
        System.out.println(myObj.y);


        System.out.println("Your name is " + myObj.fname + " " + myObj.lname);
    }
}