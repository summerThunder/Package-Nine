package multiplePackage;

public class MultiplePackageFeasible {
	//答案400
   static int maxWeight=8;
   static int n=2;
   static int weight[]= {2,4};
   static int value[]= {100,100};
   static int num[]= {4,2};
   
   //多重背包可行性才有O(VN)的解法
   public static void main(String[] args) {
	int dp[]=new int[maxWeight+1];
   //不可行为-1
	for(int i:dp) {
		i=-1;
	}
	
}
}
