package DS;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * You're given a Node class that has a name and an array of optional children nodes. When put
 * together, nodes form an acyclic tree-like structure.
 *
 * Implement the breadthFirstSearch method on the Node class, which takes in an empty array,
 * traverses the tree using the Breadth-first Search approach (specifically navigating the tree
 * from left to right), stores all of the nodes' names in the input array, and returns it.
 *
 * O(v + e) time | O(v) space - where v is the number of vertices of the input graph and e is
 * the number of edges of the input graph
 */
public class BFS {

  public static void main(String[] args) {
    Node a = new Node("A");
    Node b = new Node("B");
    Node f = new Node("F");
    b.addChild(new Node("C"));
    b.addChild(new Node("D"));
    f.addChild(new Node("G"));
    a.addChild(b);
    a.addChild("E");
    a.addChild(f);

    System.out.println(a.breadthFirstSearch(new ArrayList<>()));
  }

  static class Node {
    String name;
    List<Node> children = new ArrayList<>();

    public Node(String name) {
      this.name = name;
    }

    public List<String> breadthFirstSearch(List<String> array) {
      // Write your code here.
      Queue<Node> queue = new ArrayDeque<>();
      array.add(this.name);
      this.breadthFirstSearch(array, queue);
      return array;
    }

    public void breadthFirstSearch(List<String> array, Queue<Node> queue) {
      for (Node node: children) {
        queue.add(node);
        array.add(node.name);
      }

      while (!queue.isEmpty()) {
        queue.remove().breadthFirstSearch(array, queue);
      }
    }

    public void addChild(String name) {
      Node child = new Node(name);
      children.add(child);
    }

    public void addChild(Node node) {
      children.add(node);
    }
  }
}
