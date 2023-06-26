# Interface

In Java, an interface is a type that defines a set of methods (and possibly constants) without providing any implementation. An interface can be implemented by a class, which provides the implementation for the methods defined in the interface. This allows for the creation of classes with different implementations of the same interface, allowing for flexibility and extensibility in the design of a program.

Here's an example of how to define an interface in Java:

```java
public interface Drawable {
    public void draw();
}
```

In this example, we define an interface called Drawable that has one method called draw(). The public keyword indicates that this interface can be accessed from outside the package in which it is defined.

Now let's create a class that implements this interface:

```java
public class Circle implements Drawable {
    private int x, y, radius;

    public Circle(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public void draw() {
        System.out.println("Drawing circle at (" + x + ", " + y + ") with radius " + radius);
    }
}
```

In this example, we define a class called Circle that implements the Drawable interface. This means that it must provide an implementation for the draw() method defined in the interface. In this implementation, we simply print out a message indicating that we are drawing a circle at a specific location with a specific radius.

Now we can create an instance of this class and call its draw() method:

```java
Circle c = new Circle(0, 0, 10);
c.draw(); // Output: Drawing circle at (0, 0) with radius 10

```

In this example, we create a new Circle object with a center at (0, 0) and a radius of 10. We then call its draw() method, which outputs a message indicating that we are drawing a circle at that location with that radius.

In summary, Java interfaces define a set of methods (and possibly constants) without providing any implementation. They can be implemented by classes to provide the implementation for those methods, allowing for flexibility and extensibility in the design of a program.
