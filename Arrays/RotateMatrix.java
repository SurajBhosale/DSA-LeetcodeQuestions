//Problem Link - https://leetcode.com/problems/rotate-image/

package Arrays;

//O(N*N)
public class RotateMatrix {
    static int[][] rotate(int[][] matrix) {
        int n = matrix.length;
        int[][] mat = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[j][n - 1 - i] = matrix[i][j];
            }
        }
        return mat;

    }

    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int rotated[][] = rotate(arr);
        System.out.println("Rotated Image");
        for (int i = 0; i < rotated.length; i++) {
            for (int j = 0; j < rotated.length; j++) {
                System.out.print(rotated[i][j] + " ");
            }
            System.out.println();
        }
    }

}
