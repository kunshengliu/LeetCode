package sort_list;
public class Another {
	static class ListNode {
	     int val;
	      ListNode next;
	      ListNode(int x) {
             val = x;
	          next = null;
	      }
	 }
	public static void main(String[] args) {
        // TODO Auto-generated method stub
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
    	if(head==null)
			return null;
		if(head.next==null)
			return head;
            quickSort(head, null);
            return head;
        }        
    public static void quickSort(ListNode pBegin, ListNode pEnd){
        if(pBegin != pEnd){
            ListNode p = partition(pBegin, pEnd);
            quickSort(pBegin, p);
            quickSort(p.next, pEnd);            
        }
    }    
    public static ListNode partition(ListNode pBegin, ListNode pEnd){
        int x = pBegin.val;
        ListNode i = pBegin;
        ListNode j = i.next;
        while(j != pEnd){
            if(j.val < x){
                i = i.next;
                int tmp = i.val;
                i.val = j.val;
                j.val = tmp;
            }
            j = j.next;
        }
        int tmp = i.val;
        i.val = pBegin.val;
        pBegin.val = tmp;
        return i;
    }


}
