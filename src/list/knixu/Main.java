package list.knixu;

import java.util.ArrayList;
import java.util.Stack;

import list.ListNode;

public class Main {
	public static void main(String[] args) {
		ListNode t1=new ListNode(3);
		ListNode t2=new ListNode(4);
		ListNode t3=new ListNode(5);
		ListNode t4=new ListNode(6);
		t1.next=t2;
		t2.next=t3;
		t3.next=t4;
		ListNode l=inverse(t1,4);
		while(l!=null){
			System.out.print(l.val);
			l=l.next;
		}
		
		
	}
	
	
    public static ListNode inverse(ListNode head, int k) {
    	ArrayList<ListNode> list = new ArrayList<ListNode>();
    	int i=0;
    	ListNode th =null;
    	ListNode tt =null;
    	ListNode next=null;
    	while(head!=null){
    		next=head.next;
    		head.next=null;
    		if(i%k==0){
    			if(i==0){
    				list.add(head);
    			}else{
    				if(i==k){
    					th=list.get(list.size()-1);
    					tt=th;
    					for(int j=list.size()-2;j>=0;j--){
    						tt.next=list.get(j);
    						tt=tt.next;
    					}
    				}else{
    					for(int j=list.size()-1;j>=0;j--){
    						tt.next=list.get(j);
    					    tt=tt.next;
    					    }
    					}
    				list.clear();
    				list.add(head);
    				}
    			}else{
    				list.add(head);
    			    }
    		head=next;
    		i++;
    		}
    	if(!list.isEmpty()){
    		
    		if(list.size()>=k){
    			if(tt!=null){
        			for(int j=list.size()-1;j>=0;j--){
        	      		tt.next=list.get(j);
                		tt=tt.next;
        			}
    			}else{
    				th=list.get(list.size()-1);
    				tt=th;
    				for(int j=list.size()-2;j>=0;j--){
    					tt.next=list.get(j);
    					tt=tt.next;
    				}
    			}

    			
    		}else{
    			if(tt!=null){
            		for(int j=0;j<list.size();j++){
                		tt.next=list.get(j);
                		tt=tt.next;
            		}
    			}else{
    				th=list.get(0);
    				tt=th;
    				for(int j=1;j<list.size();j++){
    					tt.next=list.get(j);
    					tt=tt.next;
    				}
    			}

        		
        		
    		}

    	}
    	
		return th;
    }
}
