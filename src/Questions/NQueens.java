package Questions;

import java.util.LinkedList;
import java.util.List;

public class NQueens {
  int n;
  int[] queens;
  List<List<String>> output = new LinkedList<>();
  public List<List<String>> solveNQueens(int n) {
    this.n = n;
    this.queens = new int[n];
    return output;
  }

  void printQueens() {
    List<String> s = new LinkedList<>();
    for(int i = 0; i < n; i++) {
      StringBuilder sb = new StringBuilder();
      for(int j = 0; j < n; j++) {
        if(this.queens[i] == j) {
          sb.append("Q");
        } else {
          sb.append(".");
        }
      }
      s.add(sb.toString());
    }
    output.add(s);
  }

  boolean isValidPlaceForQueen(int row, int col) {

    for(int i = 0; i < row; i ++) {
      if(queens[i] == col) {
        return false;
      }

      if(Math.abs(row - i) == Math.abs(col - queens[i])) {
        return false;
      }
    }
    return true;
  }

  void placeQueens(int row) {
    if(row == n) {
      printQueens();
    }

    for(int i = 0; i < n; i++) {
      if(isValidPlaceForQueen(row, i)) {
        queens[row] = i;
        placeQueens(row + 1);
      }
    }
  }

  public static void main(String[] args) {
    NQueens nQueens = new NQueens();
    int n = 4; // Change the value of n to find solutions for different board sizes
    nQueens.solveNQueens(n);
  }
}
