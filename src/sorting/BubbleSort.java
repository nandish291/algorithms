package sorting;

import utils.Util;

public class BubbleSort {

  /**
   * compares adjacent elements in the array and swaps them.
   * At the end of each iteration the largest number will be moved to (n-i)th position.
   * @param array unsorted array
   * @return sorted array
   */
  public static int[] sort(int[] array) {

    int count = 0;
    boolean isSorted = false;

    while (!isSorted) {
      isSorted = true;
      for (int i = 0; i < array.length - count - 1; i++) {

        if (array[i] > array[i + 1]) {
          Util.swap(array, i, i + 1);
          isSorted = false;
        }
      }
      count++;
    }

    return array;
  }
}
