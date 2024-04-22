package Questions;

public class MaxAvgSubArray {
  public static double findMaxAverage(int[] nums, int k) {
    double maxSum;
    double currentSum = 0d;
    for(int i = 0; i < k; i++) {
      currentSum += nums[i];
    }

    maxSum = currentSum;

    for(int i = k; i < nums.length; i++) {
      currentSum += nums[i] - nums[i - k];
      maxSum = Math.max(currentSum, maxSum);
    }

    return maxSum / k;
  }
  public static void main(String[] args) {
    System.out.println(findMaxAverage(new int[]{6,8,6,8,0,4,1,2,9,9}, 2));
  }
}
