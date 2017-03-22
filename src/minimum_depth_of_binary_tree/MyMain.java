package minimum_depth_of_binary_tree;

public class MyMain {
	
	public static class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		public TreeNode(int x){
			this.val=x;
		}
		public TreeNode(){}
		
	}
	public static int run(TreeNode root){
		if(root==null)
			return 0;
	    if(root.left==null&&root.right==null)
	    	return 1;
	    if(root.left==null)
	    	return run(root.right)+1;
	    if(root.right==null)
	    	return run(root.left)+1;    
		return Math.min(run(root.left), run(root.right))+1;		
	}	
	public static void main(String[] args) {
		
		TreeNode node1=new TreeNode(0);
		TreeNode node2=new TreeNode(3);
		TreeNode node3=new TreeNode(0);
		node1.left=node2;
		node1.right=node3;
		int deep=run(node1);
		System.out.println("the tree  deep is:"+deep);
		
		
	}

}
