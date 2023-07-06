class Person {
    private String name;
    private int age;
    private String email;

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}


public class Encapsulation {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("John Doe");
        person.setAge(25);
        person.setEmail("johndoe@example.com");

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Email: " + person.getEmail());
    }
}
