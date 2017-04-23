package dp.O1pack;
/**
 * 
 * 0,1 背包问题。
 * 结题思路：dp[x][y] 代表当前X件商品，重量不超过y的时候最大的价值。
 * @author liukunsheng
 *
 */
public class Main {
    public int maxValue(int[] w, int[] v, int n, int cap) {
    	int [][] dp = new int[w.length][cap+1];
    	for(int i=0;i<=cap;i++){
    		if(w[0]<=i){
    			dp[0][i] = v[0];
    		}
    	}
    	
    	for(int i=1;i<w.length;i++){
    		for(int j=1;j<cap+1;j++){
    			int tmp1 = dp[i-1][j];
    			int tmp2=0;
    			if(j-w[i]>=0){
    				tmp2=dp[i-1][j-w[i]]+v[i];
    			}
    			dp[i][j]=Math.max(tmp1, tmp2);
    		}
    	}
    	return dp[w.length-1][cap];
    }
}
