package list.sortpush;

import list.ListNode;

/**
 * 环形链表插值练习题
 *有一个整数val，如何在节点值有序的环形链表中插入一个节点值为val的节点，并且保证这个环形单链表依然有序。
 *给定链表的信息，及元素的值A及对应的nxt指向的元素编号同时给定val，请构造出这个环形链表，并插入该值。
 *测试样例：
 *[1,3,4,5,7],[1,2,3,4,0],2
 *返回：{1,2,3,4,5,7}
 */
public class Main {
	public static void main(String[] args) {
		int [] a=new int[]{1,3,4,5,7};
		int [] b=new int[]{1,2,3,4,0};
		insert(a,b,0);
	}
    public static ListNode insert(int[] A, int[] nxt, int val) {
    	if(A==null||A.length==0){
    		ListNode t=new ListNode(val);
    		return t;
    	}
    	
    	ListNode head = new ListNode(A[0]);
    	ListNode r=head;
    	ListNode p;
    	for(int i=0;i<nxt.length-1;i++){
    		p = new ListNode(A[nxt[i]]);
    		r.next=p;
    		r=p;
    	}//建立表
    	r.next=head;
    	ListNode pos =head;
    	ListNode pas =head.next;
    	
    	while(pas!=head){
    		if(val>=pos.val&&val<=pas.val){
    			break;
    		}else{
    			pos=pos.next;
    			pas=pas.next;
    		}
    	}
    	
    	ListNode t=new ListNode(val);
    	t.next=pas;
    	pos.next=t;
    	if(val<head.val){
    		return t;
    	}else{
    		return head;
    	}

    }
}
