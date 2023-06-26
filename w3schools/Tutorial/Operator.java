package w3schools.Tutorial;

public class Operator {
    public static void main(Strings[] args) {
        int a = 5;
        a &= 3;
        System.out.println(a); // 1
        /*
         * a = 101
         * 3 = 011
         * -------
         * 1 = 001
         */

        int b = 5;
        b |= 3;
        System.out.println(b); // 7
        /*
         * b = 101
         * 3 = 011
         * -------
         * 7 = 111
         */

        int c = 5;
        c ^= 3;
        System.out.println(c); // 6
        /*
         * c = 101
         * 3 = 011
         * -------
         * 6 = 110
         */

        int d = 5;
        d <<= 3;
        System.out.println(d); // 40
        /*
         * d = 101
         * 3 = 011
         * -------
         * 40 = 101000
         */

        int e = 5;
        e >>= 3;
        System.out.println(e); // 0
        /*
         * e = 101
         * 3 = 011
         * -------
         * 0 = 000
         */
    }
}
