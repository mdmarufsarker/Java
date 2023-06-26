package w3schools.Tutorial;

public class BreakContinue {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                break;
            }
            System.out.println(i);
        }
        // Outputs 0 1 2 3
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                continue;
            }
            System.out.println(i);
        }
        // Outputs 0 1 2 3 5 6 7 8 9
    }
}
