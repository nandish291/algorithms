package sorting;

import utils.Util;

public class InsertionSort {

  /**
   * On every iteration elements from 0 to i will be sorted
   * @param array unsorted array
   * @return sorted array
   */
  public static int[] sort(int[] array) {

    for(int i = 1; i < array.length; i++) {
      int j = i;

      while(j > 0 && array[j] < array[j - 1]) {
        Util.swap(array, j, j-1);
        j--;
      }
    }

    return array;
  }
}
