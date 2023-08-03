package day2;
import java.util.*;

public class Nth_Prime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		n_prime(n);
		
	}
	public static void n_prime(int n)
	{
		int flag=0,count=0;
		int i=1;
		while(count<n)
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
				count++;
		}
		System.out.println(i);
	}

}
