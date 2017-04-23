package dp.money;
/**
 * 动态规划的找零钱问题。
 * @author liukunsheng
 *
 */
public class Main {
	public static void main(String[] args) {
		int []  penny = new int []{1,2,4};
		int n =3;
		int  m =countWays(penny, 0, n);

	}	
    public static int countWays(int[] penny, int n, int aim) {
        int [][]  dp = new int [penny.length][aim+1];
        for(int i=0;i<aim+1;i++){
        	if(i%penny[0]==0){
        		dp[0][i]=1;
        	}
        }
        
        for(int i=0;i<penny.length;i++){
        	dp[i][0] =1;
        }
        
        for(int i=1;i<penny.length;i++){	
        	for(int j=1;j<aim+1;j++){
        		for(int m =j;m>=0;m-=penny[i]){
        			dp [i][j]+=dp[i-1][m];       			      			       			
        		}	
        	}	
        }
        return dp[penny.length-1][aim];
        
    }
}
