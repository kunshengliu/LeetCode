package list.randomPointer;

import java.util.HashMap;

/**
 * 定义一个新的链表，里面有一个随机指针，然后对链表进行深的复制
 * ：思路就是对网络中的新旧链表做一个映射，
 * @author liukunsheng
 *
 */
public class Main {
    public RandomListNode copyRandomList(RandomListNode head) {
		if(head==null)
			return head;
		
		RandomListNode headCopy = new RandomListNode(head.label);
		RandomListNode headCopyTemp;
		headCopyTemp=headCopy;
		
    	RandomListNode tempHead=head;
    	HashMap<RandomListNode,RandomListNode> map= new HashMap<>();
    	//旧节点到新节点的映射
    	map.put(head, headCopy);
    	tempHead=tempHead.next;
		while(tempHead!=null){
			RandomListNode newNode = new RandomListNode(tempHead.label);
			headCopyTemp.next=newNode;
			map.put(tempHead, newNode);
			tempHead=tempHead.next;
			headCopyTemp=headCopyTemp.next;
		}
		tempHead=head;
		headCopyTemp=headCopy;
		while(tempHead!=null){
			headCopyTemp.random=map.get(tempHead.random);
			tempHead=tempHead.next;
			headCopyTemp=headCopyTemp.next;
		}
		return headCopy;    
    }
}
