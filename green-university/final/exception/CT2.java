class InvalidMarksRangeException extends Exception {
    private int invalidMark;

    public InvalidMarksRangeException(int invalidMark) {
        super("Invalid marks entered: " + invalidMark);
        this.invalidMark = invalidMark;
    }

    public int getInvalidMark() {
        return invalidMark;
    }
}

public class CT2 {
    public static void validateMarks(int marks) throws InvalidMarksRangeException {
        if (marks < 0 || marks > 100) {
            throw new InvalidMarksRangeException(marks);
        }
    }

    public static void main(String[] args) {
        int marks = 120;

        try {
            validateMarks(marks);
            System.out.println("Marks are valid.");
        } catch (InvalidMarksRangeException err) {
            System.out.println("Invalid marks entered: " + err.getInvalidMark());
        }
    }
}