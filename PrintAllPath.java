import java.util.Queue;
import java.util.LinkedList;
public class BinaryTreeLevelOrder {
  
	public static class TreeNode
	{
		int data;
		TreeNode left;
		TreeNode right;
		TreeNode(int data)
		{
			this.data=data;
		}
	}
 

	public static void printPaths() {
  
}
/**
 Recursive printPaths helper -- given a node, and an array containing
 the path from the root node up to but not including this node,
 prints out all the root-leaf paths.
*/
private static void printPaths(TreeNode node, int[] path, int pathLen) {
  if (node==null) return;

  // append this node to the path array
  path[pathLen] = node.data;
  pathLen++;

  // it's a leaf, so print the path that led to here
  if (node.left==null && node.right==null) {
    printArray(path, pathLen);
  }
  else {   
  // otherwise try both subtrees
    printPaths(node.left, path, pathLen);
    printPaths(node.right, path, pathLen);
  }
}

/**
 Utility that prints ints from an array on one line.
*/
private static void printArray(int[] ints, int len) {
  int i;
  for (i=0; i<len; i++) {
   System.out.print(ints[i] + " ");
  }
  System.out.println();
}
  

	public static void main(String[] args)
	{
		// Creating a binary tree
		TreeNode rootNode=createBinaryTree();

		//System.out.println(hasPathSum(rootNode,170));			
      
  			//  	printPath();	      
      
      	int[] path = new int[1000];
	  printPaths(rootNode, path, 0);
      
      
	}
 
	public static TreeNode createBinaryTree()
	{
 
		TreeNode rootNode =new TreeNode(40);
		TreeNode node20=new TreeNode(20);
		TreeNode node10=new TreeNode(10);
		TreeNode node30=new TreeNode(30);
		TreeNode node60=new TreeNode(60);
		TreeNode node50=new TreeNode(50);
		TreeNode node70=new TreeNode(70);
 
		rootNode.left=node20;
		rootNode.right=node60;
 
		node20.left=node10;
		node20.right=node30;
 
		node60.left=node50;
		node60.right=node70;
 
		return rootNode;
	}
}
