import java.util.*;

public class Student {
    private String name;
    private int age;
    private String address;

    public Student(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }
    public Integer getAge() {
        return age;
    }
    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public String printDetails() {
        return "Name: " + this.name + ", Age: " + this.age + ", Address: " + this.address;
    }
    public static void main(String[] args) {
        
    }
}