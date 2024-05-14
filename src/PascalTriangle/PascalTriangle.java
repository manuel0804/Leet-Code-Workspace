package PascalTriangle;

/**
 * Given a non-negative integer numRows, generate the first numRows of Pascal's triangle.
 */

public class PascalTriangle {
    public static void main(String[] args) {
        int[][] result = pascal(20);
        print(result);
    }
    public static int[][] pascal(int zeilen) {
        int[][] result = new int[zeilen][];
        for (int i = 0; i < zeilen; i++){
            result[i] = new int[i + 1];
            result[i][0] = 1;
            result[i][i] = 1;
           for (int j = 1; j < i; j++) {
                result[i][j] = result[i - 1][j - 1] + result[i - 1][j];

           }

        }
        return result;
    }

    public static void print(int[][] result) {
        for (int[] res : result) {
            for (int r : res) {
                System.out.print(r + " ");
            }
            System.out.println();
        }
    }
}
