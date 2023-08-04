package arrays;

/**
 * You're given a 2D array of integers matrix. Write a function that returns the transpose of the
 * matrix.
 * The transpose of a matrix is a flipped version of the original matrix across its main diagonal
 * (which runs from top-left to bottom-right); it switches the row and column indices of the
 * original matrix.
 * You can assume the input matrix always has at least 1 value; however its width and height are not
 * necessarily the same.
 * O(w * h) time | O(w * h) space - where w is the width of the matrix and h is the height
 */
public class TransposeMatrix {
  public static void main(String[] args) {
    int[][] matrix = new int[][] {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
    };

    transposeMatrix(matrix);
  }
  public static int[][] transposeMatrix(int[][] matrix) {
    int[][] result = new int[matrix.length][matrix[0].length];
    for(int i = 0; i < matrix.length; i++) {
      for(int j = 0; j < matrix[i].length; j++) {
        if (i != j) {
          result[j][i] = matrix[i][j];
        }
      }
    }
    return result;
  }
}
