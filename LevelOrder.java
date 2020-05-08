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
 
	// rints in level order
	public static void levelOrderTraversal(TreeNode startNode) {
		Queue<TreeNode> queue=new LinkedList<TreeNode>();
		queue.add(startNode);
		while(!queue.isEmpty())
		{
			TreeNode tempNode=queue.poll();
			System.out.printf("%d ",tempNode.data);
			if(tempNode.left!=null)
				queue.add(tempNode.left);
			if(tempNode.right!=null)
				queue.add(tempNode.right);
		}
	}
  
  
  	public static int height(TreeNode root)
    {
    	if(root==null)
          return 0;
      
      int left = height(root.left);
      int right = height(root.right);
      
      return Math.max(left,right)+1;
    	
    
    }
  
  
  	 private static void printLevelsRecursively(TreeNode root) {
        int height = height(root);

        for (int i = 1; i <= height; i++) {
            System.out.print("Level " + i + " : ");
            printSingleLevelRecursively(root, i);
            System.out.println();

        }
    }
  
  
  
     private static void printSingleLevelRecursively(TreeNode root, int level) {
        if (root == null)
            return;

        if (level == 1) {
            System.out.print(root.data + " ");
        } else if (level > 1) {
            printSingleLevelRecursively(root.left, level - 1);
            printSingleLevelRecursively(root.right, level - 1);
        }
    }
  
  

	public static void main(String[] args)
	{
		// Creating a binary tree
		TreeNode rootNode=createBinaryTree();
		System.out.println("Level Order traversal of binary tree will be:");
		levelOrderTraversal(rootNode);
      	printLevelsRecursively(rootNode);
      
      
   //   	System.out.println("HEight of Treee "+height(rootNode));
      
      
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
