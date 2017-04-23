package tree;

import java.util.Stack;

/**
 * 判断一个二叉树是不是搜索二叉树
 * @author liukunsheng
 *
 */
public class searchTree {
	
	
	public boolean isSearchTree1(TreeNode root){
		Stack<TreeNode> stack = new Stack<TreeNode>();
		stack.push(root);
		int preValue=Integer.MIN_VALUE;
		while(!stack.isEmpty()){
			TreeNode node  = stack.peek();
			if(node.left!=null){
				stack.push(node.left);
				node.left=null;
			}else{
				TreeNode tmp = stack.pop();
				if(tmp.val<preValue){
					return false;
				}
				preValue = tmp.val;
				if(tmp.right!=null){
					stack.push(tmp.right);
				}
				
			}
		}
		return true;
	}
	
	
	
	public boolean isSearchTree(TreeNode root){
		return panduan(root, 0)!=-1;
	}
	public int panduan(TreeNode root,int preValue){
		if(root==null){
			return preValue;
		}
		preValue=panduan(root.left,preValue);
		if(root.val<=preValue){
			return -1;
		}else{
			preValue=root.val;
		}
		preValue=panduan(root.right,preValue);
		return preValue;
	}
	
	
}
