package sorting;

import utils.Util;

public class SelectionSort {

  /**
   * At each iteration minimum element will be selected and placed at ith position
   * @param array unsorted array
   * @return sorted array
   */
  public static int[] sort(int[] array) {

    for(int i = 0; i < array.length - 1; i++) {
      int minIndex = i;

      for(int j = i + 1; j < array.length; j++) {
        if(array[j] < array[minIndex]) {
          minIndex = j;
        }
      }

      if(minIndex != i) {
        Util.swap(array, i, minIndex);
      }
    }
    return array;
  }
}
