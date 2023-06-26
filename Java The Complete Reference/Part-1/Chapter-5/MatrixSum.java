import java.util.Scanner;

public class MatrixSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int matrix1[][] = new int[3][3];
        int matrix2[][] = new int[3][3];
        int sum[][] = new int[3][3];

        int i, j;
        System.out.println("Enter the elements of the first matrix: ");
        for(i = 0; i < 3; i++){
            for(j = 0; j < 3; j++){
                matrix1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the elements of the second matrix: ");
        for(i = 0; i < 3; i++){
            for(j = 0; j < 3; j++){
                matrix2[i][j] = sc.nextInt();
            }
        }

        for(i = 0; i < 3; i++){
            for(j = 0; j < 3; j++){
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        System.out.println("Sum of the matrices is: ");
        for(i = 0; i < 3; i++){
            for(j = 0; j < 3; j++){
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }
}
