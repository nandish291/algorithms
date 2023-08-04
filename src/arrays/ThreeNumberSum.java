package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Write a function that takes in a non-empty array of distinct integers and an integer representing
 * a target sum. The function should find all triplets in the array that sum up to the target sum
 * and return a two-dimensional array of all these triplets. The numbers in each triplet should be
 * ordered in ascending order, and the triplets themselves should be ordered in ascending order with
 * respect to the numbers they hold.
 * If no three numbers sum up to the target sum, the function should return an empty array.
 * O(n^2) time | O(n) space - where n is the length of the input array
 */
public class ThreeNumberSum {
  public static void main(String[] args) {
    List<Integer[]> result = threeNumberSum(new int[] {12, 3, 1, 2, -6, 5, 0, -8, -1, 6, -5}, 0);

    System.out.println(result);
  }

  public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {
    Arrays.sort(array);
    List<Integer> numbers = new ArrayList<>();
    List<Integer[]> result = new ArrayList<>();

    for(int i : array) {
      numbers.add(i);
    }

    for (int i = 0; i < array.length; i++) {
      for (int j = array.length - 1; j >= i; j--) {
          int diff = targetSum - (array[i] + array[j]);
          if (numbers.contains(diff) && numbers.indexOf(diff) < j && numbers.indexOf(diff) > i) {
            Integer[] resArray = new Integer[]{array[i], array[j], diff};
            Arrays.sort(resArray);
            result.add(resArray);
        }
      }
    }

    return result;
  }
}
