package day8;
import java.util.*;
public class Insertion_Sort {
	public static int[] sort(int[] arr)
	{	
		for(int i=1;i<arr.length;i++)
		{
			int key=arr[i];
			int j=i-1;
			while(j>=0 && key<arr[j])
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
		}
		return arr;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int[] arr=new int[num];
		for(int i=0;i<num;i++)
			arr[i]=sc.nextInt();
		arr=sort(arr);
		for(int i=0;i<num;i++)
			System.out.print(arr[i]+" ");
	}

}
