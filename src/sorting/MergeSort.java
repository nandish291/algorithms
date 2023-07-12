package sorting;

public class MergeSort {

  public static int[] sort(int[] array) {
    return sort(array, 0, array.length - 1);
  }

  //Divides the array into single length arrays and combines them back while arranging them in
  //order
  private static int[] sort(int[] array, int start, int end) {
    if(start == end) {
      return new int[] {array[start]};
    }

    int mid = (start + end) / 2;
    int[] left = sort(array, start, mid);
    int[] right = sort(array, mid + 1, end);
    return merge(left, right);
  }

  private static int[] merge(int[] left, int[] right) {
    int lIndex = 0, rIndex = 0;
    int[] finalArray = new int[left.length + right.length];
    int count = 0;

    while (lIndex < left.length && rIndex < right.length) {
      if (left[lIndex] < right[rIndex]) {
        finalArray[count] = left[lIndex];
        lIndex++;
      } else {
        finalArray[count] = right[rIndex];
        rIndex++;
      }
      count++;
    }

    while (lIndex < left.length) {
      finalArray[count] = left[lIndex];
      lIndex++;
      count++;
    }

    while (rIndex < right.length) {
      finalArray[count] = right[rIndex];
      rIndex++;
      count++;
    }

    return finalArray;
  }
}
