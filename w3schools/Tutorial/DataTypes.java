package w3schools.Tutorial;

public class DataTypes {
    public static void main(Strings[] args) {
        /*
         * Data types are divided into two groups:

            Primitive data types - includes byte, short, int, long, float, double, boolean and char
            Non-primitive data types - such as String, Arrays and Classes (you will learn more about these in a later chapter)
         */
        String my_name = "Maruf Sarker";
        // The String type is so much used and integrated in Java, that some call it "the special ninth type".
        System.out.println(my_name); // Maruf Sarker
        
        int id = 221002063;
        System.out.println(id); // 221002063

        char grade = 'B';
        System.out.println(grade); // B

        double cgpa = 2.95d;
        System.out.println(cgpa); // 2.95

        float height = 5.4f;
        System.out.println(height); // 5.4

        /*
         * 
            Use float or double?

            The precision of a floating point value indicates how many digits the value can have after the decimal point. The precision of float is only six or seven decimal digits, while double variables have a precision of about 15 digits. Therefore it is safer to use double for most calculations.
         */
        
        boolean isMarried = false;
        System.out.println(isMarried); // false

        int x = 5, y = 6, z = 7;
        System.out.println(x + y + z); // 18

        int a, b, c;
        a = b = c = 10;
        System.out.println(a + b + c); // 30

        byte myByte = 100;
        System.out.println(myByte); // 100

        short myShort = 5000;
        System.out.println(myShort); // 5000

        long myLong = 15000000000L;
        System.out.println(myLong); // 15000000000
    }
}
