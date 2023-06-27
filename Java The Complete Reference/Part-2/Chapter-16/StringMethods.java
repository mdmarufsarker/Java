public class StringMethods {
    public static void main(String[] args) {
        String str = "Bangladesh";

        System.out.println("Original String: " + str);
        System.out.println("Length: " + str.length());

        StringBuffer strBuffer = new StringBuffer(str);
        System.out.println("Capacity: " + strBuffer.capacity());
        // Its capacity is 10 + 16 = 26 because the default capacity of StringBuffer is 16.

        System.out.println("Char at index 3: " + str.charAt(3));
        System.out.println("Index of 'a': " + str.indexOf('a'));
        System.out.println("Last index of 'a': " + str.lastIndexOf('a'));
        System.out.println("Substring from index 4 to 7: " + str.substring(4, 7));
        System.out.println("Substring from index 4 to end: " + str.substring(4));
        System.out.println("Replace 'Bangladesh' with 'India': " + str.replace("Bangladesh", "India"));
        System.out.println("Concat ' is my country': " + str.concat(" is my country"));
        System.out.println("Trim: " + str.trim());
        System.out.println("Upper Case: " + str.toUpperCase());
        System.out.println("Lower Case: " + str.toLowerCase());
        System.out.println("Starts with 'Ban': " + str.startsWith("Ban"));
        System.out.println("Ends with 'esh': " + str.endsWith("esh"));
        System.out.println("Reverse: " + strBuffer.reverse());
        System.out.println("Equals 'Bangladesh': " + str.equals("Bangladesh"));
        System.out.println("EqualsIgnoreCase 'bangladesh': " + str.equalsIgnoreCase("bangladesh"));
        System.out.println("Compare 'Bangladesh': " + str.compareTo("Bangladesh"));

        System.out.println("Append ' is my country': " + strBuffer.append(" is my country"));
        System.out.println("Insert ' is my country' at index 10: " + strBuffer.insert(10, " is my country"));
        System.out.println("Delete from index 10 to 20: " + strBuffer.delete(10, 20));
    }
}
