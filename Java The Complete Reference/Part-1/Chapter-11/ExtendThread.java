// create a 2nd thread by extending thread
class NewThreadd extends Thread{
    NewThreadd(){
        // create a new 2nd thread
        super("Demo thread");
        System.out.println("Child thread: " + this);
        start(); // start the thread
    }

    // this is the entry point for the 2nd thread
    public void run(){
        try{
            for(int i = 5; i > 0; i--){
                System.out.println("Child Thread: " + i);
                Thread.sleep(500);
            }
        }catch(InterruptedException err){
            System.out.println("Child Interrupted");
        }
        System.out.println("Exiting child thread");
    }
}

public class ExtendThread {
    public static void main(String[] args) {
        new NewThreadd();

        try{
            for(int i = 5; i > 0; i--){
                System.out.println("Main Thread: " + i);
                Thread.sleep(1000);
            }
        }catch(InterruptedException err){
            System.out.println("Main thread interrupted");
        }
        System.out.println("Main thread exiting");
    }
}

/*
Child thread: Thread[Demo thread,5,main]
Child Thread: 5
Main Thread: 5
Child Thread: 4
Child Thread: 3
Main Thread: 4
Child Thread: 2
Child Thread: 1
Main Thread: 3
Exiting child thread
Main Thread: 2
Main Thread: 1
Main thread exiting
*/