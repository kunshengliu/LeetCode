package string.xuanzhuan;
/**
 * 把字符串按一个指定位置进行旋转
 * abcde,3
 * deabc
 * 时间复杂度为n，空间复杂度为i
 * @author liukunsheng
 *
 */
public class Main1 {
	public static void main(String[] args) {
		char [] s= new char[]{'A','B','C','D','E'};
		char [] ss= dowork(s, 3);
		for(int i=0;i<ss.length;i++){
			System.out.print(ss[i]);
		}
	}
	/**
	 * 先让前m个逆序交换，然后让后面的逆序交换，最后把所有的交换一遍。
	 * @param s
	 * @param m
	 * @return
	 */
	public static char [] dowork(char [] s,int m){
		int l1=m/2;
		for(int i=0;i<l1;i++){
			char temp = s[m-i-1];
			s[m-i-1]=s[i];
			s[i]=temp;
		}
		int l2=(s.length+m)/2;
		for(int i=m;i<l2;i++){
			char temp = s[s.length-(i-m)-1];
			s[s.length-(i-m)-1]=s[i];
			s[i]=temp;
		}
		int l3=s.length/2;
		for(int i=0;i<l3;i++){
			char temp=s[s.length-i-1];
			s[s.length-i-1]=s[i];
			s[i]=temp;
		}
	
		return s;
	}
	
	
}
