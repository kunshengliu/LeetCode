package string.nixu;
/**
 * 字符串逆序
 * 1234变成
 * 4321
 * @author liukunsheng
 *
 */
public class Main {
	public static void main(String[] args) {
		char [] s=new char[]{'1','2','3','4','5'};
		char [] ss=dowork(s);
		for(int i=0;i<ss.length;i++){
			System.out.print(ss[i]);
		}
	}
	public static char [] dowork(char [] s){
		if(s==null||s.length==1){
			return s;
		}
		int l=s.length/2;
		for(int i=0;i<l;i++){
			char temp=s[s.length-i-1];
			s[s.length-i-1]=s[i];
			s[i]=temp;
		}
		return s;
	}
}
