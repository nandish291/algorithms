package DS;

import java.util.ArrayList;
import java.util.List;

/**
 * You're given a Node class that has a name and an array of optional children nodes. When put
 * together, nodes form an acyclic tree-like structure.
 *
 * Implement the breadthFirstSearch method on the Node class, which takes in an empty array,
 * traverses the tree using the Breadth-first Search approach (specifically navigating the tree
 * from left to right), stores all of the nodes' names in the input array, and returns it.
 */
public class BFS {
  static class Node {
    String name;
    List<Node> children = new ArrayList<>();

    public Node(String name) {
      this.name = name;
    }

    public List<String> breadthFirstSearch(List<String> array) {
      // Write your code here.
      return array;
    }

    public Node addChild(String name) {
      Node child = new Node(name);
      children.add(child);
      return this;
    }
  }
}
