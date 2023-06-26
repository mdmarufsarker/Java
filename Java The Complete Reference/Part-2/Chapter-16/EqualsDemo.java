public class EqualsDemo {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = "Good-bye";
        String s4 = "HELLO";

        System.out.println(s1 + " equals " + s2 + " -> " + s1.equals(s2));
        System.out.println(s1 + " equals " + s3 + " -> " + s1.equals(s3));
        System.out.println(s1 + " equals " + s4 + " -> " + s1.equals(s4));
        System.out.println(s1 + " equalsIgnoreCase " + s4 + " -> " + s1.equalsIgnoreCase(s4));

        System.out.println();

        String s5 = "Hello";
        String s6 = new String(s5);

        System.out.println(s5 + " = " + s6 + " -> " + s5.equals(s6));
        System.out.println(s5 + " == " + s6 + " -> " + (s5 == s6));
        /*
         * The == operator compares the references to the objects, not the contents of the objects themselves.
         * The equals() method compares the contents of the objects.
         */
    }
}
