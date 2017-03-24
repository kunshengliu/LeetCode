package tree.postorder;

import java.util.ArrayList;
import java.util.Stack;

import tree.TreeNode;

/**
 * 后序遍历
 * @author liukunsheng
 *
 */
public class Main {
	public static void main(String[] args) {
		TreeNode n1 = new TreeNode(1);
		TreeNode n2 = new TreeNode(2);
		TreeNode n3 = new TreeNode(3);
		n1.left=n2;
		n1.right=n3;
		ArrayList<Integer> l=postorderTraversal2(n1);
		System.out.println(l);
		
	}
	/**
	 * 递归
	 * @param root
	 * @return
	 */
	public static ArrayList<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        if(root==null){
        	return list;
        }
        doPostorder(root,list);
        return list;
    }
	private static void doPostorder(TreeNode root, ArrayList<Integer> list) {
		if(root==null){
			return;
		}
		doPostorder(root.left,list);
		doPostorder(root.right,list);
		list.add(root.val);
	}
	/**
	 * 非递归
	 * @param root
	 * @return
	 */
    public static ArrayList<Integer> postorderTraversal2(TreeNode root) {
	Stack<TreeNode> s = new Stack<TreeNode>();
        TreeNode pre = null;
        TreeNode cur = root;
        ArrayList<Integer> ret = new ArrayList<>();
        if (root == null)
            return ret;
        s.push(root);
         
        while (!s.isEmpty()) {
            cur = s.peek();//当前栈顶的元素
            if ((cur.left == null && cur.right == null)
                || (pre != null && (pre == cur.left || pre == cur.right))) {
                pre = cur;
                s.pop();
                ret.add(pre.val);
            }
            else {
                if (cur.right != null) {
                    s.push(cur.right);
                }
                if (cur.left != null) {
                    s.push(cur.left);
                }
            }
        }  
        return ret;    
    
    }
}
