package dp.money;
/**
 * 跳台阶问题1,2台阶
 * @author liukunsheng
 *
 */
public class Main1 {
	public static void main(String[] args) {
		System.out.println(countWays(10));
		System.out.println(countWays1(10));
		System.out.println(countWays2(10));
		
	}
    public static int countWays(int n) {
        int [][] dp = new int[2][n+1];
        int []  bu = new int []{1,2};
        
        for(int i=0;i<n+1;i++){
            if(i%bu[0]==0){
                dp[0][i]=1;
            }
        }
        for(int i=0;i<2;i++){
            dp[i][0]=1;
        }
        for(int i=1;i<2;i++){
            for(int j=1;j<n+1;j++){
                for(int m=j;m>=0;m-=bu[i]){
                    dp[i][j]+=dp[i-1][m];
                }
            }
        }
        return dp[1][n];
    }
    public static int countWays1(int n) {
    	if (n<=0) {
			return 0;
		}
    	if(n==1){
    		return 1;
    	}
    	if(n==2){
    		return 2;
    	}
    	return countWays1(n-1)+countWays1(n-2);
    }
    public static int countWays2(int n){
    	//正确
    	if(n==1)
    		return 1;
    	if(n==2)
    		return 2;
    	int pre1= 1;
    	int pre2= 2;
    	int cur =0;
    	for(int i=3;i<n;i++){
    		cur = pre1+pre2;
    		pre1=pre2;
    		pre2=cur;
    	}
    	
    	return cur;
    }
    

    
    
    
    
    
    
}
