package string.nixu;
/**
 * 
对于一个字符串，请设计一个算法，只在字符串的单词间做逆序调整，也就是说，字符串由一些由空格分隔的部分组成，你需要将这些部分逆序。
给定一个原字符串A和他的长度，请返回逆序后的字符串。
测试样例：
"dog loves pig",13
返回："pig loves dog"
 * @author liukunsheng
 *
 */
public class Main1 {
	public static void main(String[] args) {
		String s="dog loves pig";
		System.out.println(reverseSentence(s, 1));
		
	}
    public static String reverseSentence(String A, int n) {
    	String [] strs=A.split(" ");
    	int len=strs.length;
    	for(int i=0;i<len/2;i++){
    		String temp=strs[i];
    		strs[i]=strs[len-1-i];
    		strs[len-i-1]=temp;
    	}
    	StringBuilder s= new StringBuilder();
    	for(int i=0;i<strs.length;i++){
    		s.append(strs[i]);
    		s.append(" ");
    	}
    	String ss=s.substring(0, s.length()-1);
		return ss;
    }
}
