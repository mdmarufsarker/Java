package AccessModifier;

public class AccessModifierDemo {
    // public access modifier
    public int publicVar = 10;
    // private access modifier
    private int privateVar = 20;
    // protected access modifier
    protected int protectedVar = 30;
    // default access modifier
    int defaultVar = 40;

    public static void main(String[] args) {
        AccessModifierDemo obj = new AccessModifierDemo();
        System.out.println("Public variable: " + obj.publicVar);
        System.out.println("Private variable: " + obj.privateVar);
        System.out.println("Protected variable: " + obj.protectedVar);
        System.out.println("Default variable: " + obj.defaultVar);
    }
}
