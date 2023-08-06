package day2;
import java.util.*;
public class Prime_Number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		is_prime(number);
		
	}
	public static void is_prime(int n)
	{
		if(n==1||n==0)
		{
			System.out.println("Not a prime");
			System.exit(0);
		}
		int flag=0;
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				flag=1;
				break;
			}
		}
		if(flag==1)
			System.out.println("Not a prime number");
		else
			System.out.println("Is a prime number");
	}

}
