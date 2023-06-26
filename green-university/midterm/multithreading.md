# Multithreading

Multithreading is the ability of a program to perform multiple tasks concurrently, allowing it to make better use of available system resources and improve performance. In Java, multithreading is implemented using the Thread class and the Runnable interface. Here's how multithreading works in Java:

- The Thread class: The Thread class is used to create a new thread of execution in a program. To create a new thread, you can either extend the Thread class or implement the Runnable interface. For example:

```java
class MyThread extends Thread {
    public void run() {
        // code to be executed in the new thread
    }
}

MyThread thread = new MyThread();
thread.start();
```

In this example, a new thread of execution is created by extending the Thread class and overriding the run() method. The start() method is then called on the new thread to start its execution.

- The Runnable interface: The Runnable interface is an alternative way to create a new thread of execution in Java. To use it, you can implement the Runnable interface and override the run() method. For example:

```java
class MyRunnable implements Runnable {
    public void run() {
        // code to be executed in the new thread
    }
}

Thread thread = new Thread(new MyRunnable());
thread.start();
```

In this example, a new thread of execution is created by implementing the Runnable interface and passing an instance of the class to the Thread constructor. The start() method is then called on the new thread to start its execution.

- Thread synchronization: When multiple threads are executing concurrently, it's possible for them to access shared resources simultaneously and cause problems. To prevent this, Java provides synchronization mechanisms, such as the synchronized keyword and the wait() and notify() methods. For example:

```java
class MyCounter {
    private int count = 0;
    
    public synchronized void increment() {
        count++;
    }
    
    public synchronized int getCount() {
        return count;
    }
}

MyCounter counter = new MyCounter();

// create multiple threads that access the counter object
```

In this example, the increment() and getCount() methods are synchronized to prevent multiple threads from accessing them simultaneously and causing errors.

By using multithreading in Java, you can improve the performance and responsiveness of your program, allowing it to execute multiple tasks concurrently. However, it's important to be aware of the potential issues that can arise when multiple threads access shared resources simultaneously, and use synchronization mechanisms to prevent them.
