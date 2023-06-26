# OOP Principles in Java

## Encapsulation in Java

=====================

Encapsulation in Java is a mechanism of wrapping the data (variables) and code acting on the data (methods) together as a single unit. In encapsulation, the variables of a class will be hidden from other classes, and can be accessed only through the methods of their current class. Therefore, it is also known as data hiding.

To achieve encapsulation in Java −

- Declare the variables of a class as private.
- Provide public setter and getter methods to modify and view the variables values.
- The Java Bean class is the example of a fully encapsulated class.
- Example

```java
  class EncapsulationDemo {
      private String name;
      private String idNum;
      private int age;

      public int getAge() {
        return age;
      }
  
      public String getName() {
        return name;
      }
  
      public String getIdNum() {
        return idNum;
      }
  
      public void setAge(int newAge) {
        age = newAge;
      }
  
      public void setName(String newName) {
        name = newName;
      }
  
      public void setIdNum( String newId) {
        idNum = newId;
      }
  }

  public class EncapsTest{
      public static void main(String[] args) {
          EncapsulationDemo obj = new EncapsulationDemo();
          obj.setName("Mario");
          obj.setAge(32);
          obj.setIdNum("12343");
          System.out.println("Name: " + obj.getName() + " Age: " + obj.getAge() + " ID: " + obj.getIdNum());
      }
  }
```

## Inheritance in Java

=====================

Inheritance can be defined as the process where one class acquires the properties (methods and fields) of another. With the use of inheritance the information is made manageable in a hierarchical order.

The class which inherits the properties of other is known as subclass (derived class, child class) and the class whose properties are inherited is known as superclass (base class, parent class).

`extends` Keyword is the keyword used to inherit the properties of a class. Following is the syntax of `extends` keyword.

`super` keyword is similar to this keyword which is used to represent the current object, whereas `super` keyword is used to represent the current class instance.

```java
  class Car{
      String name;
      String color;
      int maxSpeed;
      Car(int speed){
          this.maxSpeed = speed;
      }
      public void carInfo(){
          System.out.println("Car Name : " + name);
          System.out.println("Car Color : " + color);
          System.out.println("Max Speed : " + maxSpeed);
      }
  }

  class BMW extends Car{
      BMW(String name, String color, int speed){
          super(speed);
          this.name = name;
          this.color = color;
      }
  }

  class Audi extends Car{
      Audi(String name, String color, int speed){
          super(speed);
          this.name = name;
          this.color = color;
      }
  }

  public class InheritanceDemo {
      public static void main(String[] args) {
          BMW bmw = new BMW("BMW", "Black", 200);
          Audi audi = new Audi("Audi", "White", 250);
          bmw.carInfo();
          audi.carInfo();
      }
  }

```

## Polymorphism in Java

=====================

Polymorphism means "many forms", and it occurs when we have many classes that are related to each other by inheritance.

Inheritance lets us inherit attributes and methods from another class. Polymorphism uses those methods to perform different tasks. This allows us to perform a single action in different ways.

For example, think of a superclass called Animal that has a method called animalSound(). Subclasses of Animals could be Pigs, Cats, Dogs, Birds - And they also have their own implementation of an animal sound (the pig oinks, and the cat meows, etc.):

```java
  class Animal {
    public void animalSound() {
      System.out.println("The animal makes a sound");
    }
  }

  class Pig extends Animal {
    public void animalSound() {
      System.out.println("The pig says: wee wee");
    }
  }

  class Dog extends Animal {
    public void animalSound() {
      System.out.println("The dog says: bow wow");
    }
  }

  public class PolymorphismDemo {
    public static void main(String[] args) {
      Animal myAnimal = new Animal();
      Animal myPig = new Pig();
      Animal myDog = new Dog();

      myAnimal.animalSound();
      myPig.animalSound();
      myDog.animalSound();
    }
  }
```

## Abstraction in Java

=====================

Data abstraction is the process of hiding certain details and showing only essential information to the user.

Abstraction can be achieved with either abstract classes or interfaces.

The abstract keyword is a non-access modifier, used for classes and methods:

- Abstract class: is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class).

- Abstract method: can only be used in an abstract class, and it does not have a body. The body is provided by the subclass (inherited from).

An abstract class can have both abstract and regular methods:

```java
  abstract class Person {
    public String fname = "John";
    public int age = 24;
    public abstract void study();
  }

  class Student extends Person {
    public int graduationYear = 2018;
    public void study() {
      System.out.println("Studying all day long");
    }
  }

  class MyClass {
    public static void main(String[] args) {
      Student myObj = new Student();

      System.out.println("Name: " + myObj.fname);
      System.out.println("Age: " + myObj.age);
      System.out.println("Graduation Year: " + myObj.graduationYear);
      myObj.study();
    }
  }
```

## Interface in Java

=====================

Another way to achieve abstraction in Java, is with interfaces.

An interface is a completely "abstract class" that is used to group related methods with empty bodies:

