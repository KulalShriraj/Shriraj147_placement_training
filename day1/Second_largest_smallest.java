import java.util.*;
public class Second_largest_smallest {
//not proper
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int max=Integer.MIN_VALUE,smin=sc.nextInt(),smax = 0,min=Integer.MAX_VALUE;
		
		for(int i=0;i<9;i++)
		{
			int input=sc.nextInt();
			if(input<min)
			{
				smin=min;
				min=input;
				
			}
			else if(input>max)
			{
				smax=max;
				max=input;
			}
		}
		System.out.println("Max : "+max+"\nMin : "+min);
		System.out.println("Second Max : "+smax+"\n Second Min : "+smin);
		
	}

}
