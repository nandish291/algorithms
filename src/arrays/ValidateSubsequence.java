package arrays;

/**
 * Given two non-empty arrays of integers, write a function that determines whether the second array
 * is a subsequence of the first one.
 *
 * A subsequence of an array is a set of numbers that aren't necessarily adjacent in the array but
 * that are in the same order as they appear in the array. For instance, the numbers [1, 3, 4] form
 * a subsequence of the array [1, 2, 3, 4], and so do the numbers [2, 4]. Note that a single number
 * in an array and the array itself are both valid subsequences of the array.
 *
 * O(n) time | O(1) space - where n is the length of the array
 */
public class ValidateSubsequence {
  public static void main(String[] args) {
    int[] array = {5, 1, 22, 25, 6, -1, 8, 10};
    int[] sequence = {1, 6, -1, 10};

    System.out.println(validate(array, sequence));

    int[] array2 = {5, 1, 22, 25, 6, -1, 8, 10};
    int[] sequence2 = {1, 6, -1, 5};

    System.out.println(validate(array2, sequence2));
  }

  private static boolean validate(int[] array, int[] sequence){

    int arrayIndex = 0, sequenceIndex = 0, count = 0;
    while (arrayIndex < array.length && sequenceIndex < sequence.length) {
      if (sequence[sequenceIndex] == array[arrayIndex]) {
        count++;
        sequenceIndex++;
      }
      arrayIndex++;
    }
    return sequence.length == count;
  }
}
