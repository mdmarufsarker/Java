package w3schools.Tutorial;

public class Arrays {
    public static void main(String[] args) {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println(cars[0]);

        cars[2] = "Lamborghini";

        for(int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }

        int[] id = {1, 2, 3, 4, 5};
        System.out.println(id[3]);

        System.out.println(cars.length);



        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        
        System.out.println(myNumbers[1][2]); // Outputs 7

        for (int i = 0; i < myNumbers.length; ++i) {
            for(int j = 0; j < myNumbers[i].length; ++j) {
                System.out.println(myNumbers[i][j]);
            }
        }
    }
}
