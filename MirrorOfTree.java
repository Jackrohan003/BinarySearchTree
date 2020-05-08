 
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
 
  	
  	private static void mirror(TreeNode node) 
    {
  	if (node != null) {
    // do the sub-trees
    mirror(node.left);
    mirror(node.right);

    // swap the left/right pointers
    TreeNode temp = node.left;
    node.left = node.right;
    node.right = temp;
  }
    }
      

	
    public static void preOrder(TreeNode root)
    {
    	if(root==null)
          return;
      
      	System.out.print(root.data+" ");
      	preOrder(root.left);
      	preOrder(root.right);
      	
    }
      
      
      
      
	public static void main(String[] args)
	{
		// Creating a binary tree
		TreeNode rootNode=createBinaryTree();

      	System.out.println("BEFORE :");
     		preOrder(rootNode);

      mirror(rootNode);
      System.out.println("After :");
     	preOrder(rootNode);
      	

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
 
