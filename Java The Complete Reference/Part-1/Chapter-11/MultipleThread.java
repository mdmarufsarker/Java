// create multiple thread
class NeewThread implements Runnable{
    String name; // name of thread
    Thread t;

    NeewThread(String threadName){
        name = threadName;
        t = new Thread(this, name);

        System.out.println("New Thread: " + t);
        t.start();
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

public class MultipleThread {
    public static void main(String[] args) {
        new NeewThread("One"); // start thread
        new NeewThread("Two");
        new NeewThread("Three");

        try{
            // wait for other threads to end
            Thread.sleep(10000);
        }catch(InterruptedException err){
            System.out.println("Main thread Interrupted");
        }finally{
            System.out.println("Main thread exiting");
        }
    }
}

/*
New Thread: Thread[One,5,main]
New Thread: Thread[Two,5,main]
New Thread: Thread[Three,5,main]
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
TwoExiting
OneExiting
ThreeExiting
Main thread exiting
*/