# Using final with inheritance

In Java, the final keyword can be used in conjunction with inheritance in a couple of different ways:

- Final class: A class can be marked as final to prevent it from being subclassed. In other words, if a class is marked as final, it cannot be extended by any other class. For example:

```java
final class Vehicle {
    // class implementation
}
```

In this example, the Vehicle class is marked as final, so it cannot be extended by any other class.

- Final method: A method can be marked as final to prevent it from being overridden by any subclass. In other words, if a method is marked as final, it cannot be modified by any subclass that extends the class. For example:

```java
class Animal {
    public final void eat() {
        // method implementation
    }
}

class Dog extends Animal {
    // this will result in a compiler error
    public void eat() {
        // method implementation
    }
}
```

In this example, the Animal class contains a method eat() that is marked as final. When the Dog class attempts to override this method, a compiler error will be generated because it is marked as final.

It's important to note that if a class is marked as final, it cannot be subclassed and therefore cannot be extended. If a method is marked as final, it cannot be overridden by any subclass, but the subclass can still call the method from its superclass.

Using the final keyword in this way can help prevent unintended modifications to classes or methods, which can improve the reliability and stability of your code.
