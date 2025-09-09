package Assignment_6;

import java.util.LinkedList;
import java.util.Queue;
import java.util.*;


public class BinaryTree {
static TNode root;
static class TNode {
	 int key;
	 TNode left,right;
	 TNode(int key) {
	 this.key = key;
	 }

//traverse inorder
public static void traverseInOrder(TNode node) {
if (node != null) {
traverseInOrder(node.left);
System.out.print(" " + node.key);
traverseInOrder(node.right);
}
}

//Traverse Postorder
public static void traversePostOrder(TNode node) {
if (node != null) {
traversePostOrder(node.left);
traversePostOrder(node.right);
System.out.print(" " + node.key);
}
}

//Traverse Preorder
public static void traversePreOrder(TNode node) {
if (node != null) {
System.out.print(" " + node.key);
traversePreOrder(node.left);
traversePreOrder(node.right);
}
}

static void insert(TNode temp, int key) {
if (temp == null) {
root = new TNode(key);
return;
}
Queue<TNode> q = new LinkedList<TNode>();
q.add(temp);

// Do level order traversal until we find an empty place.
while (!q.isEmpty()) {
temp = q.peek();
q.remove();
if (temp.left == null) {
temp.left = new TNode(key);
break;
} else
q.add(temp.left);

if (temp.right == null) {
     temp.right = new TNode(key);
     break;
} 
else
q.add(temp.right);
}  }

public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
root = new TNode(1);
root.left = new TNode(2);
root.right = new TNode(3);
root.left.left = new TNode(4);
root.left.right = new TNode(5);
root.right.left=new TNode(6);

System.out.print("Pre order Traversal: ");
traversePreOrder(root);
System.out.print("\nIn order Traversal: ");
traverseInOrder(root);
System.out.print("\nPost order Traversal: ");
traversePostOrder(root);
}
}}