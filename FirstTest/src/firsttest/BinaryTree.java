/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package firsttest;

/**
 *
 * @author ovidi
 */
//import firsttest.BinaryTree.Node;

class BinaryTreedif<Challenge> {
    class Node<Challenge> {
        Challenge value;
        Node<Challenge> left;
        Node<Challenge> right;
    
        Node(Challenge value) {
            this.value = value;
        }
    }
    Node<Challenge> first;
    BinaryTreedif(Challenge value)
    {
        first = new Node<Challenge>(value);
    }

    BinaryTreedif()
    {
        first = null;
    }
    public Node<Challenge> getFirst() {
        return first;
    }
    public void add(Node<Challenge> node,Challenge value) {
        if (value.compareTo(node.value) < 0) { 
            if (node.left != null) {
                add(node.left, value); 
            } else { 
                System.out.println(" Inserted " + value + " to left of " + node.value); 
                node.left = new Node<T>(value); 
            } 
        } else if (value.compareTo(node.value) > 0) {
          if (node.right != null) {
            add(node.right, value);
          } else {
            System.out.println("  Inserted " + value + " to right of " + node.value);
            node.right = new Node<T>(value);
          }
        }
      }
    public void inOrder(Node<T> node) {
        if (node != null) {
            inOrder(node.left);
            System.out.print(" " + node.value);
            inOrder(node.right);
        }
    }
}
