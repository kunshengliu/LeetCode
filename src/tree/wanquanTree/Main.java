package tree.wanquanTree;
import java.util.*;

import tree.TreeNode;
/**
 * 判断完全二叉树
 * @author liukunsheng
 *
 */
public class Main {

	
    public boolean chk(TreeNode root) {
        // write code here
        Queue<TreeNode> queue = new LinkedList<TreeNode>();//定义个队列
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode tmp = queue.poll();
            if(tmp.left==null&&tmp.right!=null){
                return false;
            }
            if(tmp.left!=null&&tmp.right==null){
                if(tmp.left.left!=null||tmp.left.right!=null){
                    return false;
                }
            } 
            if(tmp.left!=null){
                queue.add(tmp.left);
            }
            if(tmp.right!=null){
                queue.add(tmp.right);
            }
        }
        return true;
    }
}
