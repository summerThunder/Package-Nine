package zeroOnepackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class ZeroOnePackageReverse {
	static int maxWeight=10;
	static int n=5;
	static int[] weight= {2,2,6,5,4};
	static int[] value= {6,3,5,4,6};
    //答案是15
	//倒序字典别忘了考虑nowWeight<=0的情况
	//倒序字典可以记录路径
	
	static int dp[]=new int[maxWeight+1];
 public static Map<Integer,LinkedList<Integer>> findMax(int nowWeight,int id) {
	 Map<Integer,LinkedList<Integer>> re=new HashMap<>();
	 if(id==-1) {
		 re.put(0, new LinkedList<Integer>());
	     return re;
	 }
	 else {
		 Map<Integer,LinkedList<Integer>> ans1=findMax(nowWeight,id-1);
		 if(nowWeight<=weight[id]) {
			 re.putAll(ans1);
			 return re;
		 }
		 Map<Integer,LinkedList<Integer>> ans2=findMax(nowWeight-weight[id],id-1);
		 int sum1=(int) ans1.keySet().toArray()[0];
		 int sum2=(int) ans2.keySet().toArray()[0];
		 try {
			 if(sum1>=sum2+value[id]) {
				 re.putAll(ans1);
				 return re;
			 }
			 else {
				 re.put(sum2+value[id],ans2.get(sum2));
				 re.get(sum2+value[id]).add(id);
				 return re;
			 }
		 }catch(Exception e) {
			 e.printStackTrace();
		 }finally {
			 ans1=null;
			 ans2=null;
		 }
		 
	 }
	return re;
 }
 public static void main(String[] args) {
	 
//		//weight填值
//		for(int i=0;i<n;i++) {
//			weight[i]=i+1;
//			value[i]=(int) Math.pow((double)i, 2)+1;
//		}
	 Map<Integer,LinkedList<Integer>> re=findMax(maxWeight,4);
	 int sum=(int) re.keySet().toArray()[0];
	 System.out.println(sum+":"+re.get(sum).toString());
		
		
		
}
}
