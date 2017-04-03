package string.maxNochongfu;

import java.util.HashMap;

/**
 * 最大无重复字符串
 * 
 * 于一个字符串,请设计一个高效算法，找到字符串的最长无重复字符的子串长度。
 * 给定一个字符串A及它的长度n，请返回它的最长无重复字符子串长度。
 * 保证A中字符全部为小写英文字符，且长度小于等于500。测试样例："aabcb",5
 * @author liukunsheng
 *
 */
public class Main {
	
	public static void main(String[] args) {
		String str ="abcdcbefsa";
		System.out.println(maxlongsubString(str,8));
	}
	
    public static int longestSubstring(String A, int n) {
        if(A==null || n==0){
            return 0;
        }
        char[] chas=A.toCharArray();
        int[] map=new int[256];//256个字符：记录每种字符之前出现的位置
        for(int i=0;i<256;i++){
            map[i]=-1;
        }
        int len=0;
        int pre=-1;
        int cur=0;//当前字符为止的最长无重复字符串的长度
        for(int i=0;i<n;i++){
            pre=Math.max(pre, map[chas[i]]);
            cur=i-pre;
            len=Math.max(len, cur);
            map[chas[i]]=i;
        }
        return len;
    }
    
    public static int maxlongsubString(String A,int n){
    	char [] chars=A.toCharArray();//
    	//int [] map = new int[256];
    	HashMap<Character,Integer> map=new HashMap<>();
    	//初始化,记录上一次出现的位置默认值-1
    	for(int i=0;i<chars.length;i++){
    		map.put(chars[i], -1);
    	}
    	int len=0;
    	int pre=-1;//i-1位置上时，上一次出现这个字符的位置。
    	int cur=0;//当前字符上的最大无重复字符串长度
    	for(int i=0;i<chars.length;i++){
    		pre=Math.max(pre,map.get(chars[i]));
    		System.out.println("pre"+pre+":i:"+i);
    		cur=i-pre;//
    		System.out.println("cur"+cur);
    		len=Math.max(len, cur);
    		map.put(chars[i], i);
    	}
    	return len;
    }
 
}
