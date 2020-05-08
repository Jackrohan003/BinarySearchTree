public class BinaryTreePrintLeafNodes {
 
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
 
	// Recursive Solution
	// print leaf nodes
	public static void dup(TreeNode node) {

      TreeNode oldleft;
      
     	if(node==null)
          return;

      
      dup(node.left);
      dup(node.right);
      
      oldleft = node.left;
     node.left = new TreeNode(node.data);
      node.left.left = oldleft;
      
      
		
	}
 
 	public static void print(TreeNode root)
    {
    		
      	if(root==null)return;
      
      	System.out.print(root.data+" ");
      	print(root.left);
    	print(root.right);
      
      
    }
 
	public static void main(String[] args)
	{
		// Creating a binary tree
		TreeNode rootNode=createBinaryTree();
		System.out.println("Printing leaf nodes in binary tree :");
		print(rootNode);
      System.out.println();
     	 dup(rootNode);
 		print(rootNode);     
      
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
 
		TreeNode node5=new TreeNode(5);
		TreeNode node55=new TreeNode(55);
 
		rootNode.left=node20;
		rootNode.right=node60;
 
		node20.left=node10;
		node20.right=node30;
 
		node60.left=node50;
		node60.right=node70;
 
		node10.left=node5;
		node50.right=node55;
		return rootNode;
	}
}
 
