class aa{
    final void meth(){
        System.out.println("This is a final method");
    }
}

class bb extends aa{
    void meth(){ // meth() in bb cannot override meth() in aa
        overridden method is final
        System.out.println("Illegal!");
    }
}

public class PreventOverriding {
    public static void main(String[] args) {
        
    }
}
