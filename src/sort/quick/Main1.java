package sort.quick;

public class Main1 {
	public static void main(String [] args){
		int A[] =new int[]{5,4,9,8,7,6,0,1,3,2};
		int a=A.length;
		int[] b = quickSort(A, a);
		for(int i=0;i<b.length;i++){
			System.out.print(i+",");
		}	
	}
	public static int[] quickSort(int [] A,int n){
		quick(A, 0, n-1);
		return A;
	}
	public static void quick(int [] A,int start,int end){
		int i=start;
		int j=end;
		if(i>=j){
			return;
		}
		int flag = A[start];
		while(i<j){
			while(i<j&&flag>A[j]){
				j--;
			}
			if(i<j){
				A[i]=A[j];
				i++;
			}
			while(i<j&&A[i]>flag){
				i++;
			}
			if(i<j){
				A[j]=A[i];
				j--;
			}
		}
		A[i] = flag;
		quick(A, start, i-1);
		quick(A, i+1, end);
	}
}
