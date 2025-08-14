import java.util.*;

public class binary_matrix {

    public static int[][] spiralOrder(int rows, int cols) {
        int[][] matrix = new int[rows][cols]; // create empty matrix

        int n = rows;
        int m = cols;
        int toprow = 0;
        int bottomrow = n - 1;
        int leftcol = 0;
        int rightcol = m - 1;
        int topelements = 0;
        int flip = 1;

        while (topelements < n * m) {

            // left → right
            for (int i = leftcol; i <= rightcol && topelements < n * m; i++) {
                matrix[toprow][i] = flip;
                flip = 1 - flip;
                topelements++;
            }
            toprow++;

            // top → bottom
            for (int i = toprow; i <= bottomrow && topelements < n * m; i++) {
                matrix[i][rightcol] = flip;
                flip = 1 - flip;
                topelements++;
            }
            rightcol--;

            // right → left
            for (int i = rightcol; i >= leftcol && topelements < n * m; i--) {
                matrix[bottomrow][i] = flip;
                flip = 1 - flip;
                topelements++;
            }
            bottomrow--;

            // bottom → top
            for (int i = bottomrow; i >= toprow && topelements < n * m; i--) {
                matrix[i][leftcol] = flip;
                flip = 1 - flip;
                topelements++;
            }
            leftcol++;
        }
        return matrix;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("5 x 5 matrix:");
        printMatrix(spiralOrder(5, 5));

        System.out.println("\n10 x 8 matrix:");
        printMatrix(spiralOrder(10, 8));
    }
}
