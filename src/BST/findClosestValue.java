package BST;

public class findClosestValue {
  public static int findClosestValueInBst(BST tree, int target) {
    // Write your code here.
    return findClosestValueInBst(tree, target, tree.value);
  }

  private static int findClosestValueInBst(BST tree, int target, int closest) {
    if (tree.value == target) {
      return target;
    }

    if (Math.abs(tree.value - target) < Math.abs(closest - target)) {
      closest = tree.value;
    }

    if (tree.value < target && tree.right != null) {
      closest = findClosestValueInBst(tree.right, target, closest);
    } else if (tree.left != null){
      closest = findClosestValueInBst(tree.left, target, closest);
    }
    return closest;
  }

  static class BST {
    public int value;
    public BST left;
    public BST right;

    public BST(int value) {
      this.value = value;
    }
  }
}
