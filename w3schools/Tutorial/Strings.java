package w3schools.Tutorial;

public class Strings {
    public static void main(String[] args) {
        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("The length of the txt string is: " + txt.length());

        System.out.println(txt.toUpperCase());
        System.out.println(txt.toLowerCase());

        System.out.println(txt.indexOf("E"));

        String firstName = "Maruf";
        String lastName = "Sarker";
        System.out.println(firstName + " " + lastName);
        System.out.println(firstName.concat(" ").concat(lastName));
    }
}
/*
 * The length of the txt string is: 26
    ABCDEFGHIJKLMNOPQRSTUVWXYZ
    abcdefghijklmnopqrstuvwxyz
    4
    Maruf Sarker
    Maruf Sarker
 */