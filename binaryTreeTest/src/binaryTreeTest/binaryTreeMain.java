package binaryTreeTest;

//import java.util.*;

public class binaryTreeMain {
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 BinaryTree bt1 = new BinaryTree(36d);
		 bt1.insertNode(25d);
		 bt1.insertNode(25d);
		 bt1.insertNode(45d);
		 bt1.insertNode(15);
		 bt1.insertNode(125);
		 bt1.insertNode(18);
		 bt1.insertNode(16);
		 bt1.insertNode(23);
		 bt1.insertNode(29);
		 bt1.insertNode(5);
		 bt1.insertNode(11.9);
		 bt1.insertNode(40);
		 bt1.insertNode(42);
		 bt1.insertNode(115);
		 bt1.insertNode(38);
		 bt1.insertNode(130);
         
		 // inOrder()
		 bt1.inOrder(bt1.root);
		 System.out.println();
		 
		 // delete 
		 bt1.deleteNode(45d);
		 System.out.println("delete " + 45);
		 bt1.inOrder(bt1.root);
		 System.out.println();
		 
		 //delete 
		 bt1.deleteNode(15d);
		 System.out.println("delete " + 15);
		 bt1.inOrder(bt1.root);
		 System.out.println();	
		 
		 //delete 
		 bt1.deleteNode(37d);
		 System.out.println("delete " + 37);
		 bt1.inOrder(bt1.root);
		 System.out.println();
		 
		 //delete 
		 bt1.deleteNode(18d);
		 System.out.println("delete " + 18);
		 bt1.inOrder(bt1.root);
		 System.out.println();
		 
		 //delete 
		 bt1.deleteNode(42d);
		 System.out.println("delete " + 42);
		 bt1.inOrder(bt1.root);
		 System.out.println();
		 
		 //delete 
		 bt1.deleteNode(25d);
		 System.out.println("delete " + 25);
		 bt1.inOrder(bt1.root);
		 System.out.println();
		 
		 //delete 
		 bt1.deleteNode(16d);
		 System.out.println("delete " + 16);
		 bt1.inOrder(bt1.root);
		 System.out.println();
		 
		 //delete 
		 bt1.deleteNode(40d);
		 System.out.println("delete " + 40);
		 bt1.inOrder(bt1.root);
		 System.out.println();
		 
		 //delete 
		 bt1.deleteNode(5d);
		 System.out.println("delete " + 5);
		 bt1.inOrder(bt1.root);
		 System.out.println();
		 
		 
	}
}
