package list.gongongxulie;

import java.util.ArrayList;

import list.ListNode;
/**
 * 打印两个有序链表的公共元素
 * @author liukunsheng
 *
 */
public class Main {
	public static void main(String[] args) {
		
	}
	
	

    public int[] findCommonParts(ListNode headA, ListNode headB) {
        // write code here
        if(headA==null||headB==null)
            return null;
        ArrayList<Integer> list = new ArrayList<>();
        while(headA!=null&&headB!=null){
            if(headA.val<headB.val){
                headA=headA.next;
            }else if(headA.val>headB.val){
                headB=headB.next;
            }else{
                list.add(headA.val);
                headA=headA.next;
                headB=headB.next;
            }
            
        }
        int [] t =new int[list.size()];   
        for(int i=0;i<list.size();i++){
            t[i]=list.get(i);
        }
        return t;
        
   }
}