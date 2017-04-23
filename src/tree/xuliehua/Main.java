package tree.xuliehua;
import java.util.*;
import tree.TreeNode;

/**
 * 二叉树的序列化
 * @author liukunsheng
 *
 */
public class Main {
	
	public static void main(String[] args) {
		
		TreeNode n1 = new TreeNode(1);
		TreeNode n2 = new TreeNode(2);
		TreeNode n3 = new TreeNode(3);
		TreeNode n4 = new TreeNode(4);
		n1.left=n2;
		n1.right=n3;
		n2.left=n4;
		String s =toString(n1);
		System.out.println(s);
	}
	public static String toString(TreeNode root) {
		StringBuilder sb = new StringBuilder();
		Serialize(root, sb);
		
		return sb.toString();
    }
	public static void Serialize(TreeNode root,StringBuilder sb){
		if(root==null){
			sb.append("#!");
		}else{
			sb.append(root.val).append("!");
			Serialize(root.left,sb);
			Serialize(root.right,sb);
		}
	}
}
