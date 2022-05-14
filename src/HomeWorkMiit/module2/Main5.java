package HomeWorkMiit.module2;

import java.util.Scanner;

class Main5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dimension = scanner.nextInt();
        double[][] matrix = new double[dimension][dimension];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < dimension; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println(det(matrix));
    }

    public static double[][] reduce(int row, int column, double[][] mat) {
        int n = mat.length;
        double[][] res = new double[n - 1][n - 1];
        int r = 0, c = 0;
        for (int i = 0; i < n; i++) {
            c = 0;
            if (i == row)
                continue;
            for (int j = 0; j < n; j++) {
                if (j == column)
                    continue;
                res[r][c] = mat[i][j];

                c++;
            }
            r++;
        }
        return res;
    }

    public static double det(double[][] mat) {
        int n = mat.length;
        if (n == 1)
            return mat[0][0];
        if (n == 2)
            return mat[0][0] * mat[1][1] - (mat[0][1] * mat[1][0]);
        double[][] m11 = reduce(0, 0, mat);
        double[][] m1n = reduce(0, n - 1, mat);
        double[][] mn1 = reduce(n - 1, 0, mat);
        double[][] mnn = reduce(n - 1, n - 1, mat);
        double[][] m11nn = reduce(0, 0, reduce(n - 1, n - 1, mat));
        return (det(m11) * det(mnn) - det(m1n) * det(mn1)) / det(m11nn);
    }
}