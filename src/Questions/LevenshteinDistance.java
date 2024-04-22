package Questions;

import java.util.Arrays;

public class LevenshteinDistance {

  public static int levenshteinDistance(String str1, String str2) {
    // Write your code here.
    int[][] dp = new int[str1.length() + 1][str2.length() + 1];

    for(int i = 0; i < str1.length(); i++) {
      Arrays.fill(dp[i], 0);
    }

    for(int i = 0; i <= str1.length(); i++) {
      for(int j = 0; j <= str2.length(); j++){
        if(i == 0 || j == 0) {
          dp[i][j] = i + j;
        } else {
          if(str1.charAt(i - 1) == str2.charAt(j - 1)) {
            dp[i][j] = dp[i - 1][j - 1];
          } else {
            dp[i][j] = Math.min(Math.min(dp[i][j-1], dp[i-1][j]), dp[i-1][j-1]) + 1;
          }
        }
      }
    }

    return dp[str1.length()][str2.length()];
  }

  public static void main(String[] args) {
    levenshteinDistance("abc", "yabd");
  }

}
