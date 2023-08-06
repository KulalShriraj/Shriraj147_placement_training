import java.io.*;
import java.util.*;
public class Pallindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		int num_copy=number;
		int reverse=0;
		while(number!=0)
		{
			int remainder=number%10;
			reverse=reverse*10+remainder;
			number=number/10;
		}
		if(num_copy==reverse)
			System.out.println(num_copy+" is a pallindrome");
		else
			System.out.println(num_copy+" is not a pallindrome");
	}

}
