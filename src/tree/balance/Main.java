package tree.balance;

import tree.TreeNode;

/**
 * 平衡二叉树的判定
 * 思路就是递归的
 * @author liukunsheng
 *
 */
public class Main {
	
	public static boolean checkBalance(TreeNode root){
		return chk(root)>0;
	}
	public static int chk(TreeNode root){
		if(root==null)
			return 0;
		int l=chk(root.left);
		int r=chk(root.right);
		if(l<0||r<0){
			return -1;
		}
		if(Math.abs(r-l)>1){
			return -1;
		}
		return r>l?r+1:l+1;
	}
	
}
