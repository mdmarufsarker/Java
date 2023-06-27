public class TrimString2 {
    public static void main(String[] args) {
        String str;
        System.out.println("Enter 'stop' to quit.");
        System.out.println("Enter State: ");

        do {
            str = System.console().readLine();
            str = str.trim();
            if (str.equals("Illinois"))
                System.out.println("Capital is Springfield.");
            else if (str.equals("Missouri"))
                System.out.println("Capital is Jefferson City.");
            else if (str.equals("California"))
                System.out.println("Capital is Sacramento.");
            else if (str.equals("Washington"))
                System.out.println("Capital is Olympia.");
            // ...
        } while (!str.equals("stop"));
    }
}
