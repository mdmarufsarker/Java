package Loop;
import java.util.Scanner;

public class NestedForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows and columns: ");
        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] matrix = new int[r][c];

        System.out.println("Enter elements of matrix: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matrix is: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
// Enter number of rows and columns: 3 3
// Enter elements of matrix: 
// 1 2 3 
// 4 5 6 
// 7 8 9 
// Matrix is: 
// 1 2 3 
// 4 5 6 
// 7 8 9 