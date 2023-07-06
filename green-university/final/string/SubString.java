public class SubString {
    public static void main(String[] args) {
        String str = "Hello World";
        String subStr = str.substring(0, 5);
        System.out.println(subStr); // Hello

        String find = "World";
        boolean found = str.contains(find);
        System.out.println(found); // true
    }
}
