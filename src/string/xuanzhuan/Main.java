
package string.xuanzhuan;
/**
 * 字符串旋转
 * 1234的旋转词有2341,3412,4123
 * 
 * 
 * @author liukunsheng
 *
 */
public class Main {
	
	
	public static void main(String[] args) {
		String s1="RFSPUYLYR";
		String s2="RFSPUYLYR";
		System.out.println(dowork(s1, s2));
	}
	public static boolean dowork(String s1,String s2){
		if(s1.length()!=s1.length()){
			return false;
		}else{
			String sBig = s1+s1;
			for(int i=0;i<s1.length();i++){
				String temp=sBig.substring(i, s1.length()+i);
				if(temp.equals(s2)){
					return true;
				}
			}
			return false;
		}		
	}
	
}
