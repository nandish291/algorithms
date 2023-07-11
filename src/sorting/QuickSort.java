package sorting;

import utils.Util;

public class QuickSort {

  public static int[] sort(int[] array) {
    sort(array, 0, array.length - 1);
    return array;
  }

  /**
   * On every iteration, the pivot element will be placed at its final position and the array
   * will be divided into left and right. And process will continue until all elements are sorted.
   * @param array unsorted array
   * @param start starting index
   * @param end ending index
   */
  private static void sort(int[] array, int start, int end) {
    if (start >= end) {
      return;
    }
    int lIndex = start + 1;
    int rIndex = end;

    while (lIndex <= rIndex) {
      if (array[lIndex] > array[start] && array[rIndex] < array[start]) {
        Util.swap(array, lIndex, rIndex);
      }
      if(array[start] > array[lIndex]) {
        lIndex++;
      }
      if(array[start] < array[rIndex]) {
        rIndex--;
      }
    }
    Util.swap(array, start, rIndex);

    boolean left = rIndex - 1 - start < end - (rIndex + 1);

    if(left) {
      sort(array, start, rIndex - 1);
      sort(array, rIndex + 1, end);
    } else {
      sort(array, rIndex + 1, end);
      sort(array, start, rIndex - 1);
    }
  }
}
