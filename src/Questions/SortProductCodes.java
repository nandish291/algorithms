package Questions;

import java.util.*;

/**
 * Amazon has millions of products sold on its e-commerce website, and each product is identified by
 * its product code. Given an array of n productCodes and order, a string that represents the
 * precedence of characters, sort the productCodes in lexicographically increasing order per the precedence.
 * Note: Lexicographical order is defined in the following way. When we compare strings s and t,
 * first we find the leftmost position with differing characters: 5,*t,
 * If there is no such position (i. e. s is a prefix of tor vice versa) the shortest string is less.
 * Otherwise, we compare characters s, and t according to their order in the given precedence order.
 * Example: If n=2, order = "abcdefghijklmnopqrstuvwxyz", and productCodes is ["adc", "abc"),
 * the sorted order is ["abc", "adc"). Consider the strings "adc"and "abc",
 * the first point of difference is at position 1 (assuming start index is 0),
 * and 'd'>'b'according to the a given precedence order.
 */
public class SortProductCodes {
  public static List<String> sortProductCodes(String order, List<String> productCodes) {
    // Custom comparator based on precedence order
    Comparator<String> customComparator = new Comparator<String>() {
      @Override
      public int compare(String a, String b) {
        int i = 0, j = 0;
        while (i < a.length() && j < b.length()) {
          if (a.charAt(i) != b.charAt(j)) {
            return order.indexOf(a.charAt(i)) - order.indexOf(b.charAt(j));
          }
          i++;
          j++;
        }
        return Integer.compare(a.length(), b.length());
      }
    };

    // Sort the productCodes list using the custom comparator
    productCodes.sort(customComparator);

    return productCodes;
  }

  public static void main(String[] args) {
    String order = "qwertyuioplkjhgfdsazxcvbnm";
    List<String> productCodes = new ArrayList<>(Arrays.asList("abc", "acg"));
    List<String> sortedCodes = sortProductCodes(order, productCodes);
    System.out.println(sortedCodes);  // Output: [abc, adc]
  }
}