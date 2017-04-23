package list.clear_val;

import list.ListNode;

/**
 * 
 * 现在有一个单链表。链表中每个节点保存一个整数，再给定一个值val，把所有等于val的节点删掉。
 * 给定一个单链表的头结点head，同时给定一个值val，请返回清除后的链表的头结点，保证链表中有不等于该值的其它值。请保证其他元素的相对顺序。
 * 测试样例：
 * {1,2,3,4,3,2,1},2
 * {1,3,4,3,1}
 * @author liukunsheng
 *
 */
public class Main {
	 public static void main(String[] args) {
		 ListNode t1=new ListNode(3);
			ListNode t2=new ListNode(4);
			ListNode t3=new ListNode(5);
			ListNode t4=new ListNode(6);
			ListNode t5=new ListNode(7);
			t1.next=t2;
			t2.next=t3;
			t3.next=t4;
			t4.next=t5;
			ListNode t=clear(t1, 5);
			while(t!=null){
			System.out.println(t.val);
			t=t.next;
			}
	}
	 public static ListNode clear(ListNode head, int val) {
	        // write code here
		 ListNode h=null;
		 ListNode t=null;
		 ListNode next = null;
		 while(head!=null){
			 next=head.next;
			 head.next=null;
			 if(head.val!=val){
				 if(h==null){
					 h=head;
					 t=h;
				 }
				 t.next=head;
				 t=t.next;
			 }
			 head=next;
		 }
		 return h; 
	}
}
