package w3schools.Tutorial;

public class SpecialCharacters {
    public static void main(String[] args) {
        String txt = "We are the so-called \"Vikings\" from the north.";

        String single = "It\'s alright.";
        String backslash = "The character \\ is called backslash.";

        String newLine = "Hello\nWorld!";
        String carriageReturn = "Hello\rWorld!";
        String tab = "Hello\tWorld!";
        String backspace = "Hello\bWorld!";
        String formFeed = "Hello\fWorld!";
        String unicode = "Hello\u0057orld!";

        System.out.println(txt);
        System.out.println(single);
        System.out.println(backslash);
        System.out.println(newLine);
        System.out.println(carriageReturn);
        System.out.println(tab);
        System.out.println(backspace);
        System.out.println(formFeed);
        System.out.println(unicode);
    }
}
