package zeroOnepackage;

import java.util.Arrays;


public class ZeroOnePackage {
   public static void main(String[] args) {
	//答案是15
	int maxWeight=10;
	int n=5;
	int[] weight={2,2,6,5,4};
	int[] value={6,3,5,4,6};
//	//weight填值
//	for(int i=0;i<n;i++) {
//		weight[i]=i+1;
//		value[i]=(int) Math.pow((double)i, 2)+1;
//	}
//	
	//初始状态全为0
	int dp[]=new int[maxWeight+1];
	
	
    
	int max=0;
	for(int i=0;i<n;i++) {
		for(int j=maxWeight;j>=weight[i];j--) {
			
			dp[j]=Math.max(dp[j], dp[j-weight[i]]+value[i]);
			System.out.println(Arrays.toString(dp));
			
	    }
    }
    // maxP不一定在dp[0],一定在dp[max+1]?
	for(int i=0;i<dp.length;i++) {
		if(dp[i]>max) {
			max=dp[i];
		}
	}
	System.out.println("最大值是"+max);
}
}
