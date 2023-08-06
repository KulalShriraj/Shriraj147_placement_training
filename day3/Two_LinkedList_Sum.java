package day3;

import java.util.*;

public class Two_LinkedList_Sum {

	public static LinkedList<Integer> ArraySum(int l1,int l2,int[] arr1,int[] arr2)
	{
		LinkedList<Integer> ll1=new LinkedList<>();
		LinkedList<Integer> ll2=new LinkedList<>();
		LinkedList<Integer> res=new LinkedList<>();
		for(int i=0;i<l1;i++)
			ll1.add(arr1[i]);
		for(int i=0;i<l2;i++)
			ll2.add(arr2[i]);
		int sum=0,carry=0;
		while(!ll1.isEmpty()||!ll2.isEmpty())
		{
			sum=0;
			sum+=(ll1.isEmpty()?0:ll1.removeFirst())+(ll2.isEmpty()?0:ll2.removeFirst())+carry;
			res.addFirst(sum%10);
			carry=sum/10;
		}
		if(carry!=0)
			res.addFirst(carry);
		return res;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int len1=sc.nextInt();
		int len2=sc.nextInt();
		int[] array1=new int[len1];
		int[] array2=new int[len2];
		for(int i=len1-1;i>=0;i--)
			array1[i]=sc.nextInt();
		for(int i=len2-1;i>=0;i--)
			array2[i]=sc.nextInt();
		LinkedList<Integer> sum=ArraySum(len1,len2,array1,array2);
		for(int i:sum)
			System.out.print(i+" ");
		
	}

}
