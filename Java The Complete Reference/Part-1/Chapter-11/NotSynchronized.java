// this program is not synchronized
class Callme1{
    void call(String msg){
        System.out.print("[" + msg);

        try{
            Thread.sleep(1000);
        }catch(InterruptedException err){
            System.out.println("Interrupted");
        }finally{
            System.out.println("]");
        }
    }
}

class Caller1 implements Runnable{
    String msg;
    Callme1 target;
    Thread t;

    public Caller1(Callme1 targ, String s){
        target = targ;
        msg = s;
        t = new Thread(this);
        t.start();
    }

    public void run(){
        target.call(msg);
    }
}

public class NotSynchronized {
    public static void main(String[] args) {
        Callme1 target = new Callme1();

        Caller1 ob1 = new Caller1(target, "Hello");
        Caller1 ob2 = new Caller1(target, "Synchronized");
        Caller1 ob3 = new Caller1(target, "World");

        // wait for threads to end
        try{
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        }catch(InterruptedException err){
            System.out.println("Interrupted");
        }
    }
}

/*
[Hello[World[Synchronized]
]
]
*/