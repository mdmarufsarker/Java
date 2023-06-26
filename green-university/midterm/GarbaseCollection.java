import java.util.*;

// Written by: Md. Maruf Sarker
// Platform: Linux
// Problem: Garbase Collection
// Language: java
// Date: 2023-03-24

// In Java, garbage collection is the process of automatically freeing up memory that is no longer being used by the program. It is an important feature of the language that helps to manage memory efficiently and avoid memory leaks.

class MyGarbaseCollectorClass {
    private int[] data;
    
    public MyGarbaseCollectorClass() {
        // allocate some memory for the object
        data = new int[10000];
    }
    
    public void doSomething() {
        // do some stuff with the object
    }
    
    @Override
    protected void finalize() throws Throwable {
        // override the finalize method to do some cleanup
        // this will be called by the garbage collector before the object is destroyed
        System.out.println("Object is being destroyed");
        super.finalize();
    }
}

public class GarbaseCollection {
    public static void main(String[] args) {
        // create an object and assign it to a variable
        MyGarbaseCollectorClass myObj = new MyGarbaseCollectorClass();
        
        // do some stuff with the object
        myObj.doSomething();
        
        // set the variable to null, releasing the reference to the object
        myObj = null;
        
        // call garbage collection explicitly
        System.gc();
    }
}
/* 
In the example above, we have a class called "MyGarbaseCollectorClass" that has an instance variable "data" which is an array of integers. In the constructor, we allocate some memory for the object by creating an array of size 10000.

In the "main" method, we create an instance of "MyGarbaseCollectorClass" and assign it to the variable "myObj". We then call the "doSomething()" method to do some stuff with the object.

After we're done with the object, we set the "myObj" variable to null. This releases the reference to the object, making it eligible for garbage collection.

We then call the "System.gc()" method to explicitly request garbage collection. This is not necessary in most cases, as the garbage collector will run automatically when needed, but it can be useful in certain situations.

Finally, we have overridden the "finalize()" method in "MyGarbaseCollectorClass" to do some cleanup before the object is destroyed by the garbage collector. In this case, we are just printing a message to the console.

When the program runs, the "finalize()" method will be called before the object is destroyed by the garbage collector, and we should see the message "Object is being destroyed" printed to the console.
*/