package list.randomPointer;

import java.util.*;
public class Solution {
	
	public static void main(String[] args) {
		RandomListNode r1 =new RandomListNode(1);
		RandomListNode r2 =new RandomListNode(2);
		RandomListNode r3 =new RandomListNode(3);
		r1.next = r2;
		r2.next = r3;
		r1.random =r2;
		r2.random=r1;
		r3.random=r2;
		Clone(r1);
		
		
	}
	
    public static RandomListNode Clone(RandomListNode pHead)
    {
        if(pHead==null){
            return null;
        }
        
        RandomListNode temp =pHead;
        HashMap<RandomListNode,RandomListNode> map = new HashMap<RandomListNode,RandomListNode>(); 
        RandomListNode newHead =  new RandomListNode(pHead.label);
        
        RandomListNode newTmp =newHead;
        temp=temp.next;
        while(temp!=null){
            RandomListNode t = new RandomListNode(temp.label);
            map.put(temp,t);
            newTmp.next =t;
            newTmp=newTmp.next;
            temp =temp.next;
        }
        temp = pHead;
        newTmp=newHead;
        while(temp!=null){
            newTmp.random=map.get(temp.random);
            temp=temp.next;
            newTmp=newTmp.next;
        }
        return newHead;
    }
}