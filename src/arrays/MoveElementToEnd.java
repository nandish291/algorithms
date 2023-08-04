package arrays;

import java.util.Arrays;
import java.util.List;

/**
 * You're given an array of integers and an integer. Write a function that moves all instances of
 * that integer in the array to the end of the array and returns the array.
 * The function should perform this in place (i.e., it should mutate the input array) and doesn't
 * need to maintain the order of the other integers.
 * O(n) time | O(1) space - where n is the length of the array
 */
public class MoveElementToEnd {

  public static void main(String[] args) {
    moveElementToEnd(Arrays.asList(2, 1, 2, 2, 2, 3, 4, 2), 2);
  }

  public static List<Integer> moveElementToEnd(List<Integer> array, int toMove) {

    int lastIndex = array.size() - 1;

    for(int i = 0; i < lastIndex; i++) {
      while (lastIndex >= 0 && array.get(lastIndex) == toMove) {
        lastIndex--;
      }
      if(i < lastIndex && array.get(i) == toMove) {
        array.set(i, array.get(lastIndex));
        array.set(lastIndex, toMove);
        lastIndex--;
      }
    }
    return array;
  }
}
