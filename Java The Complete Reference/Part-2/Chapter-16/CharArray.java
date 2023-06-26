public class CharArray {
    public static void main(String[] args) {
        String s = "Bangladesh";

        char[] ch = new char[s.length()];

        // getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin)
        s.getChars(0, s.length(), ch, 0);

        for(char c : ch)
            System.out.print(c + " ");
        
        System.out.println();
    }
}
