package arrays;

import java.util.Arrays;

/**
 * Write a function that takes in a non-empty array of integers that are sorted in ascending order
 * and returns a new array of the same length with the squares of the original integers also sorted
 * in ascending order.
 *
 * O(n) time | O(n) space - where n is the length of the input array
 */
public class SortedSquaredArray {

  public static void main(String[] args) {
    int[] array = {-8, -1, 2, 3, 4, 6, 7};


    System.out.println(Arrays.toString(sort(array)));
  }

  private static int[] sort(int[] array) {

    int firstIndex = 0, lastIndex = array.length - 1, index = array.length - 1;
    int[] resultArray = new int[array.length];

    while (index >= 0){
      if (Math.abs(array[firstIndex]) > Math.abs(array[lastIndex])) {
        resultArray[index] = array[firstIndex] * array[firstIndex];
        firstIndex++;
      } else {
        resultArray[index] = array[lastIndex] * array[lastIndex];
        lastIndex--;
      }
      index--;
    }
    return resultArray;
  }
}
