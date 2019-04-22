package completePackage;

import java.util.Arrays;

public class CompletePackage {
   //答案12
   static int maxWeight=10;
   static int n=4;
   static int[] weight= {7,4,3,2};
   static int[] value= {9,5,3,1};
   public static void main(String[] args) {
	int dp[]=new int[maxWeight+1];
	for(int i=0;i<n;i++) {
		for(int j=weight[i];j<=maxWeight;j++) {
			dp[j]=Math.max(dp[j], dp[j-weight[i]]+value[i]);
			System.out.println(Arrays.toString(dp));
		}
	}
	System.out.println("最大值："+dp[maxWeight]);
}
}
