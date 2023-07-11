package sorting;

import utils.Util;

public class ThreeNumberSort {

  public static int[] sort(int[] array, int[] order) {

    int counter = 0;

    for(int i = 0; i < order.length && counter < array.length; i++) {

      for (int j = counter; j < array.length; j++) {
        if (order[i] == array[j]) {
          Util.swap(array, counter, j);
          counter++;
        }
      }
    }
    return array;
  }
}
