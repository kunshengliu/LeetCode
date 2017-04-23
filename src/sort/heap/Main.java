package sort.heap;
/**
 * 堆排序,降序需要小顶堆，
 * @author liukunsheng
 *
 */
public class Main {
	public static void main(String[] args) {
		int i=0;
		int a[] ={5,4,9,8,7,6,0,1,3,10};
		myMinHeapSort(a);//
		for(i=0;i<a.length;i++){
			System.out.print(a[i]+",");
		}
	}
	/**
	 * 最小堆的排序
	 * @param array
	 */
	public static void myMinHeapSort(int[] array){
		int i;
		int len=array.length;//length=10;
		for(i=len/2-1;i>=0;i--){
			adjustMinHeap(array,i,len-1);//
		}
		for(i=len-1;i>=0;i--){
			int tmp = array[0];
			array[0]=array[i];
			array[i]=tmp;
			adjustMinHeap(array, 0, i-1);
		}
		
	}
	/**
	 * 调整最小堆
	 * @param a 数据
	 * @param pos
	 * @param len 需要调整0-len之间的数字
	 */
	private static void adjustMinHeap(int[] a, int pos, int len) {
		int temp;
		int child;
		for(temp=a[pos];2*pos+1<=len;pos=child){
			child=2*pos+1;//左孩子
			if(child<len&&a[child]>a[child+1]){
				child++;//
			}
			if(a[child]<temp){//孩子比父节点小。
				a[pos]=a[child];//如果小就交换。
			}else{
				break;
			}
		}
		a[pos]=temp;
	}
	
}
