package sort.maopao;
/** 
 * @author liukunsheng
 */
public class Main {
	public static void main(String[] args) {
		int[] s= new int[]{6,3,9,4,5,1};
		int[] ss=dowork(s);
		for(int i=0;i<ss.length;i++){
			System.out.print(ss[i]);
		}
	}
	public static int [] dowork(int[] s){
		for(int i=0;i<s.length-1;i++){
			for(int j=0;j<s.length-i-1;j++){
				if(s[j]>s[j+1]){
					int temp=s[j];
				    s[j]=s[j+1];
				    s[j+1]=temp;
				}
			}
		}
		return s;		
	}
}