To access the interface methods, the interface must be "implemented" (kinda like inherited) by another class with the implements keyword (instead of extends). The body of the interface method is provided by the "implement" class:

```java
  interface Animal {
    public void animalSound();
    public void sleep();
  }

  class Pig implements Animal {
    public void animalSound() {
      System.out.println("The pig says: wee wee");
    }
    public void sleep() {
      System.out.println("Zzz");
    }
  }

  class MyMainClass {
    public static void main(String[] args) {
      Pig myPig = new Pig();
      myPig.animalSound();
      myPig.sleep();
    }
  }
```

## Implementing Multiple Interfaces with using OOP Concepts

=====================

A class can implement more than one interface, which means that it can inherit abstract methods from multiple interfaces. The following example implements both the Animal and the Mammal interfaces:

```java
  interface Animal {
    public void animalSound();
    public void run();
  }

  interface Mammal {
    public void eat();
    public void sleep();
  }

  class Pig implements Animal, Mammal {
    public void animalSound() {
      System.out.println("The pig says: wee wee");
    }
    public void run() {
      System.out.println("The pig is running");
    }
    public void eat() {
      System.out.println("The pig is eating");
    }
    public void sleep() {
      System.out.println("Zzz");
    }
  }

  class MyMainClass {
    public static void main(String[] args) {
      Pig myPig = new Pig();
      myPig.animalSound();
      myPig.sleep();
    }
  }
```

Notes on Interfaces:

- Like abstract classes, interfaces cannot be used to create objects (in the example above, it is not possible to create an "Animal" object in the MyMainClass)
- Interface methods do not have a body - the body is provided by the "implement" class
- On implementation of an interface, you must override all of its methods
- Interface methods are by default abstract and public
- Interface attributes are by default public, static and final
- An interface cannot contain a constructor (as it cannot be used to create objects)

Why And When To Use Interfaces?

- To achieve security - hide certain details and only show the important details of an object (interface).

- Java does not support "multiple inheritance" (a class can only inherit from one superclass). However, it can be achieved with interfaces, because the class can implement multiple interfaces. Note: To implement multiple interfaces, separate them with a comma (see example below).

## Implementing Multiple Interfaces with using OOP Concepts also use extends keyword

=====================

A class can implement more than one interface, which means that it can inherit abstract methods from multiple interfaces. The following example implements both the Animal and the Mammal interfaces:

```java
  interface Animal {
      public void name();
      public void age();
      public void ability();
  }

  interface Human extends Animal{
      public void skill();
  }

  class Person implements Human{
      private String name;
      private int age;
      private String ability;
      private String skill;

      Person(String name, int age, String ability, String skill){
          this.name = name;
          this.age = age;
          this.ability = ability;
          this.skill = skill;
      }

      public void name(){
          System.out.println("Name: " + this.name);
      }

      public void age(){
          System.out.println("Age: " + this.age);
      }

      public void ability(){
          System.out.println("Ability: " + this.ability);
      }

      public void skill(){
          System.out.println("Skill: " + this.skill);
      }
  }
  public class Test{
      public static void main(String[] args) {
          Person person = new Person("John", 20, "Fly", "Java");
          person.name();
          person.age();
          person.ability();
          person.skill();
      }
  }
```

## Custom Exception in Java

=====================

Java provides us facility to create our own exceptions which are basically derived classes of Exception. For example MyException in below code extends the Exception class.

We pass the string to the constructor of the super class- Exception which is obtained using “getMessage()” function on the object created.

```java
  class MyException extends Exception {
    public MyException(String s) {
      super(s);
    }
  }

  class Main {
    public static void main(String args[]) {
      try {
        throw new MyException("GeeksGeeks");
      }
      catch (MyException ex) {
        System.out.println("Caught");

        // Print the message from MyException object
        System.out.println(ex.getMessage());
      }
    }
  }
```

## Java Exception Handling

=====================

Java provides a robust and object oriented mechanism to handle exception scenarios, known as Java Exception Handling.

Java Exception Handling is managed via five keywords: try, catch, throw, throws, and finally.

- try: A try block identifies a block of code for which particular exceptions is activated. It is followed by one or more catch blocks.
- catch: A catch block is where you handle the exceptions, this block must follow the try block. A single try block can have several catch blocks associated with it. You can catch different exceptions in different catch blocks. When an exception occurs in try block, the corresponding catch block that handles that particular exception executes. For example if an arithmetic exception occurs in try block then the statements enclosed in catch block for arithmetic exception executes.
- throw: A program throws an exception when a problem shows up. This is done using a throw keyword.
- throws: It specifies that a method may raise an exception during its execution. This is done using a throws keyword.
- finally: The finally block is used to execute a given set of statements, whether an exception is thrown or not thrown. For example, if you open a file, it must be closed whether an exception is raised or not.

```java
  class Main {
    public static void main(String args[]) {
      try {
        int arr[] = { 1, 2, 3, 4, 5 };
        System.out.println(arr[7]);
      }
      catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("The specified index does not exist " + "in array. Please correct the error.");
      }
    }
  }
```


