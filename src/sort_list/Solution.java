package sort_list;
/**
 * java 自己写一个快速排序
 * @author liukunsheng
 *
 */
public class Solution {
	static class  ListNode {
		     int val;
		      ListNode next;
		      ListNode(int x) {
	              val = x;
		          next = null;
		      }
		 }	 
	public static void main(String[] args) {
	    ListNode head = new ListNode(5);
        ListNode head1 = new ListNode(3);
        ListNode head2 = new ListNode(6);
        ListNode head3 = new ListNode(8);
        ListNode head4 = new ListNode(4);
        head.next = head1;
        head1.next = head2;
        head2.next = head3;
        head3.next = head4;
        head4.next = null;
         
        ListNode res = sortList(head);
        while(res != null){
            System.out.print(res.val + " ");
            res = res.next;
        }
        System.out.println();
	} 
	 
	public static ListNode sortList(ListNode head) {
		if(head==null||head.next==null)
			return head;
		quickSort(head,null);
		return head;
		
	}
	public static void quickSort(ListNode begin,ListNode end){
		if(begin!=end){
			ListNode mid=getPartitionListNode(begin,end);
			quickSort(begin, mid);
			quickSort(mid.next,end);
		}
	
	}
	public static ListNode getPartitionListNode(ListNode begin,ListNode end){
		int x=begin.val;
		ListNode i=begin,j=i.next;
		while(j!=end){
			if(j.val<x){
				i=i.next;
				int temp=i.val;
				i.val=j.val;
				j.val=temp;
			}
			j=j.next;
		}
		int temp=i.val;
		i.val=begin.val;
		begin.val=temp;
		return i;
	}
	
	
	
}
