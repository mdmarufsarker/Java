# Thread Class and Runnable Interface

In Java, the Thread class and the Runnable interface are used to implement multithreading in a program. Here's an overview of how they work:

- The Thread class: The Thread class is a class in Java that represents a thread of execution. It provides methods for creating, starting, pausing, resuming, and stopping threads. To create a new thread using the Thread class, you can either extend the Thread class or pass an instance of a class that implements the Runnable interface to the Thread constructor. For example:

```java
// extending the Thread class
class MyThread extends Thread {
    public void run() {
        // code to be executed in the new thread
    }
}

MyThread thread = new MyThread();
thread.start();

// implementing the Runnable interface
class MyRunnable implements Runnable {
    public void run() {
        // code to be executed in the new thread
    }
}

Thread thread = new Thread(new MyRunnable());
thread.start();
```

In both examples, a new thread of execution is created, and the run() method is overridden to define the code to be executed in the new thread. The start() method is then called on the new thread to start its execution.

- The Runnable interface: The Runnable interface is an interface in Java that provides a way to define the code to be executed in a new thread of execution. To use the Runnable interface, you need to implement its run() method, which defines the code to be executed in the new thread. For example:

```java
class MyRunnable implements Runnable {
    public void run() {
        // code to be executed in the new thread
    }
}

MyRunnable runnable = new MyRunnable();
Thread thread = new Thread(runnable);
thread.start();
```

In this example, a new instance of MyRunnable is created, and its run() method is defined to execute the code to be executed in the new thread. The Thread constructor is then called with the MyRunnable instance as an argument, and the start() method is called on the new thread to start its execution.

In summary, the Thread class and the Runnable interface are used to implement multithreading in Java by creating and starting new threads of execution. By defining the code to be executed in a new thread using the run() method, you can execute multiple tasks concurrently in a program, improving its performance and responsiveness.
