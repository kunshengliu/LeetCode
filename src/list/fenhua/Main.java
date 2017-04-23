package list.fenhua;

import list.ListNode;

/**
对于一个链表，我们需要用一个特定阈值完成对它的分化，使得小于等于这个值的结点移到前面，大于该值的结点在后面，同时保证两类结点内部的位置关系不变。
给定一个链表的头结点head，同时给定阈值val，请返回一个链表，使小于等于它的结点在前，大于等于它的在后，保证结点值不重复。
测试样例：
{1,4,2,5},3
{1,2,4,5}
**/
/**
 * 思路是化为3个链表，然后拼接
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
		ListNode  t=listDivide(t1, 5);
		while(t!=null){
			System.out.print(t.val);
			t=t.next;
		}
	}
	
	
    public static ListNode listDivide(ListNode head, int val) {
    	if(head==null||head.next==null){
    		return head;
    	}
    	//3个链表的头结点
    	ListNode l1 =null;
    	ListNode l2 =null;
    	ListNode l3 =null;
    	//3个尾节点
    	ListNode lt1 =l1;
    	ListNode lt2 =l2;
    	ListNode lt3 =l3;
    	ListNode t=null;//
    	while(head!=null){
    		t=head.next;
    		head.next=null;
    		if(head.val<val){
    			if(l1==null){//证明是第一个
    				l1=head;
    				lt1=head;
    			}else{
    				lt1.next=head;
    				lt1=lt1.next;
    			}
    		}
    		else if(head.val==val){
    			if(l2==null){
    				l2 =head;
    				lt2=head;
    			}else{
    				lt2.next = head;
    				lt2=lt2.next;
    			}
    	  }else{
    		  if(l3==null){
    			  l3=head;
    			  lt3=head;
    		  }else{
    			  lt3.next=head;
    			  lt3=lt3.next;
    		  }
    	  }
    		head = t;
    	}
    	
    	if(l1!=null){
    		head=l1;
    		if(l2!=null){
    			lt1.next=l2;
    			lt2.next=l3;
    			return head;
    		}else{
    			lt1.next=l3;
    			return head;
    		}
    	}else{
    		if(l2!=null){
    			head=l2;
    			lt2.next=l3;
    			return head;	
    		}
    		else{
    			return l3;
    		}	
    	}
    }
    public static ListNode listDivide2(ListNode head, int val) {
        // write code here
        ListNode sh=null;//小链表的头节点
        ListNode st=null;//小链表的尾节点
        ListNode bh=null;//大头
        ListNode bt=null;//小头
        ListNode next=null;
        while(head!=null){
            next=head.next;
            head.next=null;
            if(head.val<=val){
                if(sh==null){
                    sh=head;
                    st=head;
                }else{
                    st.next=head;
                    st=head;
                }
            }else {
                if(bh==null){
                    bh=head;
                    bt=head;
                }
                else {
                    bt.next=head;
                    bt=head;
                }    
            } 
            head=next;
        }
        if(sh!=null){
        	head=sh;
        	st.next=bt;
        	return head;
        }else{
        	return bt;
        }
        
        
        
        
/*        if(st!=null){
            st.next=bh;
            bt=bt==null?st:bt;
        }
        return sh!=null?sh:bh;*/
    }
}
