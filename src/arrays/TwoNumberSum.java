package arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Write a function that takes in a non-empty array of distinct integers and an integer representing
 * a target sum. If any two numbers in the input array sum up to the target sum, the function should
 * return them in an array, in any order. If no two numbers sum up to the target sum, the function
 * should return an empty array.
 *
 * Note that the target sum has to be obtained by summing two different integers in the array;
 * you can't add a single integer to itself in order to obtain the target sum.
 *
 * You can assume that there will be at most one pair of numbers summing up to the target sum.
 *
 * O(n) time | O(n) space - where n is the length of the input array
 */
public class TwoNumberSum {

  public static void main(String[] args) {
    int[] array1 = {3, 5, -4, 8, 11, 1, -1, 6};
    int target1 = 10;

    System.out.println(Arrays.toString(sum(array1, target1)));

    int[] array2 = {3, 5, -4, 8, 11, 1, -1, 6};
    int target2 = 20;

    System.out.println(Arrays.toString(sum(array2, target2)));
  }

  //Creates a Hashset where each number in the array will be stored as iteration goes on.
  //the difference between the target sum and current array element is calculated.
  //If that difference is present in the HashSet function returns both the elements.
  private static int[] sum(int[] array, int targetSum) {
    Set<Integer> numbers = new HashSet<>();

    for(int i: array) {
      int remaining = targetSum - i;

      if(numbers.contains(remaining)) {
        return new int[] {remaining, i};
      }
      numbers.add(i);
    }

    return new int[] {};
  }
}
