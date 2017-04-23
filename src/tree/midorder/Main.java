package tree.midorder;
import java.util.*;

import tree.TreeNode;
/**
 * 终须遍历
 * @author liukunsheng
 *
 */

public class Main {
	 public ArrayList<Integer> inorderTraversal(TreeNode root) {
	        Stack<TreeNode> stack = new Stack<TreeNode>();
	        ArrayList<Integer> nodeList = new ArrayList<Integer>();
	        if(root!=null){
	            stack.push(root);
	            //root=root.left;
	            while(!stack.isEmpty()){
	                TreeNode temp=(TreeNode) stack.peek();
	                if(temp.left!=null){
	                    stack.push(temp.left);
	                    temp.left=null;
	                }else{
	                    nodeList.add(temp.val);
	                    stack.pop();
	                    if(temp.right!=null){
	                        stack.push(temp.right);
	                    }
	                }  
	            }
	        }
	         
	        return nodeList;  
	    }
}
