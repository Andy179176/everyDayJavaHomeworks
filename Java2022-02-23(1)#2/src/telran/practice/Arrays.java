package telran.practice;


import java.util.Random;

//Implement the method that finds the row’s index in the array int[n][k] of random integers with minimum sum of elements
public class Arrays {
    public static void main(String[] args) {
//        int[] array = {2, 4, 67, 9, 2, 56,};
//        System.out.println(sumArray(array, 6));
        //createDimArray(6);
        int[][] array = {{30, 5, 1, 2}, {5, 5, 5, 4}, {5, 5, 5, 5}};

        findMinSumInRow(array, 3, 4);

    }

    //Implement the method that calculates the sum of integer array. You should not use any loops. Use the recursion.
    public static int sumArray(int[] array, int n) {
        if (n <= 0) return 0;
        return (sumArray(array, n - 1) + array[n - 1]);
    }

    //Implement the method that create an array int[n][n] of random integers
    public static void createDimArray(int n) {
        int[][] dimArray = new int[n][n];
        Random random = new Random();
        int a = random.nextInt(100);

        for (int i = 0; i < dimArray.length; i++) {
            for (int j = 0; j < dimArray[i].length; j++) {
                dimArray[i][j] = a;
                a++;

            }

        }

        for (int i = 0; i < dimArray.length; i++) {
            System.out.println();
            for (int j = 0; j < dimArray[i].length; j++) {
                System.out.print(dimArray[i][j] + " ");
            }
        }

    }

    //Implement the method that finds the row’s index in the array int[n][k] of random integers with minimum sum of elements
    public static void findMinSumInRow(int[][] dimArray, int n, int k) {
        int sum = 0;
        int max = 0;
        int maxRow = 0;


        for (int i = 0; i < n; i++) {

            for (int j = 0; j < k; j++) {
                sum += dimArray[i][j];

            }
            if (sum > max) {
                max = sum;
                maxRow = i;
                sum = 0;
            } else {
                i++;
            }

        }
        System.out.println(maxRow + " is row with max sum");

    }
}
