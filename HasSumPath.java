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
 

	public static boolean hasPathSum(TreeNode node,int sum)
    {
    	if(node==null)
          return (sum==0);
      
      int subsum = sum-node.data;
      return (hasPathSum(node.left,subsum) || hasPathSum(node.right,subsum)); 
    }
  

	public static void main(String[] args)
	{
		// Creating a binary tree
		TreeNode rootNode=createBinaryTree();

		System.out.println(hasPathSum(rootNode,170));			
      
    		      
      
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
