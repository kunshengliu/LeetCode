package evaluate_reverse_polish_notation;

import java.util.Stack;

/**
 * 运算符都是用栈。
 * @author liukunsheng
 *
 */

public class Main {
	
	public static void main(String[] args) {
		
		
		String[] strings={"1","2","+","4","*"};
		int ss= evalRPN(strings);
		System.err.println(ss);
		
	}
	
	
	 public static int evalRPN(String[] tokens) {
		Stack<Integer> stack=new Stack<Integer>();
		for(int i=0;i<tokens.length;i++){
			String temp=tokens[i];
			if(temp.equals("+")||temp.equals("-")||temp.equals("*")||temp.equals("/")){
				int s;
				int s1= stack.pop();
				int s2=stack.pop();
				if(temp.equals("+")){
					s=s1+s2;
				}else if(temp.equals("-")){
					s=s2-s1;
				}else if(temp.equals("*")){
					s=s1*s2;
				}else{
					s=s2/s1;
				}
				stack.push(s);
			}else{
				stack.push(Integer.parseInt(temp));
			}

		}		 
		return stack.peek();       
	 }
	 public static int compute(int s1,int s2,String symbol){
		 int t;
		 switch (symbol) {
		case "+":
			t=s1+s2;
			break;
		case "-":
			t=s2-s1;
			break;
		case "*":
			t=s2*s1;
			break;
		default:
			t=s2/s1;
			break;
		}
		 return t;
	 }
	 
	 
	 
	 
}
