package graphs;
import java.util.*;

/**
 * You're given a Node class that has a name and an array of optional children nodes. When put
 * together, nodes form an acyclic tree-like structure.
 * Implement the depthFirstSearch method on the Node class, which takes in an empty array,
 * traverses the tree using the Depth-first Search approach (specifically navigating the tree from
 * left to right), stores all of the nodes' names in the input array, and returns it.
 * O(v + e) time | O(v) space - where v is the number of vertices of the input graph and e is
 * the number of edges of the input graph
 */
class DFS {

  public static void main(String[] args) {
    Node n = new Node("A");
    n.addChild("B");
    n.addChild("C");
    n.addChild("D");

    System.out.println(n.depthFirstSearch(new ArrayList<>()));
  }

  static class Node {
    String name;
    List<Node> children = new ArrayList<>();

    public Node(String name) {
      this.name = name;
    }

    public List<String> depthFirstSearch(List<String> array) {
      // Write your code here.
      array.add(this.name);
      for (Node node: children) {
        node.depthFirstSearch(array);
      }
      return array;
    }

    public Node addChild(String name) {
      Node child = new Node(name);
      children.add(child);
      return this;
    }
  }
}

