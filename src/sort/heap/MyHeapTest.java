package sort.heap;

public class MyHeapTest {
	public static void main(String[] args) {
		int i=0;
		int a[] ={5,4,9,8,7,6,0,1,3,10};
		nixusort(a);//
		for(i=0;i<a.length;i++){
			System.out.print(a[i]+",");
		}
	}
	
	public static void nixusort(int [] a){
		int length = a.length;
		for(int i=length/2-1;i>=0;i--){
			adjustHeap(a, length-1, i);
		}
		for(int i=length-1;i>0;i--){
			//交换
			int temp =a[0];
			a[0]=a[i];
			a[i]=temp;
			adjustHeap(a, i-1, 0);//			
		}	
	}
	public static void adjustHeap(int [] a,int len,int index){
		int temp ;//
		int child = 0;//子节点
		for(temp=a[index];index*2+1<len;index=child){
			child=index*2+1;//左孩子
			if(child<len&&a[child]>a[child+1]){
				child++;
			}
			if(temp>a[child]){
				a[index]=a[child];
			}else{
				break;
			}
		}
		a[index] = temp;
		
	}
}
