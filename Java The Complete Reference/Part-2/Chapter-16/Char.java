public class Char {
    public static void main(String[] args) {
        char chars[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};

        String s1 = new String(chars);
        String s2 = new String(chars, 3, 4);
        String s3 = new String(s1);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
