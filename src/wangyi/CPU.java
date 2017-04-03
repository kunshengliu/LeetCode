package wangyi;

import java.util.Arrays;
import java.util.Scanner;

public class CPU {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int [] nums =new int[n];
		for(int i=0;i<n;i++){
			nums[i]=sc.nextInt();
		}
		
		
		
		
	}
	public static int deal(int n,int [] nums){
		Arrays.sort(nums);
		int total=0;
		for(int i=0;i<n;i++){
			total+=nums[i];
		}
		int h=total;
		
		
		
		
		return n;
	}
	
	
}
