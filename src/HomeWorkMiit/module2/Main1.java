package HomeWorkMiit.module2;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int column = scanner.nextInt();

        int[][] matrix = new int[row][column];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        int minValue = matrix[0][0];

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                result.append(matrix[i][j]).append(" ");
                if (minValue > matrix[i][j]) {
                    minValue = matrix[i][j];
                }
            }
            result.deleteCharAt(result.length() - 1);
            result.append("\n");
        }
        System.out.print(result);
        System.out.println(minValue);
    }
}
