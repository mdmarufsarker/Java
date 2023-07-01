// package Interface;

public class Client implements Callback{
    public void callback(int p){
        System.out.println("callback called with " + p);
    }
    void nonIfacemeth(){
        System.out.println("Classes that implement interfaces " + 
                            "may also define other members, too");
    }
}
