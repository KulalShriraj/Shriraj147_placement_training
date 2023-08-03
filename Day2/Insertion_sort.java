package day2;
import java.util.*;
public class Insertion_sort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int array[]=new int[n];
		for(int i=0;i<n;i++)
		{
			array[i]=sc.nextInt();
			int num=array[i];
			int j=i-1;
			while(j>=0 && array[j]>num)
			{
				array[j+1]=array[j];
				j--;
			}
			array[j+1]=num;
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(array[i]+" ");
		}
		
	}

}
