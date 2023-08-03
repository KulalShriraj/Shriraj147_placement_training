import java.io.*;
import java.util.*;
public class Count_of_Greater {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int count=1,max=sc.nextInt();
		for(int i=1;i<size;i++)
		{
			int input=sc.nextInt();
			if(input>max)
			{
				count++;
				max=input;
			}
		}
		System.out.println(count);
	}

}
