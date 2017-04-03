package stack;

import java.util.Stack;

/**
 * 用栈模拟模式队列
 * @author liukunsheng
 *
 */
public class Main1 {
	public static void main(String[] args) {
		int [] i=new int[]{1,2,3,0,4,0};
		int[] j=twoStack(i,6);
		System.out.println(j);
	}
	 public static int[] twoStack(int[] ope, int n) {
	        Stack stack1 = new Stack();
	        Stack stack2 = new Stack();
	        int count = 0;
	        int[] result;
	        for(int i = 0; i < n; i++){
	            if(ope[i] != 0)
	                stack1.push(ope[i]);
	            else
	                count++;
	        }
	        result = new int[count];
	        while(!stack1.isEmpty()){
	            stack2.push(stack1.pop());
	        }
	        int i = 0;
	        while(count != 0){
	            result[i++] = (int)stack2.pop();
	            count--;
	        }
	        return result;
	    }
}
