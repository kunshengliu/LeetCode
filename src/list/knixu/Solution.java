package list.knixu;
import java.util.*;
import list.ListNode;
/**
 * 字符串反转，时间复杂度为n，空间复杂度为l。
 * @author liukunsheng
 *
 */
public class Solution {
    public ListNode ReverseList(ListNode head) {
        ListNode pre=null;
        ListNode next=null;
        
        while(head!=null){
        	next=head.next;//
        	head.next=pre;//
        	pre=head;
        	head=next;
        }
        return pre;
    }
}