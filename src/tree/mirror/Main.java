package tree.mirror;

import java.util.LinkedList;
import java.util.Queue;

import tree.TreeNode;

/**
 * 二叉树的镜像
 * @author liukunsheng
 *
 */
public class Main {
	public static void main(String[] args) {
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.isEmpty();
		System.out.print("c");
		//queue.
	}
	/**
	 * 递归的操作
	 * @param root
	 */
    public void Mirror(TreeNode root) {
        if(root==null){
            return;
        }
        if(root.left==null&&root.right==null){
            return;
        }
        TreeNode tmp =root.left;
        root.left=root.right;
        root.right=tmp;
        Mirror(root.left);
        Mirror(root.right);  
    }
}
