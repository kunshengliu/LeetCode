package tree.allorder;

import java.util.*;

import tree.TreeNode;

/**
 * 请用递归方式实现二叉树的先序、中序和后序的遍历打印。
 * 给定一个二叉树的根结点root，请依次返回二叉树的先序，中序和后续遍历(二维数组的形式)。
 * 
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
		convert(n1);
		
		
	}
	
	
    public static int[][] convert(TreeNode root) {
    	ArrayList<Integer> list1 = new ArrayList<Integer>();
    	ArrayList<Integer> list2 = new ArrayList<Integer>();
    	ArrayList<Integer> list3 = new ArrayList<Integer>();
    	bianli1(root, list1);
    	bianli2(root, list2);
    	bianli3(root, list3);
    	int [][]  ints = new int[3][list1.size()];
    	for(int i=0;i<list1.size();i++){
    		ints[0][i]=list1.get(i);
    	}
    	for(int i=0;i<list2.size();i++){
    		ints[1][i]=list2.get(i);
    	}	for(int i=0;i<list3.size();i++){
    		ints[2][i]=list3.get(i);
    	}

    	
    	return ints;
    }
    public static void  bianli1(TreeNode root,ArrayList<Integer> list){
    	if(root==null){
    		return;
    	}
    	list.add(root.val);
    	bianli1(root.left,list);
    	bianli1(root.right,list);
    }
    public static void  bianli2(TreeNode root,ArrayList<Integer> list){
    	if(root==null){
    		return;
    	}
    	bianli2(root.left,list);
    	list.add(root.val);
    	bianli2(root.right,list);
    }
    public static void  bianli3(TreeNode root,ArrayList<Integer> list){
    	if(root==null){
    		return;
    	}
    	bianli3(root.left,list);
    	bianli3(root.right,list);
    	list.add(root.val);
    }
    
    
    
}
