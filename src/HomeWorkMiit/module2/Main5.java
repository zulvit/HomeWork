package HomeWorkMiit.module2;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dimension = scanner.nextInt();
        int[][] matrix = new int[dimension][dimension];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < dimension; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println(Matrix.calcDeterminant(matrix, dimension));
    }
}


class Matrix {
    public static int calcDeterminant(int[][] matrix, int dimension) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < dimension; j++) {
                if (i == j) System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        return 0;
    }
}


