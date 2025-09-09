package Assignment_6;

import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;
class BST{
 static class TNode {
 int data;
 TNode left,right;
 TNode(int data) {
 this.data = data;
 }
 }
 static TNode root;
 public void PreOrder(TNode node) {
 if(node!=null) {
 System.out.println(node.data);
 PreOrder(node.left);
 PreOrder(node.right);
 }
 }
 public void InOrder(TNode node) {
 if(node!=null) {
 InOrder(node.left);
 System.out.println(node.data);
 InOrder(node.right);
 }
 }
 public void PostOrder(TNode node) {
 if(node!=null) {
 PostOrder(node.left);
 PostOrder(node.right);
 System.out.println(node.data);
 }
 }
 public void Insert(TNode temp, int data) {
 if(temp == null) {
 root = new TNode(data);
 return;
 }
 Queue<TNode> q = new LinkedList<TNode>();
 q.add(temp);
 while(!q.isEmpty()) {
 temp = q.peek();
 q.remove();
 if(temp.left == null) {
 temp.left = new TNode(data);
 break;
 }
 else {
 q.add(temp.left);
 }
 if(temp.right == null) {
 temp.right = new TNode(data);
 break;
 }
 else {
 q.add(temp.right);
 }
 }
 }
 public static void main(String args[]) {
 BST obj = new BST();
 Scanner sc = new Scanner(System.in);
 System.out.println("1. Insert method");
 System.out.println("2. PreOrder traversal");
 System.out.println("3. Inorder traversal");
 System.out.println("4. PostOrder traversal");
 System.out.println("5. End");
 do {
 System.out.println("Enter your choice");
 int m = sc.nextInt();
 switch(m) {
 case 1:
 System.out.println("Enter the element to insert in binary tree");
 int aa = sc.nextInt();
 obj.Insert(root,aa);
 break;
 case 2:
 System.out.println("PreOrder traversal is: ");
 obj.PreOrder(root);
 break;
 case 3:
 System.out.println("InOrder traversal is: ");
 obj.InOrder(root);
 break;
 case 4:
 System.out.println("PostOrder traversal is: ");
 obj.PostOrder(root);
 break;
 case 5:
 System.exit(0);
 break;
 }
 }
 while(true);
 }
}