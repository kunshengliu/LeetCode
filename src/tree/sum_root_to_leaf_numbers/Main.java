package tree.sum_root_to_leaf_numbers;
import tree.TreeNode;
public class Main {
	public static void main(String[] args){
		TreeNode n1 = new TreeNode(1);
		TreeNode n2 = new TreeNode(2);
		TreeNode n3 = new TreeNode(3);
		TreeNode n4 = new TreeNode(4);
		TreeNode n5 = new TreeNode(5);
		n1.left=n2;
		n1.right=n3;
		n2.left=n4;
		n2.right=n5;
		int s=sumNumbers(n1);
		System.out.println(s);		
	}
    public static  int sumNumbers(TreeNode root){
    	return doSumNumbers(root,0);
    }
	private static int doSumNumbers(TreeNode root, int sum){
		if(root==null){
			return 0;
		}
		sum =sum*10+root.val;
		if(root.left == null && root.right == null){
			return sum;
		}
		return doSumNumbers(root.left, sum) + doSumNumbers(root.right, sum);
	}
}