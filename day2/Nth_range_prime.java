package day2;
import java.util.*;
public class Nth_range_prime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int start=sc.nextInt();
		int end=sc.nextInt();
		n_prime(n,start,end);
		
	}
	public static void n_prime(int n,int start,int end)
	{
		int flag=0,count=0;
		int i=start-1;
		while(i<=end)
		{
			i++;
			flag=0;
			for(int j=2;j<=i/2;j++)
			{
				if(i%j==0)
				{
					flag=1;
					break;
				}
			}
		
			if(flag==0)
			{
				count++;
				if(count==n)
					break;
			}
		}
		System.out.println(i);
	}

}