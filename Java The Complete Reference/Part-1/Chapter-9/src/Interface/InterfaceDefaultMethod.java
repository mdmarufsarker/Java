interface MyInterface{
    // This is a normal interface method declaration
    // It does not define a default implementation
    int getNumber();

    // This is a default method. Notice that it provides a default implementation
    default String getString(){
        return "Default String";
    }
}

public class InterfaceDefaultMethod implements MyInterface{
    // Only getNumber() defined by MyInterface need to be implemented
    // getString() can be allowed to default

    public int getNumber(){
        return 100;
    }
    public static void main(String[] args) {
        InterfaceDefaultMethod obj = new InterfaceDefaultMethod();

        // can call getNumber() because it is explicitly implemented by InterfaceDefaultMethod
        System.out.println(obj.getNumber());

        // can also call getString(), because of default implementation
        System.out.println(obj.getString());
    }
}
