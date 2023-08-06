package day3;

import java.util.*;
public class Two_Array_Sum {

	public static int[] ArraySum(int l1,int l2,int maxlen,int[] arr1,int[] arr2)
	{	
		int[] res=new int[maxlen];
		int sum=0,carry=0;
		for(int i=maxlen-1;i>=0;i--)
		{
				sum=carry+arr1[i]+arr2[i];
				res[i]=sum%10;
				carry=sum/10;
		}
		if(carry!=0)
		{
			int[] finalres=new int[maxlen+1];
			finalres[0]=carry;
			System.arraycopy(res, 0, finalres, 1, maxlen);
			return finalres;
		}
		return res;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int len1=sc.nextInt();
		int len2=sc.nextInt();
		int maxlen=Integer.max(len1, len2);
		int[] array1=new int[maxlen];
		int[] array2=new int[maxlen];
		for(int i=maxlen-len1;i<maxlen;i++)
			array1[i]=sc.nextInt();
		for(int i=maxlen-len2;i<maxlen;i++)
			array2[i]=sc.nextInt();
		int[] sum=ArraySum(len1,len2,maxlen,array1,array2);
		for(int i=0;i<sum.length;i++)
			System.out.print(sum[i]+" ");
		
	}

}
