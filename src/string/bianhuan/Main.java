package string.bianhuan;

import java.util.HashMap;
import java.util.Map.Entry;


/**
 *看两个字符串是否互为变形词
 *S1=123，S2=321 true
 *s1=123,S3=3221; fasle;
 * @author liukunsheng
 *
 */
public class Main {
	public static void main(String[] args) {
		String s1="s11";
		String s2="1s1";
		boolean b = dowork(s1, s2);
		System.out.println(b);
	}
	public static boolean dowork(String s1,String s2){
		char [] ss1=s1.toCharArray();
		char [] ss2=s2.toCharArray();
		if(ss1.length!=ss2.length){
			return false;
		}
		HashMap<Character,Integer> m1=new HashMap<>();
		HashMap<Character,Integer> m2=new HashMap<>();
		for(int i=0;i<ss1.length;i++){
			char tmp = ss1[i];
			Integer t=m1.get(tmp);
			System.err.println(t);
			if(t==null){
				m1.put(tmp, 1);
			}else{
				m1.put(tmp, t+1);
			}
		}
		for(int i=0;i<ss2.length;i++){
			//String s;
			//s.split(regex)
			char tmp = ss2[i];
			Integer t=m2.get(tmp);
			if(t==null){
				m2.put(tmp, 1);
			}else{
				m2.put(tmp, t+1);
			}
		}
		for(Entry<Character, Integer> mm:m1.entrySet()){
			Character key= mm.getKey();
			Integer  value=mm.getValue();
			Integer value2= m2.get(key);
			if(!value.equals(value2)){
				return false;
			}
			
		}	
		return true;
	}
}
