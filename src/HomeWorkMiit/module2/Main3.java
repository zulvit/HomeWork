package HomeWorkMiit.module2;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dimension = scanner.nextInt();

        int[][] matrix = new int[dimension][dimension];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < dimension; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < dimension; j++) {
                if (i < j) {
                    matrix[j][i] = matrix[i][j];
                }
            }
        }

        StringBuilder result = new StringBuilder();

        for (int[] ints : matrix) {
            for (int j = 0; j < dimension; j++) {
                result.append(ints[j]).append(" ");
            }
            result.deleteCharAt(result.length() - 1);
            result.append("\n");
        }

        System.out.println(result);
    }
}
