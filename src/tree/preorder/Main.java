package tree.preorder;

import java.util.ArrayList;
import java.util.Stack;

import tree.TreeNode;

public class Main {
    public static void main(String[] args) {
		
    }
    public static ArrayList<Integer> preorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
    	ArrayList<Integer> nodeList = new ArrayList<Integer>();
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
