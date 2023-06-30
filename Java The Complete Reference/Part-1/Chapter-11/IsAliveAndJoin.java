// using join() to wait for threads to finish
class NeewThreadd implements Runnable{
    String name; // name of thread
    Thread t;

    NeewThreadd(String threadName){
        name = threadName;
        t = new Thread(this, name);

        System.out.println("New Thread: " + t);
        t.start(); // start the thread
    }

    // this is the entry point for thread
    public void run(){
        try{
            for(int i = 5; i > 0; i--){
                System.out.println("name: " + i);
                Thread.sleep(1000);
            }
        }catch(InterruptedException err){
            System.out.println(name + "Interrupted");
        }
        System.out.println(name + "Exiting");
    }
}

public class IsAliveAndJoin {
    public static void main(String[] args) {
        NeewThreadd ob1 = new NeewThreadd("One");
        NeewThreadd ob2 = new NeewThreadd("Two");
        NeewThreadd ob3 = new NeewThreadd("Three");

        System.out.println("Thread one is alive: " + ob1.t.isAlive());
        System.out.println("Thread two is alive: " + ob2.t.isAlive());
        System.out.println("Thread three is alive: " + ob3.t.isAlive());

        // wait for threads to finish
        try{
            System.out.println("Waiting for threads to finish");
            ob1.t.join(0);
            ob2.t.join(0);
            ob3.t.join(0);
        }catch(InterruptedException err){
            System.out.println("Main thread interrupted");
        }

        System.out.println("Thread one is alive: " + ob1.t.isAlive());
        System.out.println("Thread two is alive: " + ob2.t.isAlive());
        System.out.println("Thread three is alive: " + ob3.t.isAlive());

        System.out.println("Main thread exiting");
    }
}

/*
New Thread: Thread[One,5,main]
New Thread: Thread[Two,5,main]
New Thread: Thread[Three,5,main]
Thread one is alive: true
Thread two is alive: true
Thread three is alive: true
Waiting for threads to finish
name: 5
name: 5
name: 5
name: 4
name: 4
name: 4
name: 3
name: 3
name: 3
name: 2
name: 2
name: 2
name: 1
name: 1
name: 1
OneExiting
ThreeExiting
TwoExiting
Thread one is alive: false
Thread two is alive: false
Thread three is alive: false
Main thread exiting
*/