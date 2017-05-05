package something.LRU;
/**
 * LRU算法实现
 * @author liukunsheng
 *
 */
public class Main {
	public static void main(String[] args) {
		int [] it = new int[]{4,7,0,7,1,0,1,2,1,2,6};
		int [] LRU = new int[]{-1,-1,-1,-1};
		int k=0;//标志
		for(int i=0;i<it.length;i++){
			if(k==4){
				boolean flag = false;
				for(int j=0;j<k;j++){
					if(LRU[j]==it[i]){
						flag =true;
						for(int m=j;m<k-1 ;m++){
							LRU[m]=LRU[m+1];
						}
						LRU[k-1]=it[i];
					}
				}
				if(flag==false){
					for(int m=0;m<k-1;m++){
						LRU[m]=LRU[m+1];
					}
					LRU[k-1]=it[i];
				}	
			}else{//k<=3
				boolean flag = false;//数组里面有没有这个页面
                for(int j=0;j<k;j++){
                	if(LRU[j]==it[i]){
                		flag=true;//里面有
                		for(int m=j;m<k-1;m++){
                			LRU[m]=LRU[m+1];
                		}
                		LRU[k-1]=it[i];
                		break;
                	}
                }
                if(flag==false){
                	LRU[k++]=it[i];
                }	
			}
			for(int m=0;m<4;m++){
				System.out.print(LRU[m]+" ");
			}
			System.out.println("");

		}	
	}
}
