import java.util.*;
public class Min_Max {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
		for(int i=0;i<10;i++)
		{
			int input=sc.nextInt();
			if(input<min)
				min=input;
			else if(input>max)
				max=input;
		}
		System.out.println("Max : "+max+"\nMin : "+min);
		
	}

}
