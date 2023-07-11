package sorting;

import java.util.Arrays;

public class Sorting {
  public static void main(String[] args) {
    int[] array = {20, 10, 15, 50, 1, 40, 100, 18};

    System.out.println("Bubble Sort: ");
    Arrays.stream(BubbleSort.sort(array.clone())).forEach(i -> System.out.print(i + " "));

    System.out.println("\nInsertion Sort: ");
    Arrays.stream(InsertionSort.sort(array.clone())).forEach(i -> System.out.print(i + " "));

    System.out.println("\nSelection Sort: ");
    Arrays.stream(SelectionSort.sort(array.clone())).forEach(i -> System.out.print(i + " "));

    System.out.println("\nQuick Sort: ");
    Arrays.stream(QuickSort.sort(array.clone())).forEach(i -> System.out.print(i + " "));

    int[] array2 = {10, 20, 10, 30, 20, 30, 30, 10};
    int[] order = {30, 10, 20};

    System.out.println("\nThree number Sort: ");
    Arrays.stream(ThreeNumberSort.sort(array2.clone(), order)).forEach(i -> System.out.print(i + " "));
  }
}
