package tree.preorder;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import tree.TreeNode;
/**
 * 先序遍历
 * @author liukunsheng
 *
 */
public class Main {
    public static void main(String[] args) {
		//Queue<TreeNode> queue =
    }
    public static ArrayList<Integer> preorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
    	ArrayList<Integer> nodeList = new ArrayList<Integer>();
    	Queue<TreeNode> queue = new LinkedList<TreeNode>();
    	if(root!=null){
    		stack.push(root);
    		while(!stack.isEmpty()){
    			TreeNode  temp=(TreeNode) stack.pop();
    			nodeList.add(temp.val);
    			if(temp.right!=null){
    				stack.push(temp.right);
    			}
    			if(temp.left!=null){
    				stack.push(temp.left);
    			}	  			
    		}  		
    	}                                                                                                                                                                                                                                                                                                                                       
    	return nodeList;
        
    }
}
