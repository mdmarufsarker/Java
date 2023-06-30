class NewThread implements Runnable{
    Thread t;

    NewThread(){
        // create a new 2nd thread
        t = new Thread(this, "Demo Thread");
        System.out.println("Child Thread: " + t);
        t.start();
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

class ThreadDemo1 {
    public static void main(String[] args) {
        new NewThread(); // create a new thread

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
Child Thread: Thread[Demo Thread,5,main]
Main Thread: 5
Child Thread: 5
Child Thread: 4
Main Thread: 4
Child Thread: 3
Child Thread: 2
Main Thread: 3
Child Thread: 1
Exiting child thread
Main Thread: 2
Main Thread: 1
Main thread exiting
*/