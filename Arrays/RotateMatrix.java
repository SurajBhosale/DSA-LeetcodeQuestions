//Problem Link - https://leetcode.com/problems/rotate-image/

package Arrays;

//O(N*N) - with extra space
// public class RotateMatrix {
//     static int[][] rotate(int[][] matrix) {
//         int n = matrix.length;
//         int[][] mat = new int[n][n];
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 mat[j][n - 1 - i] = matrix[i][j];
//             }
//         }
//         return mat;

//     }

//     public static void main(String[] args) {
//         int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
//         int rotated[][] = rotate(arr);
//         System.out.println("Rotated Image");
//         for (int i = 0; i < rotated.length; i++) {
//             for (int j = 0; j < rotated.length; j++) {
//                 System.out.print(rotated[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }

// }

// Without using extra space

public class RotateMatrix {
    static int[][] rotate(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length / 2; j++) {
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length - 1 - j];
                matrix[i][matrix.length - 1 - j] = temp;
            }
        }

        return matrix;

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