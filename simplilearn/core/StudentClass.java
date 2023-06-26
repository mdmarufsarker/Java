public class StudentClass {
    String name;
    int id;
    int age;
    String address;

    public StudentClass(String name, int id, int age, String address) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.address = address;
    }

    // getters
    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    public int getAge() {
        return age;
    }
    public String getAddress() {
        return address;
    }

    // setters
    public void setName(String name) {
        this.name = name;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public String Print(){
        return "Name: " + this.getName() + ", Id: " + this.getId() + ", Age: " + this.getAge() + ", Address: " + this.getAddress();
    }

    public static void main(String[] args) {
        StudentClass student = new StudentClass("John", 1, 20, "New York");
        
        // System.out.println(student.name);
        // System.out.println(student.id);
        // System.out.println(student.age);
        // System.out.println(student.address);

        // System.out.println(student.Print());

        student.setName("John");
        student.setId(1);
        student.setAge(20);
        student.setAddress("New York");

        System.out.println(student.Print());
        // Name: John, Id: 1, Age: 20, Address: New York
    }
}
