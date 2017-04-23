package tree.balance;

import tree.TreeNode;

public class Main1 {
	public static boolean checkBalance(TreeNode root){
		
		boolean res = true;
		postCheck(root, 1, res);
		return res;
	}
	public static int postCheck(TreeNode root,int depth,boolean res){
		if(root==null){
			return depth;
		}
		int left_depth = postCheck(root.left, depth, res);
		
		if(res==false){
			return depth;
		}
		
		int right_depth = postCheck(root.right, depth, res);
		
		if(res==false){
			return depth;
		}
		
		if(Math.abs(left_depth-right_depth)>1){
			res=false;
		}
		return Math.max(left_depth+1, right_depth+1);
	}

}
