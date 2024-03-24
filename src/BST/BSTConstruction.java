package BST;

public class BSTConstruction {
  static class BST {
    public int value;
    public BST left;
    public BST right;

    public BST(int value) {
      this.value = value;
    }

    public BST insert(int value) {
      BST bst = this;
      while (true) {
        if (bst.value <= value) {
          if (bst.right == null) {
            bst.right = new BST(value);
            break;
          } else {
            bst = bst.right;
          }
        } else {
          if (bst.left == null) {
            bst.left = new BST(value);
            break;
          } else {
            bst = bst.left;
          }
        }
      }
      return this;
    }

    public boolean contains(int value) {
      BST bst = this;
      while (bst != null) {
        if(bst.value == value) {
          return true;
        }
        if (bst.value <= value) {
          bst = bst.right;
        } else {
          bst = bst.left;
        }
      }
      return false;
    }

    public BST remove(int value) {
      BST bst = this;
      BST prev = this;
      while (true) {
        prev = bst;
        if (bst == null) {
          return this;
        }
        if (bst.value == value) {
          if (bst.left != null && bst.right != null) {
            bst.value = this.findMin(bst.right);
            bst.right.remove(bst.value);
          } else {
            if (bst.left != null) {
              if (prev.left == bst) {
                prev.left = bst.left;
              } else {
                prev.right = bst.left;
              }
            } else {
              if (prev.left == bst) {
                prev.left = bst.right;
              } else {
                prev.right = bst.right;
              }
            }
          }
        }
        if (bst.value < value) {
          bst = bst.right;
        } else {
          bst = bst.left;
        }
      }
    }

    private int findMin(BST bst) {
      if (bst.left == null) {
        return bst.value;
      }
     return this.findMin(bst.left);
    }
  }
}
